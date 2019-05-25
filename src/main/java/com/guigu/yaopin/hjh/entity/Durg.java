package com.guigu.yaopin.hjh.entity;

public class Durg {
    private Integer durgid;

    private String durgname;

    private String durgbarcode;

    public Stock getStk() {
		return stk;
	}

	public void setStk(Stock stk) {
		this.stk = stk;
	}

	private String specifications;
    private Stock stk;

  

	

	@Override
	public String toString() {
		return "Durg [durgid=" + durgid + ", durgname=" + durgname + ", durgbarcode=" + durgbarcode
				+ ", specifications=" + specifications + ", stk=" + stk + ", durgunit=" + durgunit + ", durgbid="
				+ durgbid + ", durgprice=" + durgprice + ", durgtype=" + durgtype + ", manufacturer=" + manufacturer
				+ "]";
	}

	private String durgunit;

    private String durgbid;

    private String durgprice;

    private Integer durgtype;

    private String manufacturer;
   
	public Integer getDurgid() {
        return durgid;
    }

    public void setDurgid(Integer durgid) {
        this.durgid = durgid;
    }

    public String getDurgname() {
        return durgname;
    }

    public void setDurgname(String durgname) {
        this.durgname = durgname == null ? null : durgname.trim();
    }

    public String getDurgbarcode() {
        return durgbarcode;
    }

    public void setDurgbarcode(String durgbarcode) {
        this.durgbarcode = durgbarcode == null ? null : durgbarcode.trim();
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications == null ? null : specifications.trim();
    }

    public String getDurgunit() {
        return durgunit;
    }

    public void setDurgunit(String durgunit) {
        this.durgunit = durgunit == null ? null : durgunit.trim();
    }

    public String getDurgbid() {
        return durgbid;
    }

    public void setDurgbid(String durgbid) {
        this.durgbid = durgbid == null ? null : durgbid.trim();
    }

    public String getDurgprice() {
        return durgprice;
    }

    public void setDurgprice(String durgprice) {
        this.durgprice = durgprice == null ? null : durgprice.trim();
    }

    public Integer getDurgtype() {
        return durgtype;
    }

    public void setDurgtype(Integer durgtype) {
        this.durgtype = durgtype;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer == null ? null : manufacturer.trim();
    }
}