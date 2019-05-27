package com.guigu.yaopin.hjh.entity;

public class Drugtype {
    private Integer typeid;

    private String typename;

    public Integer getTypeid() {
        return typeid;
    }

    @Override
    public String toString() {
        return "Drugtype{" +
                "typeid=" + typeid +
                ", typename='" + typename + '\'' +
                '}';
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

}