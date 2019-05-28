package com.guigu.yaopin.hjh.entity;

public class Orderdurg {
    private Integer oid;

    private Integer did;

    private Integer sid;

    private Integer odnumber;
    
    @Override
	public String toString() {
		return "Orderdurg [oid=" + oid + ", did=" + did + ", sid=" + sid + ", odnumber=" + odnumber + ", d=" + d
				+ ", s=" + s + ", odmoney=" + odmoney + "]";
	}

	private  Durg d;
    private Supplier s;
public Durg getD() {
		return d;
	}
	public void setD(Durg d) {
		this.d = d;
	}
	public Supplier getS() {
		return s;
	}
	public void setS(Supplier s) {
		this.s = s;
	}
public Orderdurg() {
	// TODO Auto-generated constructor stub
}
    public Orderdurg(Integer did, Integer sid, Integer odnumber, Integer odmoney) {
		super();
		this.did = did;
		this.sid = sid;
		this.odnumber = odnumber;
		this.odmoney = odmoney;
	}

	private Integer odmoney;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getOdnumber() {
        return odnumber;
    }

    public void setOdnumber(Integer odnumber) {
        this.odnumber = odnumber;
    }

    public Integer getOdmoney() {
        return odmoney;
    }

    public void setOdmoney(Integer odmoney) {
        this.odmoney = odmoney;
    }
}