package com.webike.pojo;

import java.util.Date;

public class Bike {
    private Integer bid;

    private String bName;

    private String bIcon;

    private Integer bCid;

    private String bInTime;

    private String bState;

    private Date bCreateTime;

    private Date bUpdateTime;

    private String bComment;

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName == null ? null : bName.trim();
    }

    public String getbIcon() {
        return bIcon;
    }

    public void setbIcon(String bIcon) {
        this.bIcon = bIcon == null ? null : bIcon.trim();
    }

    public Integer getbCid() {
        return bCid;
    }

    public void setbCid(Integer bCid) {
        this.bCid = bCid;
    }

    public String getbInTime() {
        return bInTime;
    }

    public void setbInTime(String bInTime) {
        this.bInTime = bInTime == null ? null : bInTime.trim();
    }

    public String getbState() {
        return bState;
    }

    public void setbState(String bState) {
        this.bState = bState == null ? null : bState.trim();
    }

    public Date getbCreateTime() {
        return bCreateTime;
    }

    public void setbCreateTime(Date bCreateTime) {
        this.bCreateTime = bCreateTime;
    }

    public Date getbUpdateTime() {
        return bUpdateTime;
    }

    public void setbUpdateTime(Date bUpdateTime) {
        this.bUpdateTime = bUpdateTime;
    }

    public String getbComment() {
        return bComment;
    }

    public void setbComment(String bComment) {
        this.bComment = bComment == null ? null : bComment.trim();
    }
}