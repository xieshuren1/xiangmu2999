package com.guigu.yaopin.xsr.doamin;

import java.util.List;

public class quanxian {
   
    
    @Override
	public String toString() {
		return "quanxian [qid=" + qid + ", text=" + text + ", url=" + url + ", nid=" + nid + ", shouquan=" + shouquan
				+ "]";
	}

	private int qid;
    private String text;
    private String url;
    private int nid;
    private List<String> shouquan;

    public quanxian() {

    }

	public quanxian(int qid, String text, String url, int nid, List<String> shouquan) {
		super();
		this.qid = qid;
		this.text = text;
		this.url = url;
		this.nid = nid;
		this.shouquan = shouquan;
	}




	public List<String> getShouquan() {
		return shouquan;
	}




	public void setShouquan(List<String> shouquan) {
		this.shouquan = shouquan;
	}




	public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }
}
