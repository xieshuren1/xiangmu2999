package com.guigu.yaopin.dyj.pojo;

public class Users {
    private Integer userid;

    private String username;

    private String passwordm;

    private Integer jid;
    private Emp e;
    private Juese j;
    
    public Juese getJ() {
		return j;
	}

	public void setJ(Juese j) {
		this.j = j;
	}

	public Emp getE() {
		return e;
	}

	public void setE(Emp e) {
		this.e = e;
	}

	public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPasswordm() {
        return passwordm;
    }

    public void setPasswordm(String passwordm) {
        this.passwordm = passwordm == null ? null : passwordm.trim();
    }

    public Integer getJid() {
        return jid;
    }

    public void setJid(Integer jid) {
        this.jid = jid;
    }

	@Override
	public String toString() {
		return "Users [userid=" + userid + ", username=" + username + ", passwordm=" + passwordm + ", jid=" + jid
				+ ", e=" + e + ", j=" + j + "]";
	}

	
    
}