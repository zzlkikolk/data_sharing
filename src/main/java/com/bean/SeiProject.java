package com.bean;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * @author:智霸霸
 * @Date 2020/7/7
 */
public class SeiProject {
    private String id;
    private String project_name;
    private String country_code;
    private String company_name;
    private Integer industry_type;
    private String industry_project_type;
    private String support_type;
    private Double financial_equity_invest_amount;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date begin_date;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date end_date;
    private String project_introduction;
    private String projrct_build_aim;
    private String project_content;
    private String loan_deadline;
    private Double total_invest;
    private Double apply_fund;
    private Double approval_fund;
    private Double review_score;
    private Double loan_amount;
    private String loan_and_guarantee;
    private Double approved_loan_interest;
    private Double approved_guarantee_fee;
    private Integer bank_commitment_flag;
    private String funds_apply_report;
    private String support_batch;
    private Integer accept_flag;
    private Integer apply_year;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date create_time;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date updatetime;

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
    @JsonProperty("COMPANY_NAME")
    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }
    @JsonProperty("INDUSTRY_TYPE")
    public void setIndustry_type(Integer industry_type) {
        this.industry_type = industry_type;
    }
    @JsonProperty("INDUSTRY_PROJECT_TYPE")
    public void setIndustry_project_type(String industry_project_type) {
        this.industry_project_type = industry_project_type;
    }
    @JsonProperty("SUPPORT_TYPE")
    public void setSupport_type(String support_type) {
        this.support_type = support_type;
    }
    @JsonProperty("FINANCIAL_EQUITY_INVEST_AMOUNT")
    public void setFinancial_equity_invest_amount(Double financial_equity_invest_amount) {
        this.financial_equity_invest_amount = financial_equity_invest_amount;
    }
    @JsonProperty("BEGIN_DATE")
    public void setBegin_date(Date begin_date) {
        this.begin_date = begin_date;
    }
    @JsonProperty("END_DATE")
    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }
    @JsonProperty("PROJECT_INTRODUCTION")
    public void setProject_introduction(String project_introduction) {
        this.project_introduction = project_introduction;
    }
    @JsonProperty("PROJRCT_BUILD_AIM")
    public void setProjrct_build_aim(String projrct_build_aim) {
        this.projrct_build_aim = projrct_build_aim;
    }
    @JsonProperty("PROJECT_CONTENT")
    public void setProject_content(String project_content) {
        this.project_content = project_content;
    }
    @JsonProperty("LOAN_DEADLINE")
    public void setLoan_deadline(String loan_deadline) {
        this.loan_deadline = loan_deadline;
    }
    @JsonProperty("TOTAL_INVEST")
    public void setTotal_invest(Double total_invest) {
        this.total_invest = total_invest;
    }
    @JsonProperty("APPLY_FUND")
    public void setApply_fund(Double apply_fund) {
        this.apply_fund = apply_fund;
    }
    @JsonProperty("APPROVAL_FUND")
    public void setApproval_fund(Double approval_fund) {
        this.approval_fund = approval_fund;
    }
    @JsonProperty("REVIEW_SCORE")
    public void setReview_score(Double review_score) {
        this.review_score = review_score;
    }
    @JsonProperty("LOAN_AMOUNT")
    public void setLoan_amount(Double loan_amount) {
        this.loan_amount = loan_amount;
    }
    @JsonProperty("LOAN_AND_GUARANTEE")
    public void setLoan_and_guarantee(String loan_and_guarantee) {
        this.loan_and_guarantee = loan_and_guarantee;
    }
    @JsonProperty("APPROVED_LOAN_INTEREST")
    public void setApproved_loan_interest(Double approved_loan_interest) {
        this.approved_loan_interest = approved_loan_interest;
    }
    @JsonProperty("APPROVED_GUARANTEE_FEE")
    public void setApproved_guarantee_fee(Double approved_guarantee_fee) {
        this.approved_guarantee_fee = approved_guarantee_fee;
    }
    @JsonProperty("BANK_COMMITMENT_FLAG")
    public void setBank_commitment_flag(Integer bank_commitment_flag) {
        this.bank_commitment_flag = bank_commitment_flag;
    }
    @JsonProperty("FUNDS_APPLY_REPORT")
    public void setFunds_apply_report(String funds_apply_report) {
        this.funds_apply_report = funds_apply_report;
    }
    @JsonProperty("SUPPORT_BATCH")
    public void setSupport_batch(String support_batch) {
        this.support_batch = support_batch;
    }
    @JsonProperty("ACCEPT_FLAG")
    public void setAccept_flag(Integer accept_flag) {
        this.accept_flag = accept_flag;
    }
    @JsonProperty("APPLY_YEAR")
    public void setApply_year(Integer apply_year) {
        this.apply_year = apply_year;
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

    public String getProject_name() {
        return project_name;
    }

    public String getCountry_code() {
        return country_code;
    }

    public String getCompany_name() {
        return company_name;
    }

    public Integer getIndustry_type() {
        return industry_type;
    }

    public String getIndustry_project_type() {
        return industry_project_type;
    }

    public String getSupport_type() {
        return support_type;
    }

    public Double getFinancial_equity_invest_amount() {
        return financial_equity_invest_amount;
    }

    public Date getBegin_date() {
        return begin_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public String getProject_introduction() {
        return project_introduction;
    }

    public String getProjrct_build_aim() {
        return projrct_build_aim;
    }

    public String getProject_content() {
        return project_content;
    }

    public String getLoan_deadline() {
        return loan_deadline;
    }

    public Double getTotal_invest() {
        return total_invest;
    }

    public Double getApply_fund() {
        return apply_fund;
    }

    public Double getApproval_fund() {
        return approval_fund;
    }

    public Double getReview_score() {
        return review_score;
    }

    public Double getLoan_amount() {
        return loan_amount;
    }

    public String getLoan_and_guarantee() {
        return loan_and_guarantee;
    }

    public Double getApproved_loan_interest() {
        return approved_loan_interest;
    }

    public Double getApproved_guarantee_fee() {
        return approved_guarantee_fee;
    }

    public Integer getBank_commitment_flag() {
        return bank_commitment_flag;
    }

    public String getFunds_apply_report() {
        return funds_apply_report;
    }

    public String getSupport_batch() {
        return support_batch;
    }

    public Integer getAccept_flag() {
        return accept_flag;
    }

    public Integer getApply_year() {
        return apply_year;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public Date getUpdatetime() {
        return updatetime;
    }
}
