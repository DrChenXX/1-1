package com.example.test.datatype;

public class SearchXueshengRequest {
    private String id;
    private String yeshu;
    private String ID;
    private String xingming;
    private String yuanxi;

    public SearchXueshengRequest() {
    }

    public SearchXueshengRequest(String id, String yeshu, String ID, String xingming, String yuanxi) {
        this.id = id;
        this.yeshu = yeshu;
        this.ID = ID;
        this.xingming = xingming;
        this.yuanxi = yuanxi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getYeshu() {
        return yeshu;
    }

    public void setYeshu(String yeshu) {
        this.yeshu = yeshu;
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

    public String getYuanxi() {
        return yuanxi;
    }

    public void setYuanxi(String yuanxi) {
        this.yuanxi = yuanxi;
    }

    @Override
    public String toString() {
        return "SearchXueshengRequest{" +
                "id='" + id + '\'' +
                ", yeshu='" + yeshu + '\'' +
                ", ID='" + ID + '\'' +
                ", xingming='" + xingming + '\'' +
                ", yuanxi='" + yuanxi + '\'' +
                '}';
    }
}
