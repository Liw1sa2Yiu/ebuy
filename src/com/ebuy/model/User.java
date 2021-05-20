package com.ebuy.model;

public class User {
    private Integer uId;

    private String uUsername;

    private String uNickname;

    private String uPassword;

    private String uGender;

    private String uBirth;

    private String uEmail;

    private Integer uPhonenum;

    private String uAddress;

    private String uHeadphoto;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuUsername() {
        return uUsername;
    }

    public void setuUsername(String uUsername) {
        this.uUsername = uUsername == null ? null : uUsername.trim();
    }

    public String getuNickname() {
        return uNickname;
    }

    public void setuNickname(String uNickname) {
        this.uNickname = uNickname == null ? null : uNickname.trim();
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword == null ? null : uPassword.trim();
    }

    public String getuGender() {
        return uGender;
    }

    public void setuGender(String uGender) {
        this.uGender = uGender == null ? null : uGender.trim();
    }

    public String getuBirth() {
        return uBirth;
    }

    public void setuBirth(String uBirth) {
        this.uBirth = uBirth == null ? null : uBirth.trim();
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail == null ? null : uEmail.trim();
    }

    public Integer getuPhonenum() {
        return uPhonenum;
    }

    public void setuPhonenum(Integer uPhonenum) {
        this.uPhonenum = uPhonenum;
    }

    public String getuAddress() {
        return uAddress;
    }

    public void setuAddress(String uAddress) {
        this.uAddress = uAddress == null ? null : uAddress.trim();
    }

    public String getuHeadphoto() {
        return uHeadphoto;
    }

    public void setuHeadphoto(String uHeadphoto) {
        this.uHeadphoto = uHeadphoto == null ? null : uHeadphoto.trim();
    }
}