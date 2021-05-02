package com.onlineshop.pojo;

import java.util.Date;

public class Order {
    private Integer orderId;

    private Integer pId;

    private Integer uId;

    private Integer pNumber;

    private Double pCountrmb;

    private Date orderDate;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getpNumber() {
        return pNumber;
    }

    public void setpNumber(Integer pNumber) {
        this.pNumber = pNumber;
    }

    public Double getpCountrmb() {
        return pCountrmb;
    }

    public void setpCountrmb(Double pCountrmb) {
        this.pCountrmb = pCountrmb;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}