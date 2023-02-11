package com.example.test.datatype;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KechengdagangResponse {
    private String mingcheng;
    @JsonProperty("ID")
    private String ID;
    private String xuefen;
    private String leibie;
    private String yuanxi;
    private String shangchuan;

    public KechengdagangResponse() {
    }

    public KechengdagangResponse(String mingcheng, String ID, String xuefen, String leibie, String yuanxi, String shangchuan) {
        this.mingcheng = mingcheng;
        this.ID = ID;
        this.xuefen = xuefen;
        this.leibie = leibie;
        this.yuanxi = yuanxi;
        this.shangchuan = shangchuan;
    }

    public String getMingcheng() {
        return mingcheng;
    }

    public void setMingcheng(String mingcheng) {
        this.mingcheng = mingcheng;
    }

    @JsonProperty("ID")
    public String getID() {
        return ID;
    }

    @JsonProperty("ID")
    public void setID(String ID) {
        this.ID = ID;
    }

    public String getXuefen() {
        return xuefen;
    }

    public void setXuefen(String xuefen) {
        this.xuefen = xuefen;
    }

    public String getLeibie() {
        return leibie;
    }

    public void setLeibie(String leibie) {
        this.leibie = leibie;
    }

    public String getYuanxi() {
        return yuanxi;
    }

    public void setYuanxi(String yuanxi) {
        this.yuanxi = yuanxi;
    }

    public String getShangchuan() {
        return shangchuan;
    }

    public void setShangchuan(String shangchuan) {
        this.shangchuan = shangchuan;
    }
}
