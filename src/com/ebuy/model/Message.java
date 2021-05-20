package com.ebuy.model;

public class Message {
    private Integer mId;

    private Integer uId;

    private String lContent;

    private String lStatus;

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getlContent() {
        return lContent;
    }

    public void setlContent(String lContent) {
        this.lContent = lContent == null ? null : lContent.trim();
    }

    public String getlStatus() {
        return lStatus;
    }

    public void setlStatus(String lStatus) {
        this.lStatus = lStatus == null ? null : lStatus.trim();
    }
}