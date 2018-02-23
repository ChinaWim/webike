package com.webike.pojo;

import java.util.Date;

public class Place {
    private Integer pid;

    private String pName;

    private String pAddress;

    private String pPhone;

    private Date pCreateTime;

    private Date pUpdateTime;

    private String pComment;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    public String getpAddress() {
        return pAddress;
    }

    public void setpAddress(String pAddress) {
        this.pAddress = pAddress == null ? null : pAddress.trim();
    }

    public String getpPhone() {
        return pPhone;
    }

    public void setpPhone(String pPhone) {
        this.pPhone = pPhone == null ? null : pPhone.trim();
    }

    public Date getpCreateTime() {
        return pCreateTime;
    }

    public void setpCreateTime(Date pCreateTime) {
        this.pCreateTime = pCreateTime;
    }

    public Date getpUpdateTime() {
        return pUpdateTime;
    }

    public void setpUpdateTime(Date pUpdateTime) {
        this.pUpdateTime = pUpdateTime;
    }

    public String getpComment() {
        return pComment;
    }

    public void setpComment(String pComment) {
        this.pComment = pComment == null ? null : pComment.trim();
    }
}