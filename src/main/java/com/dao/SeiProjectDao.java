package com.dao;

import com.bean.SeiProject;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author:智霸霸
 * @Date 2020/7/7
 */
public interface SeiProjectDao {
    //根据时间获取
    List<SeiProject> getSeiProject(@Param("todaytime") String todaytime);
    //获取数据总量
    int getCount();
    List<SeiProject> getSeiProjectByArgs(@Param("projectName") String projectName,@Param("applyYear") int applyYear);
}
