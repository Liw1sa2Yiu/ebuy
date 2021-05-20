package com.ebuy.model;

public class Srd {
    private Integer srdId;

    private String srdName;

    private Integer prdId;

    public Integer getSrdId() {
        return srdId;
    }

    public void setSrdId(Integer srdId) {
        this.srdId = srdId;
    }

    public String getSrdName() {
        return srdName;
    }

    public void setSrdName(String srdName) {
        this.srdName = srdName == null ? null : srdName.trim();
    }

    public Integer getPrdId() {
        return prdId;
    }

    public void setPrdId(Integer prdId) {
        this.prdId = prdId;
    }
}