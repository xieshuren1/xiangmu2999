package com.guigu.yaopin.hjh.entity;

public class Supplier {
    private Integer supplierid;

    private String suppliername;

    private String suppliercontacts;

    private String supplierphone;

    private String address;

    private String remarks;

    @Override
	public String toString() {
		return "Supplier [supplierid=" + supplierid + ", suppliername=" + suppliername + ", suppliercontacts="
				+ suppliercontacts + ", supplierphone=" + supplierphone + ", address=" + address + ", remarks="
				+ remarks + "]";
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