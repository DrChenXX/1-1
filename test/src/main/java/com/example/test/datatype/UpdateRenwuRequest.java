package com.example.test.datatype;

public class UpdateRenwuRequest {
    private String kechengID;
    private String kaikenianji;
    private String yuanxi;
    private String renkelaoshi;
    private String renkelaoshiID;

    public UpdateRenwuRequest() {
    }

    public UpdateRenwuRequest(String kechengID, String kaikenianji, String yuanxi, String renkelaoshi, String renkelaoshiID) {
        this.kechengID = kechengID;
        this.kaikenianji = kaikenianji;
        this.yuanxi = yuanxi;
        this.renkelaoshi = renkelaoshi;
        this.renkelaoshiID = renkelaoshiID;
    }

    public String getKechengID() {
        return kechengID;
    }

    public void setKechengID(String kechengID) {
        this.kechengID = kechengID;
    }

    public String getKaikenianji() {
        return kaikenianji;
    }

    public void setKaikenianji(String kaikenianji) {
        this.kaikenianji = kaikenianji;
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

    @Override
    public String toString() {
        return "UpdateRenwuRequest{" +
                "kechengID='" + kechengID + '\'' +
                ", kaikenianji='" + kaikenianji + '\'' +
                ", yuanxi='" + yuanxi + '\'' +
                ", renkelaoshi='" + renkelaoshi + '\'' +
                ", renkelaoshiID='" + renkelaoshiID + '\'' +
                '}';
    }
}
