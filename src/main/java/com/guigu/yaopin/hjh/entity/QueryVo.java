package com.guigu.yaopin.hjh.entity;

public class QueryVo {

	
	private int tyid;
	private int page;
	private int rows;
	public QueryVo(int page, String suppliername) {
		super();
		this.page = page;
		this.suppliername = suppliername;
		
	}

	public String getSuppliername() {
		return suppliername;
	}

	public void setSuppliername(String suppliername) {
		this.suppliername = suppliername;
	}

	

	private String name;
	private String suppliername;

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTyid() {
		return tyid;
	}

	public QueryVo(int tyid,int page, int rows,String name) {
		super();
		this.name=name;
		this.tyid=tyid;
		this.page = page;
		this.rows = rows;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public QueryVo(int tyid) {
		super();
		this.tyid = tyid;
	}
	public QueryVo() {
		// TODO Auto-generated constructor stub
	}

	public void setTyid(int tyid) {
		this.tyid = tyid;
	}
}
