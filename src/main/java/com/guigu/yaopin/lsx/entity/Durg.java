package com.guigu.yaopin.lsx.entity;

public class Durg extends drugtypes {
    private Integer durgid;

    private String durgname;

    private String durgbarcode;

    private String specifications;

    private String durgunit;

    private String durgbid;

    private String durgprice;

    private Integer durgtype;

    private String manufacturer;
    
    private String typename;
    

    public Durg(Integer durgid, String durgname, String durgbarcode, String specifications, String durgunit,
			String durgbid, String durgprice, Integer durgtype, String manufacturer, String typename) {
		super();
		this.durgid = durgid;
		this.durgname = durgname;
		this.durgbarcode = durgbarcode;
		this.specifications = specifications;
		this.durgunit = durgunit;
		this.durgbid = durgbid;
		this.durgprice = durgprice;
		this.durgtype = durgtype;
		this.manufacturer = manufacturer;
		this.typename = typename;
	}

	public String getTypename() {
		return typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	public Durg() {}
    
    @Override
	public String toString() {
		return "Durg [durgid=" + durgid + ", durgname=" + durgname + ", durgbarcode=" + durgbarcode
				+ ", specifications=" + specifications + ", durgunit=" + durgunit + ", durgbid=" + durgbid
				+ ", durgprice=" + durgprice + ", durgtype=" + durgtype + ", manufacturer=" + manufacturer + "]";
	}

	public Durg(Integer durgid, String durgname, String durgbarcode, String specifications, String durgunit,
			String durgbid, String durgprice, Integer durgtype, String manufacturer) {
		super();
		this.durgid = durgid;
		this.durgname = durgname;
		this.durgbarcode = durgbarcode;
		this.specifications = specifications;
		this.durgunit = durgunit;
		this.durgbid = durgbid;
		this.durgprice = durgprice;
		this.durgtype = durgtype;
		this.manufacturer = manufacturer;
	}

	public Durg(String durgname, Integer durgtype) {
		super();
		this.durgname = durgname;
		this.durgtype = durgtype;
	}
	public Durg(String durgname) {
		super();
		this.durgname = durgname;
	}
	public Durg(Integer durgtype) {
		super();
		this.durgtype = durgtype;
	}
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