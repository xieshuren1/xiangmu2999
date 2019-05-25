package com.guigu.yaopin.hjh.entity;

public class Payment {
    private Integer pid;

    private String ptype;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype == null ? null : ptype.trim();
    }
}