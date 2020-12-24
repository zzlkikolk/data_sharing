package com.bean;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * @author:智霸霸
 * @Date 2020/7/7
 */
public class InvestProjectPlan {

    private String id;
    private Integer year;
    private String country_code;
    private String project_name;
    private String company_name;
    private String industry_code;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private String begin_date;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private String end_date;

    private Double total_invest;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private String create_time;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private String updatetime;

    public String getID() {
        return id;
    }
    @JsonProperty("ID")
    public void setID(String id) {
        this.id = id;
    }

    public Integer getYEAR() {
        return year;
    }
    @JsonProperty("YEAR")
    public void setYEAR(Integer year) {
        this.year = year;
    }

    public String getCOUNTRY_CODE() {
        return country_code;
    }
    @JsonProperty("COUNTRY_CODE")
    public void setCOUNTRY_CODE(String country_code) {
        this.country_code = country_code;
    }

    public String getPROJECT_NAME() {
        return project_name;
    }
    @JsonProperty("PROJECT_NAME")
    public void setPROJECT_NAME(String project_name) {
        this.project_name = project_name;
    }

    public String getCOMPANY_NAME() {
        return company_name;
    }
    @JsonProperty("COMPANY_NAME")
    public void setCOMPANY_NAME(String company_name) {
        this.company_name = company_name;
    }

    public String getINDUSTRY_CODE() {
        return industry_code;
    }
    @JsonProperty("INDUSTRY_CODE")
    public void setINDUSTRY_CODE(String industry_code) {
        this.industry_code = industry_code;
    }

    public Double getTOTAL_INVEST() {
        return total_invest;
    }
    @JsonProperty("TOTAL_INVEST")
    public void setTOTAL_INVEST(Double total_invest) {
        this.total_invest = total_invest;
    }

    public String getBegin_date() {
        return begin_date;
    }
    @JsonProperty("BEGIN_DATE")
    public void setBegin_date(String begin_date) {
        this.begin_date = begin_date;
    }

    public String getEnd_date() {
        return end_date;
    }
    @JsonProperty("END_DATE")
    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String getCreate_time() {
        return create_time;
    }
    @JsonProperty("CREATE_TIME")
    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getUpdatetime() {
        return updatetime;
    }
    @JsonProperty("UPDATETIME")
    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }
}
