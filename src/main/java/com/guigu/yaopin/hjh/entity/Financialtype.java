package com.guigu.yaopin.hjh.entity;

public class Financialtype {
    private Integer ftypeid;

    private String ftypename;

    public Integer getFtypeid() {
        return ftypeid;
    }

    public void setFtypeid(Integer ftypeid) {
        this.ftypeid = ftypeid;
    }

    public String getFtypename() {
        return ftypename;
    }

    public void setFtypename(String ftypename) {
        this.ftypename = ftypename == null ? null : ftypename.trim();
    }
}