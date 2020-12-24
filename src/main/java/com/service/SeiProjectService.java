package com.service;

import com.bean.SeiProject;
import com.dao.SeiProjectDao;
import com.model.DataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:智霸霸
 * @Date 2020/7/9
 */
@Service
public class SeiProjectService {

    @Autowired
    private SeiProjectDao seiProjectDao;
    public DataResult returnSeiProject(String todaytime,String pageIndex){
        DataResult dataResult=new DataResult();
        try{
                List<SeiProject> indexList;
                int pagein = Integer.parseInt(pageIndex);
                List<SeiProject> seiProjects = seiProjectDao.getSeiProject(todaytime);
                if (seiProjects.size() > 0) {
                    int indexp;
                    if (seiProjects.size() % 100 == 0)
                        indexp = seiProjects.size() / 100;
                    else
                        indexp = seiProjects.size() / 100 + 1;

                    if (pagein < indexp)
                        indexList = seiProjects.subList(pagein * 100 - 100, pagein * 100);
                    else if (pagein == indexp)
                        indexList = seiProjects.subList(pagein * 100 - 100, seiProjects.size());
                    else
                        throw new Exception("indexOut");
                    dataResult.setResultData(indexList);
                    dataResult.setTotalPage(indexp);
                    dataResult.setResultMsg("success");
                    dataResult.setResultCode(1);
                } else {
                    dataResult.setTotalPage(0);
                    dataResult.setResultMsg("Data is null");
                    dataResult.setResultData(null);
                    dataResult.setResultCode(-1);
                }
        }catch (Exception e){
            dataResult.setTotalPage(0);
            dataResult.setResultData(null);
            dataResult.setResultCode(-1);
            dataResult.setResultMsg("获取失败");
        }
        return dataResult;
    }
    public DataResult getData(String projectName,String applyYear){
        Integer year=0;
        DataResult dataResult=new DataResult();
        try{
            if(applyYear!=null&&!"".equals(applyYear))
                year=Integer.parseInt(applyYear);
            List<SeiProject> seiProjects=seiProjectDao.getSeiProjectByArgs(projectName,year);
            if(seiProjects.size()==0){
                dataResult.setResultMsg("获取失败");
                dataResult.setResultCode(-1);
                dataResult.setResultData(null);
            }else {
                dataResult.setResultData(seiProjects);
                dataResult.setResultCode(1);
                dataResult.setResultMsg("查询成功");
            }
        }catch (Exception e){
            e.printStackTrace();
            dataResult.setTotalPage(0);
            dataResult.setResultData(null);
            dataResult.setResultCode(-1);
            dataResult.setResultMsg("获取失败");
        }
        return dataResult;
    }
}
