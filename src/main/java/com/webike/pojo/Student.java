package com.webike.pojo;

import java.util.Date;

public class Student {
    private Integer sid;

    private String sno;

    private String sName;

    private String sSex;

    private String sIdCard;

    private String sEmail;

    private String sPhone;

    private String sIcon;

    private String sDepartment;

    private String sMajor;

    private Date sCreateTime;

    private Date sUpdateTime;

    private String sComment;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno == null ? null : sno.trim();
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public String getsSex() {
        return sSex;
    }

    public void setsSex(String sSex) {
        this.sSex = sSex == null ? null : sSex.trim();
    }

    public String getsIdCard() {
        return sIdCard;
    }

    public void setsIdCard(String sIdCard) {
        this.sIdCard = sIdCard == null ? null : sIdCard.trim();
    }

    public String getsEmail() {
        return sEmail;
    }

    public void setsEmail(String sEmail) {
        this.sEmail = sEmail == null ? null : sEmail.trim();
    }

    public String getsPhone() {
        return sPhone;
    }

    public void setsPhone(String sPhone) {
        this.sPhone = sPhone == null ? null : sPhone.trim();
    }

    public String getsIcon() {
        return sIcon;
    }

    public void setsIcon(String sIcon) {
        this.sIcon = sIcon == null ? null : sIcon.trim();
    }

    public String getsDepartment() {
        return sDepartment;
    }

    public void setsDepartment(String sDepartment) {
        this.sDepartment = sDepartment == null ? null : sDepartment.trim();
    }

    public String getsMajor() {
        return sMajor;
    }

    public void setsMajor(String sMajor) {
        this.sMajor = sMajor == null ? null : sMajor.trim();
    }

    public Date getsCreateTime() {
        return sCreateTime;
    }

    public void setsCreateTime(Date sCreateTime) {
        this.sCreateTime = sCreateTime;
    }

    public Date getsUpdateTime() {
        return sUpdateTime;
    }

    public void setsUpdateTime(Date sUpdateTime) {
        this.sUpdateTime = sUpdateTime;
    }

    public String getsComment() {
        return sComment;
    }

    public void setsComment(String sComment) {
        this.sComment = sComment == null ? null : sComment.trim();
    }
}