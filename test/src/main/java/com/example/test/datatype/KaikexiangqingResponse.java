package com.example.test.datatype;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KaikexiangqingResponse {
    private String mingcheng;
    @JsonProperty("ID")
    private String ID;
    private String xuefen;
    private String leibie;
    private String yuanxi;
    private String nianji;
    private String shijian;
    private String shangchuan;

    public KaikexiangqingResponse() {
    }

    public KaikexiangqingResponse(String mingcheng, String ID, String xuefen, String leibie, String yuanxi, String nianji, String shijian, String shangchuan) {
        this.mingcheng = mingcheng;
        this.ID = ID;
        this.xuefen = xuefen;
        this.leibie = leibie;
        this.yuanxi = yuanxi;
        this.nianji = nianji;
        this.shijian = shijian;
        this.shangchuan = shangchuan;
    }

    public String getMingcheng() {
        return mingcheng;
    }

    public void setMingcheng(String mingcheng) {
        this.mingcheng = mingcheng;
    }

    public String getID() {
        return ID;
    }

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

    public String getNianji() {
        return nianji;
    }

    public void setNianji(String nianji) {
        this.nianji = nianji;
    }

    public String getShijian() {
        return shijian;
    }

    public void setShijian(String shijian) {
        this.shijian = shijian;
    }

    public String getShangchuan() {
        return shangchuan;
    }

    public void setShangchuan(String shangchuan) {
        this.shangchuan = shangchuan;
    }

    @Override
    public String toString() {
        return "KaikexiangqingResponse{" +
                "mingcheng='" + mingcheng + '\'' +
                ", ID='" + ID + '\'' +
                ", xuefen='" + xuefen + '\'' +
                ", leibie='" + leibie + '\'' +
                ", yuanxi='" + yuanxi + '\'' +
                ", nianji='" + nianji + '\'' +
                ", shijian='" + shijian + '\'' +
                ", shangchuan='" + shangchuan + '\'' +
                '}';
    }
}
