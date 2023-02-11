package com.example.test.datatype;

public class AddRenwuRequest {
    private String kecheng;
    private String kechengID;
    private String xuefen;
    private String kechengleibie;
    private String yuanxi;
    private String renkelaoshi;
    private String renkelaoshiID;
    private String kaikenianji;

    public AddRenwuRequest() {
    }

    public AddRenwuRequest(String kecheng, String kechengID, String xuefen,
                           String kechengleibie, String yuanxi, String renkelaoshi,
                           String renkelaoshiID, String kaikenianji) {
        this.kecheng = kecheng;
        this.kechengID = kechengID;
        this.xuefen = xuefen;
        this.kechengleibie = kechengleibie;
        this.yuanxi = yuanxi;
        this.renkelaoshi = renkelaoshi;
        this.renkelaoshiID = renkelaoshiID;
        this.kaikenianji = kaikenianji;
    }

    public String getKecheng() {
        return kecheng;
    }

    public void setKecheng(String kecheng) {
        this.kecheng = kecheng;
    }

    public String getKechengID() {
        return kechengID;
    }

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

    public String getYuanxi() {
        return yuanxi;
    }

    public void setYuanxi(String yuanxi) {
        this.yuanxi = yuanxi;
    }

    public String getRenkelaoshi() {
        return renkelaoshi;
    }

    public void setRenkelaoshi(String renkelaoshi) {
        this.renkelaoshi = renkelaoshi;
    }

    public String getRenkelaoshiID() {
        return renkelaoshiID;
    }

    public void setRenkelaoshiID(String renkelaoshiID) {
        this.renkelaoshiID = renkelaoshiID;
    }

    public String getKaikenianji() {
        return kaikenianji;
    }

    public void setKaikenianji(String kaikenianji) {
        this.kaikenianji = kaikenianji;
    }

    @Override
    public String toString() {
        return "AddRenwuRequest{" +
                "kecheng='" + kecheng + '\'' +
                ", kechengID='" + kechengID + '\'' +
                ", xuefen='" + xuefen + '\'' +
                ", kechengleibie='" + kechengleibie + '\'' +
                ", yuanxi='" + yuanxi + '\'' +
                ", renkelaoshi='" + renkelaoshi + '\'' +
                ", renkelaoshiID='" + renkelaoshiID + '\'' +
                ", kaikenianji='" + kaikenianji + '\'' +
                '}';
    }
}
