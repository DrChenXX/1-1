package com.example.test.datatype;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchRenwuResponse {
    @JsonProperty("ID")
    private String ID;
    private String kecheng;
    @JsonProperty("kechengID")
    private String kechengID;
    private String xuefen;
    private String kechengleibie;
    private String renkelaoshi;
    private String yuanxi;
    private String kaikenianji;
    private String fabu;

    public SearchRenwuResponse() {
    }

    public SearchRenwuResponse(String ID, String kecheng, String kechengID, String xuefen, String kechengleibie, String renkelaoshi, String yuanxi, String kaikenianji, String fabu) {
        this.ID = ID;
        this.kecheng = kecheng;
        this.kechengID = kechengID;
        this.xuefen = xuefen;
        this.kechengleibie = kechengleibie;
        this.renkelaoshi = renkelaoshi;
        this.yuanxi = yuanxi;
        this.kaikenianji = kaikenianji;
        this.fabu = fabu;
    }

    @JsonProperty("ID")
    public String getID() {
        return ID;
    }

    @JsonProperty("ID")
    public void setID(String ID) {
        this.ID = ID;
    }

    public String getKecheng() {
        return kecheng;
    }

    public void setKecheng(String kecheng) {
        this.kecheng = kecheng;
    }

    @JsonProperty("kechengID")
    public String getKechengID() {
        return kechengID;
    }

    @JsonProperty("kechengID")
    public void setKechengID(String kechengID) {
        this.kechengID = kechengID;
    }

    public String getXuefen() {
        return xuefen;
    }

    public void setXuefen(String xuefen) {
        this.xuefen = xuefen;
    }

    public String getKechengleibie() {
        return kechengleibie;
    }

    public void setKechengleibie(String kechengleibie) {
        this.kechengleibie = kechengleibie;
    }

    public String getRenkelaoshi() {
        return renkelaoshi;
    }

    public void setRenkelaoshi(String renkelaoshi) {
        this.renkelaoshi = renkelaoshi;
    }

    public String getYuanxi() {
        return yuanxi;
    }

    public void setYuanxi(String yuanxi) {
        this.yuanxi = yuanxi;
    }

    public String getKaikenianji() {
        return kaikenianji;
    }

    public void setKaikenianji(String kaikenianji) {
        this.kaikenianji = kaikenianji;
    }

    public String getFabu() {
        return fabu;
    }

    public void setFabu(String fabu) {
        this.fabu = fabu;
    }
}
