package com.example.test.datatype;

public class UpdateTeacherRequest {
    private String oldid;
    private String newid;
    private String xingming;
    private String yuanxi;
    private String zhicheng;

    public UpdateTeacherRequest() {
    }

    public UpdateTeacherRequest(String oldid, String newid, String xingming, String yuanxi, String zhicheng) {
        this.oldid = oldid;
        this.newid = newid;
        this.xingming = xingming;
        this.yuanxi = yuanxi;
        this.zhicheng = zhicheng;
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

    public String getZhicheng() {
        return zhicheng;
    }

    public void setZhicheng(String zhicheng) {
        this.zhicheng = zhicheng;
    }

    @Override
    public String toString() {
        return "UpdateTeacherRequest{" +
                "oldid='" + oldid + '\'' +
                ", newid='" + newid + '\'' +
                ", xingming='" + xingming + '\'' +
                ", yuanxi='" + yuanxi + '\'' +
                ", zhicheng='" + zhicheng + '\'' +
                '}';
    }
}
