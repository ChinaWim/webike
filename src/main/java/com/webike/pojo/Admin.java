package com.webike.pojo;

import java.util.Date;

public class Admin {
    private Integer aid;

    private Integer aPid;

    private Place place;

    private String aUsername;

    private String aPassword;

    private String aRealName;

    private String aPhone;

    private String aRole;

    private String aIcon;

    private Date aLoginTime;

    private Date aCreateTime;

    private Date aUpdateTime;

    private String aComment;

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getaPid() {
        return aPid;
    }

    public void setaPid(Integer aPid) {
        this.aPid = aPid;
    }

    public String getaUsername() {
        return aUsername;
    }

    public void setaUsername(String aUsername) {
        this.aUsername = aUsername == null ? null : aUsername.trim();
    }

    public String getaPassword() {
        return aPassword;
    }

    public void setaPassword(String aPassword) {
        this.aPassword = aPassword == null ? null : aPassword.trim();
    }

    public String getaRealName() {
        return aRealName;
    }

    public void setaRealName(String aRealName) {
        this.aRealName = aRealName == null ? null : aRealName.trim();
    }

    public String getaPhone() {
        return aPhone;
    }

    public void setaPhone(String aPhone) {
        this.aPhone = aPhone == null ? null : aPhone.trim();
    }

    public String getaRole() {
        return aRole;
    }

    public void setaRole(String aRole) {
        this.aRole = aRole == null ? null : aRole.trim();
    }

    public String getaIcon() {
        return aIcon;
    }

    public void setaIcon(String aIcon) {
        this.aIcon = aIcon == null ? null : aIcon.trim();
    }

    public Date getaLoginTime() {
        return aLoginTime;
    }

    public void setaLoginTime(Date aLoginTime) {
        this.aLoginTime = aLoginTime;
    }

    public Date getaCreateTime() {
        return aCreateTime;
    }

    public void setaCreateTime(Date aCreateTime) {
        this.aCreateTime = aCreateTime;
    }

    public Date getaUpdateTime() {
        return aUpdateTime;
    }

    public void setaUpdateTime(Date aUpdateTime) {
        this.aUpdateTime = aUpdateTime;
    }

    public String getaComment() {
        return aComment;
    }

    public void setaComment(String aComment) {
        this.aComment = aComment == null ? null : aComment.trim();
    }

    @Override
    public String toString() {
        return "Admin{" +
                "aid=" + aid +
                ", aPid=" + aPid +
                ", place=" + place +
                ", aUsername='" + aUsername + '\'' +
                ", aPassword='" + aPassword + '\'' +
                ", aRealName='" + aRealName + '\'' +
                ", aPhone='" + aPhone + '\'' +
                ", aRole='" + aRole + '\'' +
                ", aIcon='" + aIcon + '\'' +
                ", aLoginTime=" + aLoginTime +
                ", aCreateTime=" + aCreateTime +
                ", aUpdateTime=" + aUpdateTime +
                ", aComment='" + aComment + '\'' +
                '}';
    }
}