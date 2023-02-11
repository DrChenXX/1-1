package com.example.test.datatype;

public class AddTeacherRequest {
    private String id;
    private String xingming;
    private String yuanxi;
    private String zhicheng;

    public AddTeacherRequest() {
    }

    public AddTeacherRequest(String id, String xingming, String yuanxi, String zhicheng) {
        this.id = id;
        this.xingming = xingming;
        this.yuanxi = yuanxi;
        this.zhicheng = zhicheng;
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

    public String getZhicheng() {
        return zhicheng;
    }

    public void setZhicheng(String zhicheng) {
        this.zhicheng = zhicheng;
    }

    @Override
    public String toString() {
        return "AddTeacherRequest{" +
                "id='" + id + '\'' +
                ", xingming='" + xingming + '\'' +
                ", yuanxi='" + yuanxi + '\'' +
                ", zhicheng='" + zhicheng + '\'' +
                '}';
    }
}
