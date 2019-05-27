package com.guigu.yaopin.hjh.entity;

public class Stock {
    private Integer stockid;

    private Integer stocknum;

    private Integer minstock;

    private Integer did;

    @Override
	public String toString() {
		return "Stock [stockid=" + stockid + ", stocknum=" + stocknum + ", minstock=" + minstock + ", did=" + did + "]";
	}

	public Integer getStockid() {
        return stockid;
    }

    public void setStockid(Integer stockid) {
        this.stockid = stockid;
    }

    public Integer getStocknum() {
        return stocknum;
    }

    public void setStocknum(Integer stocknum) {
        this.stocknum = stocknum;
    }

    public Integer getMinstock() {
        return minstock;
    }

    public void setMinstock(Integer minstock) {
        this.minstock = minstock;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }
}