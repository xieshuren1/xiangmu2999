package com.guigu.yaopin.hjh.entity;

public class Gostock {
    private Integer gsid;

    private Integer sid;
    private Supplier s;
    private Stock stk;
    public Stock getStk() {
		return stk;
	}
	public void setStk(Stock stk) {
		this.stk = stk;
	}
	public Supplier getS() {
		return s;
	}
	
	@Override
	public String toString() {
		return "Gostock [gsid=" + gsid + ", sid=" + sid + ", s=" + s + ", stk=" + stk + ", f=" + f + ", fid=" + fid
				+ "]";
	}
	public void setS(Supplier s) {
		this.s = s;
	}
	public Financial getF() {
		return f;
	}
	public void setF(Financial f) {
		this.f = f;
	}

	private Financial f;
    
public Gostock() {
	// TODO Auto-generated constructor stub
}
    public Gostock(Integer sid, Integer fid) {
		super();
		this.sid = sid;
		this.fid = fid;
	}

	private Integer fid;

    public Integer getGsid() {
        return gsid;
    }

    public void setGsid(Integer gsid) {
        this.gsid = gsid;
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