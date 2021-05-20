package com.ebuy.model;

public class Product {
    private Integer pId;

    private String pName;

    private String pType;

    private String pPhoto;

    private Double pPrice;

    private String pBrand;

    private Integer pInventory;

    private String pBarcode;

    private Integer srdId;

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

    public String getpType() {
        return pType;
    }

    public void setpType(String pType) {
        this.pType = pType == null ? null : pType.trim();
    }

    public String getpPhoto() {
        return pPhoto;
    }

    public void setpPhoto(String pPhoto) {
        this.pPhoto = pPhoto == null ? null : pPhoto.trim();
    }

    public Double getpPrice() {
        return pPrice;
    }

    public void setpPrice(Double pPrice) {
        this.pPrice = pPrice;
    }

    public String getpBrand() {
        return pBrand;
    }

    public void setpBrand(String pBrand) {
        this.pBrand = pBrand == null ? null : pBrand.trim();
    }

    public Integer getpInventory() {
        return pInventory;
    }

    public void setpInventory(Integer pInventory) {
        this.pInventory = pInventory;
    }

    public String getpBarcode() {
        return pBarcode;
    }

    public void setpBarcode(String pBarcode) {
        this.pBarcode = pBarcode == null ? null : pBarcode.trim();
    }

    public Integer getSrdId() {
        return srdId;
    }

    public void setSrdId(Integer srdId) {
        this.srdId = srdId;
    }
}