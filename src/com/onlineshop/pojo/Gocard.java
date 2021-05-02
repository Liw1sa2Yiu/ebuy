package com.onlineshop.pojo;

public class Gocard {
    private Integer cardId;

    private Integer uId;

    private String pName;

    private Integer pNumber;

    private Double pPricee;

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    public Integer getpNumber() {
        return pNumber;
    }

    public void setpNumber(Integer pNumber) {
        this.pNumber = pNumber;
    }

    public Double getpPricee() {
        return pPricee;
    }

    public void setpPricee(Double pPricee) {
        this.pPricee = pPricee;
    }
}