package com.webike.pojo;

import java.util.Date;

public class Orders {
    private Integer oid;

    private String oSno;

    private Integer oBid;

    private String oBorrowTime;

    private String oReturnTime;

    private Float oRealRent;

    private Float oCash;

    private String oState;

    private Date oCreateTime;

    private Date oUpdateTime;

    private String oComment;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getoSno() {
        return oSno;
    }

    public void setoSno(String oSno) {
        this.oSno = oSno == null ? null : oSno.trim();
    }

    public Integer getoBid() {
        return oBid;
    }

    public void setoBid(Integer oBid) {
        this.oBid = oBid;
    }

    public String getoBorrowTime() {
        return oBorrowTime;
    }

    public void setoBorrowTime(String oBorrowTime) {
        this.oBorrowTime = oBorrowTime == null ? null : oBorrowTime.trim();
    }

    public String getoReturnTime() {
        return oReturnTime;
    }

    public void setoReturnTime(String oReturnTime) {
        this.oReturnTime = oReturnTime == null ? null : oReturnTime.trim();
    }

    public Float getoRealRent() {
        return oRealRent;
    }

    public void setoRealRent(Float oRealRent) {
        this.oRealRent = oRealRent;
    }

    public Float getoCash() {
        return oCash;
    }

    public void setoCash(Float oCash) {
        this.oCash = oCash;
    }

    public String getoState() {
        return oState;
    }

    public void setoState(String oState) {
        this.oState = oState == null ? null : oState.trim();
    }

    public Date getoCreateTime() {
        return oCreateTime;
    }

    public void setoCreateTime(Date oCreateTime) {
        this.oCreateTime = oCreateTime;
    }

    public Date getoUpdateTime() {
        return oUpdateTime;
    }

    public void setoUpdateTime(Date oUpdateTime) {
        this.oUpdateTime = oUpdateTime;
    }

    public String getoComment() {
        return oComment;
    }

    public void setoComment(String oComment) {
        this.oComment = oComment == null ? null : oComment.trim();
    }
}