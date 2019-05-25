package com.guigu.yaopin.hjh.entity;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public class Durgrejection {
    private Integer djid;

    private Integer dsid;

    private Integer dfid;
    public Durgrejection() {
		// TODO Auto-generated constructor stub
	}

    public Integer getDjid() {
        return djid;
    }

    public void setDjid(Integer djid) {
        this.djid = djid;
    }

    public Durgrejection(Integer dsid, Integer dfid) {
		super();
		this.dsid = dsid;
		this.dfid = dfid;
	}

	public Integer getDsid() {
        return dsid;
    }

    public void setDsid(Integer dsid) {
        this.dsid = dsid;
    }

    public Integer getDfid() {
        return dfid;
    }

    public void setDfid(Integer dfid) {
        this.dfid = dfid;
    }
}