package com.bean;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * @author:智霸霸
 * @Date 2020/7/6
 */
public class Govproject {
    private String id;
    private String project_name;
    private String country_code;
    private Integer total_invest;
    private String address_code;
    private String company_name;
    private String address_detail;
    private String project_content;
    private String project_necessary;
    private Integer industry_code;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date begin_date;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date end_date;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date create_time;

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("PROJECT_NAME")
    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }
    @JsonProperty("COUNTRY_CODE")
    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }
    @JsonProperty("TOTAL_INVEST")
    public void setTotal_invest(Integer total_invest) {
        this.total_invest = total_invest;
    }
    @JsonProperty("ADDRESS_CODE")
    public void setAddress_code(String address_code) {
        this.address_code = address_code;
    }
    @JsonProperty("COMPANY_NAME")
    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }
    @JsonProperty("ADDRESS_DETAIL")
    public void setAddress_detail(String address_detail) {
        this.address_detail = address_detail;
    }
    @JsonProperty("PROJECT_CONTENT")
    public void setProject_content(String project_content) {
        this.project_content = project_content;
    }
    @JsonProperty("PROJECT_NECESSARY")
    public void setProject_necessary(String project_necessary) {
        this.project_necessary = project_necessary;
    }
    @JsonProperty("INDUSTRY_CODE")
    public void setIndustry_code(Integer industry_code) {
        this.industry_code = industry_code;
    }
    @JsonProperty("BEGIN_DATE")
    public void setBegin_date(Date begin_date) {
        this.begin_date = begin_date;
    }
    @JsonProperty("END_DATE")
    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }
    @JsonProperty("CREATE_TIME")
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getId() {
        return id;
    }

    public String getProject_name() {
        return project_name;
    }

    public String getCountry_code() {
        return country_code;
    }

    public Integer getTotal_invest() {
        return total_invest;
    }

    public String getAddress_code() {
        return address_code;
    }

    public String getCompany_name() {
        return company_name;
    }

    public String getAddress_detail() {
        return address_detail;
    }

    public String getProject_content() {
        return project_content;
    }

    public String getProject_necessary() {
        return project_necessary;
    }

    public Integer getIndustry_code() {
        return industry_code;
    }

    public Date getBegin_date() {
        return begin_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public Date getCreate_time() {
        return create_time;
    }
}
