package com.guigu.yaopin.dyj.pojo;

import com.guigu.yaopin.hjh.entity.Consumer;
import com.guigu.yaopin.hjh.entity.Durg;
import com.guigu.yaopin.hjh.entity.Financial;
import com.guigu.yaopin.hjh.entity.Returngoods;
import com.guigu.yaopin.hjh.entity.Sell;

public class QueryVO {
	private int pageNum;
	private int maxPage;
	private Returngoods r;
	private Sell s;
	private Financial f;
	private Consumer c;
	private Durg d;
	private Emp e;
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
	public Returngoods getR() {
		return r;
	}
	public void setR(Returngoods r) {
		this.r = r;
	}
	public Sell getS() {
		return s;
	}
	public void setS(Sell s) {
		this.s = s;
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
	public Durg getD() {
		return d;
	}
	public void setD(Durg d) {
		this.d = d;
	}
	public Emp getE() {
		return e;
	}
	public void setE(Emp e) {
		this.e = e;
	}
	public QueryVO(int pageNum, int maxPage, Returngoods r, Sell s, Financial f, Consumer c, Durg d, Emp e) {
		super();
		this.pageNum = pageNum;
		this.maxPage = maxPage;
		this.r = r;
		this.s = s;
		this.f = f;
		this.c = c;
		this.d = d;
		this.e = e;
	}
	public QueryVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "QueryVO [pageNum=" + pageNum + ", maxPage=" + maxPage + ", r=" + r + ", s=" + s + ", f=" + f + ", c="
				+ c + ", d=" + d + ", e=" + e + "]";
	}
	
}
