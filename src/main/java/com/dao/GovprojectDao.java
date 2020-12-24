package com.dao;

import com.bean.Govproject;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author:智霸霸
 * @Date 2020/7/6
 */
public interface GovprojectDao {
    //根据时间获取数据
    List<Govproject> getObjectByCode(@Param("todaytime") String todaytime);
    //获取数据总量
    int getCount();
    List<Govproject> getObjectByArgs(@Param("projectName")String projectName,@Param("companyName") String companyName);
}
