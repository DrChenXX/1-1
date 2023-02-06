package com.example.test.datatype;

public class SearchXiaoxiResponse {
    String ID;
    String fankuiren;
    String fankuirenID;
    String yuanxi;
    String chakan;
    String huifu;
    String juzhen;

    public SearchXiaoxiResponse(String ID, String fankuiren, String fankuirenID,
                                String yuanxi, String chakan, String huifu,
                                String juzhen) {
        this.ID = ID;
        this.fankuiren = fankuiren;
        this.fankuirenID = fankuirenID;
        this.yuanxi = yuanxi;
        this.chakan = chakan;
        this.huifu = huifu;
        this.juzhen = juzhen;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFankuiren() {
        return fankuiren;
    }

    public void setFankuiren(String fankuiren) {
        this.fankuiren = fankuiren;
    }

    public String getFankuirenID() {
        return fankuirenID;
    }

    public void setFankuirenID(String fankuirenID) {
        this.fankuirenID = fankuirenID;
    }

    public String getYuanxi() {
        return yuanxi;
    }

    public void setYuanxi(String yuanxi) {
        this.yuanxi = yuanxi;
    }

    public String getChakan() {
        return chakan;
    }

    public void setChakan(String chakan) {
        this.chakan = chakan;
    }

    public String getHuifu() {
        return huifu;
    }

    public void setHuifu(String huifu) {
        this.huifu = huifu;
    }

    public String getJuzhen() {
        return juzhen;
    }

    public void setJuzhen(String juzhen) {
        this.juzhen = juzhen;
    }
}
