package com.service;

import com.bean.InvestProjectPlan;
import com.dao.InvestProjectPlanDao;
import com.model.DataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:智霸霸
 * @Date 2020/7/9
 */
@Service
public class InvestProjectPlanService {
        @Autowired
        private InvestProjectPlanDao investProjectPlanDao;
        public DataResult returnData(String todaytime,String pageIndex){
            DataResult dataResult=new DataResult();
            try{
                    List<InvestProjectPlan> investProjectPlans = investProjectPlanDao.getInvestProjectPlan(todaytime);
                    List<InvestProjectPlan> indexList;
                    int pagein = Integer.parseInt(pageIndex);
                    if (investProjectPlans.size() > 0) {
                        int indexp;
                        if (investProjectPlans.size() % 100 == 0)
                            indexp = investProjectPlans.size() / 100;
                        else
                            indexp = investProjectPlans.size() / 100 + 1;

                        if (pagein < indexp)
                            indexList = investProjectPlans.subList(pagein * 100 - 100, pagein * 100);
                        else if (pagein == indexp)
                            indexList = investProjectPlans.subList(pagein * 100 - 100, investProjectPlans.size());
                        else
                            throw new Exception("indexOut");
                        dataResult.setResultData(indexList);
                        dataResult.setTotalPage(indexp);
                        dataResult.setResultMsg("查询成功");
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
        public DataResult getData(String year,String projectName,String companyName){
            Integer ye=0;
            DataResult dataResult=new DataResult();
            try {
                if(year!=null)
                    ye=Integer.parseInt(year);
                    List<InvestProjectPlan> investProjectPlans=investProjectPlanDao.getInvestProjectPlanByArgs(ye,projectName,companyName);
                    if(investProjectPlans.size()==0){
                        dataResult.setResultMsg("获取失败");
                        dataResult.setResultCode(-1);
                        dataResult.setResultData(null);
                    }else {
                        dataResult.setResultMsg("查询成功");
                        dataResult.setResultCode(1);
                        dataResult.setResultData(investProjectPlans);
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
