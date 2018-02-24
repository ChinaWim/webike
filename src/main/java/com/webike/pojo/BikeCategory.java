package com.webike.pojo;

import java.util.Date;

/**
 * Created by Ming on 2018/2/14.
 */
public class BikeCategory {

    private Integer bid;

    private String bName;

    private String bIcon;

    private Integer bCid;

    private String bInTime;

    private String bState;

    private Date bCreateTime;

    private Date bUpdateTime;

    private String bComment;

    private Integer cid;

    private String cName;

    private Integer cRemain;

    private Float cRent;

    private Float cCash;

    private Date cCreateTime;

    private Date cUpdateTime;

    private String cComment;

    private Float cPrice;

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
        this.bName = bName;
    }

    public String getbIcon() {
        return bIcon;
    }

    public void setbIcon(String bIcon) {
        this.bIcon = bIcon;
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
        this.bInTime = bInTime;
    }

    public String getbState() {
        return bState;
    }

    public void setbState(String bState) {
        this.bState = bState;
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
        this.bComment = bComment;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Integer getcRemain() {
        return cRemain;
    }

    public void setcRemain(Integer cRemain) {
        this.cRemain = cRemain;
    }

    public Float getcRent() {
        return cRent;
    }

    public void setcRent(Float cRent) {
        this.cRent = cRent;
    }

    public Float getcCash() {
        return cCash;
    }

    public void setcCash(Float cCash) {
        this.cCash = cCash;
    }

    public Date getcCreateTime() {
        return cCreateTime;
    }

    public void setcCreateTime(Date cCreateTime) {
        this.cCreateTime = cCreateTime;
    }

    public Date getcUpdateTime() {
        return cUpdateTime;
    }

    public void setcUpdateTime(Date cUpdateTime) {
        this.cUpdateTime = cUpdateTime;
    }

    public String getcComment() {
        return cComment;
    }

    public void setcComment(String cComment) {
        this.cComment = cComment;
    }

    public Float getcPrice() {
        return cPrice;
    }

    public void setcPrice(Float cPrice) {
        this.cPrice = cPrice;
    }

    @Override
    public String toString() {
        return "BikeCategory{" +
                "bid=" + bid +
                ", bName='" + bName + '\'' +
                ", bIcon='" + bIcon + '\'' +
                ", bCid=" + bCid +
                ", bInTime='" + bInTime + '\'' +
                ", bState='" + bState + '\'' +
                ", bCreateTime=" + bCreateTime +
                ", bUpdateTime=" + bUpdateTime +
                ", bComment='" + bComment + '\'' +
                ", cid=" + cid +
                ", cName='" + cName + '\'' +
                ", cRemain=" + cRemain +
                ", cRent=" + cRent +
                ", cCash=" + cCash +
                ", cCreateTime=" + cCreateTime +
                ", cUpdateTime=" + cUpdateTime +
                ", cComment='" + cComment + '\'' +
                ", cPrice=" + cPrice +
                '}';
    }
}
