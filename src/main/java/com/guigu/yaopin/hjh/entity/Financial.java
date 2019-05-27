package com.guigu.yaopin.hjh.entity;

public class Financial {
    private Integer financialid;

    private Integer did;

    private Integer eid;
    private  Durg d;

    public Durg getD() {
		return d;
	}

	public void setD(Durg d) {
		this.d = d;
	}

	public Financial(Integer did, Integer eid, Integer num, String financialdate, String financialmoney, Integer tid) {
		super();
		this.did = did;
		this.eid = eid;
		this.num = num;
		this.financialdate = financialdate;
		this.financialmoney = financialmoney;
		this.tid = tid;
	}

	
	@Override
	public String toString() {
		return "Financial [financialid=" + financialid + ", did=" + did + ", eid=" + eid + ", d=" + d + ", num=" + num
				+ ", financialdate=" + financialdate + ", financialmoney=" + financialmoney + ", tid=" + tid + "]";
	}


	private Integer num;

    private String financialdate;

    private String financialmoney;

    private Integer tid;

    public Integer getFinancialid() {
        return financialid;
    }

    public void setFinancialid(Integer financialid) {
        this.financialid = financialid;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getFinancialdate() {
        return financialdate;
    }

    public void setFinancialdate(String financialdate) {
        this.financialdate = financialdate == null ? null : financialdate.trim();
    }

    public String getFinancialmoney() {
        return financialmoney;
    }

    public void setFinancialmoney(String financialmoney) {
        this.financialmoney = financialmoney == null ? null : financialmoney.trim();
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }
    public Financial() {
		// TODO Auto-generated constructor stub
	}
}