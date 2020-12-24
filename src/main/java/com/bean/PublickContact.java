package com.bean;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * @author:智霸霸
 * @Date 2020/7/7
 */
public class PublickContact {
    private String id;
    private String fk_id;
    private String country_code;
    private String project_principal;
    private String project_principal_phone;
    private String project_principal_job;
    private String project_principal_email;
    private String project_principal_qq;
    private String project_principal_wechat;
    private String project_contact;
    private String project_contact_phone;
    private String project_contact_email;
    private String project_contact_qq;
    private String project_contact_wechat;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date create_time;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date updatetime;

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }
    @JsonProperty("FK_ID")
    public void setFk_id(String fk_id) {
        this.fk_id = fk_id;
    }
    @JsonProperty("COUNTRY_CODE")
    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }
    @JsonProperty("PROJECT_PRINCIPAL")
    public void setProject_principal(String project_principal) {
        this.project_principal = project_principal;
    }
    @JsonProperty("PROJECT_PRINCIPAL_PHONE")
    public void setProject_principal_phone(String project_principal_phone) {
        this.project_principal_phone = project_principal_phone;
    }
    @JsonProperty("PROJECT_PRINCIPAL_JOB")
    public void setProject_principal_job(String project_principal_job) {
        this.project_principal_job = project_principal_job;
    }
    @JsonProperty("PROJECT_PRINCIPAL_EMAIL")
    public void setProject_principal_email(String project_principal_email) {
        this.project_principal_email = project_principal_email;
    }
    @JsonProperty("PROJECT_PRINCIPAL_QQ")
    public void setProject_principal_qq(String project_principal_qq) {
        this.project_principal_qq = project_principal_qq;
    }
    @JsonProperty("PROJECT_PRINCIPAL_WECHAT")
    public void setProject_principal_wechat(String project_principal_wechat) {
        this.project_principal_wechat = project_principal_wechat;
    }
    @JsonProperty("PROJECT_CONTACT")
    public void setProject_contact(String project_contact) {
        this.project_contact = project_contact;
    }
    @JsonProperty("PROJECT_CONTACT_PHONE")
    public void setProject_contact_phone(String project_contact_phone) {
        this.project_contact_phone = project_contact_phone;
    }
    @JsonProperty("PROJECT_CONTACT_EMAIL")
    public void setProject_contact_email(String project_contuact_email) {
        this.project_contact_email = project_contuact_email;
    }
    @JsonProperty("PROJECT_CONTACT_QQ")
    public void setProject_contact_qq(String project_contact_qq) {
        this.project_contact_qq = project_contact_qq;
    }
    @JsonProperty("PROJECT_CONTACT_WECHAT")
    public void setProject_contact_wechat(String project_contact_wechat) {
        this.project_contact_wechat = project_contact_wechat;
    }
    @JsonProperty("CREATE_TIME")
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
    @JsonProperty("UPDATETIME")
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getId() {
        return id;
    }

    public String getFk_id() {
        return fk_id;
    }

    public String getCountry_code() {
        return country_code;
    }

    public String getProject_principal() {
        return project_principal;
    }

    public String getProject_principal_phone() {
        return project_principal_phone;
    }

    public String getProject_principal_job() {
        return project_principal_job;
    }

    public String getProject_principal_email() {
        return project_principal_email;
    }

    public String getProject_principal_qq() {
        return project_principal_qq;
    }

    public String getProject_principal_wechat() {
        return project_principal_wechat;
    }

    public String getProject_contact() {
        return project_contact;
    }

    public String getProject_contact_phone() {
        return project_contact_phone;
    }

    public String getProject_contact_email() {
        return project_contact_email;
    }

    public String getProject_contact_qq() {
        return project_contact_qq;
    }

    public String getProject_contact_wechat() {
        return project_contact_wechat;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public Date getUpdatetime() {
        return updatetime;
    }
}
