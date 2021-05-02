package com.onlineshop.pojo;

public class Product {
    private Integer pId;

    private String pName;

    private Double pPrice;

    private Integer pNumber;

    private String pImgname;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    public Double getpPrice() {
        return pPrice;
    }

    public void setpPrice(Double pPrice) {
        this.pPrice = pPrice;
    }

    public Integer getpNumber() {
        return pNumber;
    }

    public void setpNumber(Integer pNumber) {
        this.pNumber = pNumber;
    }

    public String getpImgname() {
        return pImgname;
    }

    public void setpImgname(String pImgname) {
        this.pImgname = pImgname == null ? null : pImgname.trim();
    }
}