package com.guigu.yaopin.lsx.entity;

public class Consumer {
    private Integer consumerid;

    private String consumername;

    private String consumercontacts;

    private String consumerphone;

    private String address;

    private String remarks;

    public Integer getConsumerid() {
        return consumerid;
    }

    public void setConsumerid(Integer consumerid) {
        this.consumerid = consumerid;
    }

    public String getConsumername() {
        return consumername;
    }

    public void setConsumername(String consumername) {
        this.consumername = consumername == null ? null : consumername.trim();
    }

    public String getConsumercontacts() {
        return consumercontacts;
    }

    public void setConsumercontacts(String consumercontacts) {
        this.consumercontacts = consumercontacts == null ? null : consumercontacts.trim();
    }

    public String getConsumerphone() {
        return consumerphone;
    }

    public void setConsumerphone(String consumerphone) {
        this.consumerphone = consumerphone == null ? null : consumerphone.trim();
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