package com.example.test.datatype;

public class UpdateRenwuRequest {
    private String renwuID;
    private String kaikenianji;
    private String yuanxi;
    private String renkelaoshi;
    private String renkelaoshiID;

    public UpdateRenwuRequest() {
    }

    public UpdateRenwuRequest(String renwuID, String kaikenianji, String yuanxi, String renkelaoshi, String renkelaoshiID) {
        this.renwuID = renwuID;
        this.kaikenianji = kaikenianji;
        this.yuanxi = yuanxi;
        this.renkelaoshi = renkelaoshi;
        this.renkelaoshiID = renkelaoshiID;
    }

    public String getRenwuID() {
        return renwuID;
    }

    public void setRenwuID(String renwuID) {
        this.renwuID = renwuID;
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
                "kechengID='" + renwuID + '\'' +
                ", kaikenianji='" + kaikenianji + '\'' +
                ", yuanxi='" + yuanxi + '\'' +
                ", renkelaoshi='" + renkelaoshi + '\'' +
                ", renkelaoshiID='" + renkelaoshiID + '\'' +
                '}';
    }
}
