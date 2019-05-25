package com.guigu.yaopin.dyj.pojo;

public class JueseQuervo {
	private int pageNum;
	private int maxPage;
	private Juese j;
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
	public Juese getJ() {
		return j;
	}
	public void setJ(Juese j) {
		this.j = j;
	}
	public JueseQuervo(int pageNum, int maxPage, Juese j) {
		super();
		this.pageNum = pageNum;
		this.maxPage = maxPage;
		this.j = j;
	}
	public JueseQuervo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
