package com.guigu.yaopin.dyj.pojo;

public class UsersQuervo {
	private int pageNum;
	private int maxPage;
	private Users u;
	private Emp e;
	
	public Users getU() {
		return u;
	}
	public void setU(Users u) {
		this.u = u;
	}
	public Emp getE() {
		return e;
	}
	public void setE(Emp e) {
		this.e = e;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getMaxPage() {
		return maxPage;
	}
	public void setMaxPage(int maxPage) {
		this.maxPage = maxPage;
	}
	@Override
	public String toString() {
		return "UsersQuervo [pageNum=" + pageNum + ", maxPage=" + maxPage + "]";
	}
	public UsersQuervo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UsersQuervo(int pageNum, int maxPage) {
		super();
		this.pageNum = pageNum;
		this.maxPage = maxPage;
	}
	public UsersQuervo(int pageNum, int maxPage, Users u) {
		super();
		this.pageNum = pageNum;
		this.maxPage = maxPage;
		this.u = u;
	}
	public UsersQuervo(int pageNum, int maxPage, Users u, Emp e) {
		super();
		this.pageNum = pageNum;
		this.maxPage = maxPage;
		this.u = u;
		this.e = e;
	}
	 
}
