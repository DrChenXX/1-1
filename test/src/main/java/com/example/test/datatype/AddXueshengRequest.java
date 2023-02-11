package com.example.test.datatype;

public class AddXueshengRequest {
    private String id;
    private String xingming;
    private String yuanxi;
    private String banji;

    public AddXueshengRequest() {
    }

    public AddXueshengRequest(String id, String xingming, String yuanxi, String banji) {
        this.id = id;
        this.xingming = xingming;
        this.yuanxi = yuanxi;
        this.banji = banji;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getXingming() {
        return xingming;
    }

    public void setXingming(String xingming) {
        this.xingming = xingming;
    }

    public String getYuanxi() {
        return yuanxi;
    }

    public void setYuanxi(String yuanxi) {
        this.yuanxi = yuanxi;
    }

    public String getBanji() {
        return banji;
    }

    public void setBanji(String banji) {
        this.banji = banji;
    }

    @Override
    public String toString() {
        return "AddXueshengRequest{" +
                "id='" + id + '\'' +
                ", xingming='" + xingming + '\'' +
                ", yuanxi='" + yuanxi + '\'' +
                ", banji='" + banji + '\'' +
                '}';
    }
}
