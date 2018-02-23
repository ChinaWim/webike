package com.webike.pojo;

import java.util.Date;

public class Category {
    private Integer cid;

    private String cName;

    private Integer cRemain;

    private Float cRent;

    private Float cCash;

    private Date cCreateTime;

    private Date cUpdateTime;

    private String cComment;

    private Float cPrice;

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
        this.cName = cName == null ? null : cName.trim();
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
        this.cComment = cComment == null ? null : cComment.trim();
    }

    public Float getcPrice() {
        return cPrice;
    }

    public void setcPrice(Float cPrice) {
        this.cPrice = cPrice;
    }
}