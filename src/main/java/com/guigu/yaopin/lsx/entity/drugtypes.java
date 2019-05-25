package com.guigu.yaopin.lsx.entity;

public class drugtypes {

	private int typeid;
	private String typename;
	public int getTypeid() {
		return typeid;
	}
	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}
	public String getTypename() {
		return typename;
	}
	public void setTypename(String typename) {
		this.typename = typename;
	}
	@Override
	public String toString() {
		return "drugtypes [typeid=" + typeid + ", typename=" + typename + "]";
	}
	public drugtypes() {}
	public drugtypes(int typeid, String typename) {
		super();
		this.typeid = typeid;
		this.typename = typename;
	}
	
}
