package com.service;

import com.bean.Govproject;
import com.dao.GovprojectDao;
import com.model.DataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:智霸霸
 * @Date 2020/7/9
 */
@Service
public class GovProjectService {
    @Autowired
    private GovprojectDao govprojectDao;
    public DataResult returnGovproject(String todaytime,String pageIndex){
        DataResult dataResult=new DataResult();
        try{
                /*
                    查询条件非空就调用查询数据方法getobjectByCode
                 */
                    List<Govproject> govprojectList = govprojectDao.getObjectByCode(todaytime);
                    List<Govproject> indexList;
                    int pagein = Integer.parseInt(pageIndex);
                    if (govprojectList.size() > 0) {
                        int indexp;
                        if (govprojectList.size() % 100 == 0)
                            indexp = govprojectList.size() / 100;
                        else
                            indexp = govprojectList.size() / 100 + 1;

                        if (pagein < indexp)
                            indexList = govprojectList.subList(pagein * 100 - 100, pagein * 100);
                        else if (pagein == indexp)
                            indexList = govprojectList.subList(pagein * 100 - 100, govprojectList.size());
                        else
                            throw new Exception("indexOut");

                        dataResult.setResultData(indexList);
                        dataResult.setTotalPage(indexp);
                        dataResult.setResultMsg("查询成功");
                        dataResult.setResultCode(1);
                    } else {
                        dataResult.setTotalPage(0);
                        dataResult.setResultMsg("获取失败");
                        dataResult.setResultData(null);
                        dataResult.setResultCode(-1);
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
    public DataResult getGovproject(String projectName,String companyName){
        DataResult dataResult=new DataResult();
        try {
               List<Govproject> govprojects= govprojectDao.getObjectByArgs(projectName,companyName);
               if(govprojects.size()==0){
                   dataResult.setResultData(null);
                   dataResult.setResultCode(-1);
                   dataResult.setResultMsg("获取失败");
               }else {
                   dataResult.setResultData(govprojects);
                   dataResult.setResultCode(1);
                   dataResult.setResultMsg("查询成功");
               }
        }catch (Exception e){
            e.printStackTrace();
            dataResult.setTotalPage(0);
            dataResult.setResultMsg("获取失败");
            dataResult.setResultData(null);
            dataResult.setResultCode(-1);
        }
        return dataResult;
    }
}
