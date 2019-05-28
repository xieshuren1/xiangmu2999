package com.guigu.yaopin.xsr.doamin;

public class rukushiti {
		
	private int gsid;
	private String suppliername;
	private String  durgname;
	private String durgbarcode;
	private int num;
	private String financialdate;
	private String  empname;
	@Override
	public String toString() {
		return "rukushiti [gsid=" + gsid + ", suppliername=" + suppliername + ", durgname=" + durgname
				+ ", durgbarcode=" + durgbarcode + ", num=" + num + ", financialdate=" + financialdate + ", empname="
				+ empname + "]";
	}
	public rukushiti() {
		super();
	}
	public rukushiti(int gsid, String suppliername, String durgname, String durgbarcode, int num, String financialdate,
			String empname) {
		super();
		this.gsid = gsid;
		this.suppliername = suppliername;
		this.durgname = durgname;
		this.durgbarcode = durgbarcode;
		this.num = num;
		this.financialdate = financialdate;
		this.empname = empname;
	}
	public int getGsid() {
		return gsid;
	}
	public void setGsid(int gsid) {
		this.gsid = gsid;
	}
	public String getSuppliername() {
		return suppliername;
	}
	public void setSuppliername(String suppliername) {
		this.suppliername = suppliername;
	}
	public String getDurgname() {
		return durgname;
	}
	public void setDurgname(String durgname) {
		this.durgname = durgname;
	}
	public String getDurgbarcode() {
		return durgbarcode;
	}
	public void setDurgbarcode(String durgbarcode) {
		this.durgbarcode = durgbarcode;
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
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
}
