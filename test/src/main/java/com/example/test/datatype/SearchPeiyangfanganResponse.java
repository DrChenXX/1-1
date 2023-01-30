package com.example.test.datatype;

public class SearchPeiyangfanganResponse {
    String id;
    String mingcheng;
    String zhuanyemingcheng;
    String zhuanyeID;
    String version;
    String yuanxi;
    String xianxing;
    String jindu;

    public SearchPeiyangfanganResponse(String id, String mingcheng, String zhuanyemingcheng,
                                       String zhuanyeID, String version,
                                       String yuanxi, String xianxing, String jindu) {
        this.id = id;
        this.mingcheng = mingcheng;
        this.zhuanyemingcheng = zhuanyemingcheng;
        this.zhuanyeID = zhuanyeID;
        this.version = version;
        this.yuanxi = yuanxi;
        this.xianxing = xianxing;
        this.jindu = jindu;
    }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getMingcheng() { return mingcheng; }

    public void setMingcheng(String mingcheng) { this.mingcheng = mingcheng; }

    public String getZhuanyemingcheng() { return zhuanyemingcheng; }

    public void setZhuanyemingcheng(String zhuanyemingcheng) { this.zhuanyemingcheng = zhuanyemingcheng; }

    public String getZhuanyeID() { return zhuanyeID; }

    public void setZhuanyeID(String zhuanyeID) { this.zhuanyeID = zhuanyeID; }

    public String getVersion() { return version; }

    public void setVersion(String version) { this.version = version; }

    public String getYuanxi() { return yuanxi; }

    public void setYuanxi(String yuanxi) { this.yuanxi = yuanxi; }

    public String getXianxing() { return xianxing; }

    public void setXianxing(String xianxing) { this.xianxing = xianxing; }

    public String getJindu() { return jindu; }

    public void setJindu(String jindu) { this.jindu = jindu; }

}
