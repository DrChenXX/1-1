package com.example.test.datatype;

public class SearchXueshengResponse {
    private String ID;
    private String xingming;
    private String nianji;
    private String banji;
    private String yuanxi;

    public SearchXueshengResponse() {
    }

    public SearchXueshengResponse(String ID, String xingming, String nianji, String banji, String yuanxi) {
        this.ID = ID;
        this.xingming = xingming;
        this.nianji = nianji;
        this.banji = banji;
        this.yuanxi = yuanxi;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getXingming() {
        return xingming;
    }

    public void setXingming(String xingming) {
        this.xingming = xingming;
    }

    public String getNianji() {
        return nianji;
    }

    public void setNianji(String nianji) {
        this.nianji = nianji;
    }

    public String getBanji() {
        return banji;
    }

    public void setBanji(String banji) {
        this.banji = banji;
    }

    public String getYuanxi() {
        return yuanxi;
    }

    public void setYuanxi(String yuanxi) {
        this.yuanxi = yuanxi;
    }

    @Override
    public String toString() {
        return "SearchXueshengResponse{" +
                "ID='" + ID + '\'' +
                ", xingming='" + xingming + '\'' +
                ", nianji='" + nianji + '\'' +
                ", banji='" + banji + '\'' +
                ", yuanxi='" + yuanxi + '\'' +
                '}';
    }
}
