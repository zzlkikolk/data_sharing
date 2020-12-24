package com.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author:智霸霸
 * @Date 2020/8/11
 */
public class DataCount {
    private int govproject;
    private int Investprojectplan;
    private int publiccontact;
    private int selproject;

    public int getGovproject() {
        return govproject;
    }

    @JsonProperty("政府投资项目数")
    public void setGovproject(int govproject) {
        this.govproject = govproject;
    }

    public int getInvestprojectplan() {
        return Investprojectplan;
    }

    @JsonProperty("重大项目年度投资计划")
    public void setInvestprojectplan(int investprojectplan) {
        Investprojectplan = investprojectplan;
    }

    public int getPubliccontact() {
        return publiccontact;
    }

    @JsonProperty("项目联系人信息")
    public void setPubliccontact(int publiccontact) {
        this.publiccontact = publiccontact;
    }

    public int getSelproject() {
        return selproject;
    }
    @JsonProperty("战略性新兴产业项目信息")
    public void setSelproject(int selproject) {
        this.selproject = selproject;
    }
}
