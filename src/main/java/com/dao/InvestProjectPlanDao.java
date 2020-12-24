package com.dao;

import com.bean.InvestProjectPlan;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author:智霸霸
 * @Date 2020/7/7
 */
public interface InvestProjectPlanDao {
    //根据时间获取数据
    List<InvestProjectPlan> getInvestProjectPlan(@Param("todaytime") String todaytime);
    //获取数据总量
    int getCount();
    List<InvestProjectPlan> getInvestProjectPlanByArgs(@Param("year") int year,@Param("projectName") String projectName,@Param("companyName") String  companyName);
}
