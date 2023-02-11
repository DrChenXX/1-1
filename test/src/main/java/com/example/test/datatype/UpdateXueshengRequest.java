package com.example.test.datatype;

public class UpdateXueshengRequest {
    private String oldid;
    private String newid;
    private String xingming;
    private String yuanxi;
    private String banji;

    public UpdateXueshengRequest() {
    }

    public UpdateXueshengRequest(String oldid, String newid, String xingming, String yuanxi, String banji) {
        this.oldid = oldid;
        this.newid = newid;
        this.xingming = xingming;
        this.yuanxi = yuanxi;
        this.banji = banji;
    }

    public String getOldid() {
        return oldid;
    }

    public void setOldid(String oldid) {
        this.oldid = oldid;
    }

    public String getNewid() {
        return newid;
    }

    public void setNewid(String newid) {
        this.newid = newid;
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
        return "UpdateXueshengRequest{" +
                "oldid='" + oldid + '\'' +
                ", newid='" + newid + '\'' +
                ", xingming='" + xingming + '\'' +
                ", yuanxi='" + yuanxi + '\'' +
                ", banji='" + banji + '\'' +
                '}';
    }
}
