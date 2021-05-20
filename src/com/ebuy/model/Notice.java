package com.ebuy.model;

public class Notice {
    private Integer ntId;

    private String ntTitle;

    private String ntContent;

    public Integer getNtId() {
        return ntId;
    }

    public void setNtId(Integer ntId) {
        this.ntId = ntId;
    }

    public String getNtTitle() {
        return ntTitle;
    }

    public void setNtTitle(String ntTitle) {
        this.ntTitle = ntTitle == null ? null : ntTitle.trim();
    }

    public String getNtContent() {
        return ntContent;
    }

    public void setNtContent(String ntContent) {
        this.ntContent = ntContent == null ? null : ntContent.trim();
    }
}