package com.guigu.yaopin.xsr.doamin;

public class xiaoshoujindu {
	
	private int stockid; //库存id
	private int stocknum;//库存剩余数量
	private int num; //销售数量
	private String  financialdate; //销售时间
	private double financialmoney; //销售获得总金额
	private String durgname; //药品名字
	private String typename;//药品类型
	private double durgbid;//进价
	private double durgprice;//出售价
	

	public double getDurgbid() {
		return durgbid;
	}

	public void setDurgbid(double durgbid) {
		this.durgbid = durgbid;
	}

	public double getDurgprice() {
		return durgprice;
	}

	public void setDurgprice(double durgprice) {
		this.durgprice = durgprice;
	}

	public xiaoshoujindu(int stockid, int stocknum, int num, String financialdate, double financialmoney,
			String durgname, String typename, double durgbid, double durgprice) {
		super();
		this.stockid = stockid;
		this.stocknum = stocknum;
		this.num = num;
		this.financialdate = financialdate;
		this.financialmoney = financialmoney;
		this.durgname = durgname;
		this.typename = typename;
		this.durgbid = durgbid;
		this.durgprice = durgprice;
	}

	public xiaoshoujindu() {
		super();
	}

	public String getTypename() {
		return typename;
	}
	public void setTypename(String typename) {
		this.typename = typename;
	}
	@Override
	public String toString() {
		return "xiaoshoujindu [stockid=" + stockid + ", stocknum=" + stocknum + ", num=" + num + ", financialdate="
				+ financialdate + ", financialmoney=" + financialmoney + ", durgname=" + durgname + ", typename="
				+ typename + ", durgbid=" + durgbid + ", durgprice=" + durgprice + "]";
	}
	public int getStockid() {
		return stockid;
	}
	public void setStockid(int stockid) {
		this.stockid = stockid;
	}
	public int getStocknum() {
		return stocknum;
	}
	public void setStocknum(int stocknum) {
		this.stocknum = stocknum;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getFinancialdate() {
		return financialdate;
	}
	public void setFinancialdate(String financialdate) {
		this.financialdate = financialdate;
	}
	public double getFinancialmoney() {
		return financialmoney;
	}
	public void setFinancialmoney(double financialmoney) {
		this.financialmoney = financialmoney;
	}
	public String getDurgname() {
		return durgname;
	}
	public void setDurgname(String durgname) {
		this.durgname = durgname;
	}
}
