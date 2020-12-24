package com.dao;

import com.bean.PublickContact;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author:智霸霸
 * @Date 2020/7/7
 */
public interface PublickContactDao {
    //根据时间获取数据
    List<PublickContact> getPublickContact(@Param("todaytime") String todaytime);
    //获取数据总量
    int getCount();
    List<PublickContact> getPublicContactByArgs(@Param("projectPrincipal") String projectPrincipal,@Param("projectPrincipalPhone") String projectPrincipalPhone,@Param("projectContact") String projectContact,@Param("projectContactPhone") String projectContactPhone);
}
