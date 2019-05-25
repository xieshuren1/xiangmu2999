package com.guigu.yaopin.lsx.entity;

public class Supplier {
    private Integer supplierid;

    private String suppliername;

    private String suppliercontacts;

    private String supplierphone;

    private String address;

    private String remarks;
    
    public Supplier() {}
    
    public Supplier(String suppliername, String supplierphone) {
    	this.suppliername = suppliername;
    	this.supplierphone = supplierphone;
    }
    public Supplier(Integer supplierid, String suppliername, String suppliercontacts, String supplierphone,
			String address, String remarks) {
		super();
		this.supplierid = supplierid;
		this.suppliername = suppliername;
		this.suppliercontacts = suppliercontacts;
		this.supplierphone = supplierphone;
		this.address = address;
		this.remarks = remarks;
	}

	public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername == null ? null : suppliername.trim();
    }

    public String getSuppliercontacts() {
        return suppliercontacts;
    }

    public void setSuppliercontacts(String suppliercontacts) {
        this.suppliercontacts = suppliercontacts == null ? null : suppliercontacts.trim();
    }

    public String getSupplierphone() {
        return supplierphone;
    }

    public void setSupplierphone(String supplierphone) {
        this.supplierphone = supplierphone == null ? null : supplierphone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}