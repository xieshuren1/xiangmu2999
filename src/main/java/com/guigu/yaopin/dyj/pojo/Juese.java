package com.guigu.yaopin.dyj.pojo;

public class Juese {
    private Integer jid;

    private String juesename;

    private String quanxian;

    public Integer getJid() {
        return jid;
    }

    public void setJid(Integer jid) {
        this.jid = jid;
    }

    public String getJuesename() {
        return juesename;
    }

    public void setJuesename(String juesename) {
        this.juesename = juesename == null ? null : juesename.trim();
    }

    public String getQuanxian() {
        return quanxian;
    }

    public void setQuanxian(String quanxian) {
        this.quanxian = quanxian == null ? null : quanxian.trim();
    }
}