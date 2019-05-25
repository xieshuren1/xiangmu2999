package com.guigu.yaopin.hjh.entity;

public class Returngoods {
    private Integer rgid;

    private Integer sid;

    private Integer fid;
public Returngoods() {
	// TODO Auto-generated constructor stub
}
    public Returngoods(Integer sid, Integer fid) {
		super();
		this.sid = sid;
		this.fid = fid;
	}

	public Integer getRgid() {
        return rgid;
    }

    public void setRgid(Integer rgid) {
        this.rgid = rgid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }
}