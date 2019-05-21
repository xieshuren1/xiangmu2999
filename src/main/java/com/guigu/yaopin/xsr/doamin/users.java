package com.guigu.yaopin.xsr.doamin;

public class users {
    private int userid;
    private String username;
    private String passwordm;
    private int jid;
    private String juesename;

    public users(int userid, String username, String passwordm, int jid, String juesename) {
        this.userid = userid;
        this.username = username;
        this.passwordm = passwordm;
        this.jid = jid;
        this.juesename = juesename;
    }

    public users() {
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordm() {
        return passwordm;
    }

    public void setPasswordm(String passwordm) {
        this.passwordm = passwordm;
    }

    public int getJid() {
        return jid;
    }

    public void setJid(int jid) {
        this.jid = jid;
    }

    public String getJuesename() {
        return juesename;
    }

    public void setJuesename(String juesename) {
        this.juesename = juesename;
    }

    @Override
    public String toString() {
        return "users{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", passwordm='" + passwordm + '\'' +
                ", jid=" + jid +
                ", juesename='" + juesename + '\'' +
                '}';
    }


}
