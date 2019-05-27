package com.guigu.yaopin.hjh.entity;

public class Sell {
	private Integer sellid;

	private Integer cid;

	@Override
	public String toString() {
		return "Sell [sellid=" + sellid + ", cid=" + cid + ", fid=" + fid + ", f=" + f + ", c=" + c + ", p=" + p
				+ ", pid=" + pid + "]";
	}

	public Financial getF() {
		return f;
	}

	public void setF(Financial f) {
		this.f = f;
	}

	public Consumer getC() {
		return c;
	}

	public void setC(Consumer c) {
		this.c = c;
	}

	public Payment getP() {
		return p;
	}

	public void setP(Payment p) {
		this.p = p;
	}

	private Integer fid;
	private Financial f;
	private Consumer c;
	private Payment p;

	public Sell(Integer cid, Integer fid, Integer pid) {
		super();
		this.cid = cid;
		this.fid = fid;
		this.pid = pid;
	}

	public Sell() {
		// TODO Auto-generated constructor stub
	}

	private Integer pid;

	public Integer getSellid() {
		return sellid;
	}

	public void setSellid(Integer sellid) {
		this.sellid = sellid;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public Integer getFid() {
		return fid;
	}

	public void setFid(Integer fid) {
		this.fid = fid;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}
}