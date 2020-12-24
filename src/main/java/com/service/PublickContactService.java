package com.service;

import com.bean.PublickContact;
import com.dao.PublickContactDao;
import com.model.DataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

/**
 * @author:智霸霸
 * @Date 2020/7/9
 */
@Service
public class PublickContactService {
    @Autowired
    private PublickContactDao publickContactDao;
    public DataResult returnPublickContact(String todaytime,String pageIndex){
        DataResult dataResult=new DataResult();
        try{
                List<PublickContact> indexList;
                int pagein = Integer.parseInt(pageIndex);
                List<PublickContact> publickContacts = publickContactDao.getPublickContact(todaytime);
                if (publickContacts.size() > 0) {
                    int indexp;
                    if (publickContacts.size() % 100 == 0)
                        indexp = publickContacts.size() / 100;
                    else
                        indexp = publickContacts.size() / 100 + 1;

                    if (pagein < indexp)
                        indexList = publickContacts.subList(pagein * 100 - 100, pagein * 100);
                    else if (pagein == indexp)
                        indexList = publickContacts.subList(pagein * 100 - 100, publickContacts.size());
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
    public DataResult getData(String projectPrincipal,String projectPrincipalPhone,String projectContact,String projectContactPhone){
        DataResult dataResult=new DataResult();
        try{
            List<PublickContact> publickContacts=publickContactDao.getPublicContactByArgs(projectPrincipal,projectPrincipalPhone,projectContact,projectContactPhone);
            if (publickContacts.size()==0){
                dataResult.setResultData(null);
                dataResult.setResultCode(-1);
                dataResult.setResultMsg("获取失败");
            }else {
                dataResult.setResultMsg("查询成功");
                dataResult.setResultCode(1);
                dataResult.setResultData(publickContacts);
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
