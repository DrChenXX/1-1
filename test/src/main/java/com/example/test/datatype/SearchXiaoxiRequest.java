package com.example.test.datatype;

public class SearchXiaoxiRequest {
    private String id;
    private String yeshu;
    private String fankuiren;
    private String fankuirenID;
    private String yuanxi;
    private String chuli;
    private String huifu;

    public SearchXiaoxiRequest() {
    }

    public SearchXiaoxiRequest(String id, String yeshu,String fankuiren, String fankuirenID, String yuanxi, String chuli, String huifu) {
        this.id = id;//专业负责人的id
        this.yeshu = yeshu;
        this.fankuiren = fankuiren;
        this.fankuirenID = fankuirenID;
        this.yuanxi = yuanxi;
        this.chuli = chuli;
        this.huifu = huifu;
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

    public String getChuli() {
        return chuli;
    }

    public void setChuli(String chuli) {
        this.chuli = chuli;
    }

    public String getHuifu() {
        return huifu;
    }

    public void setHuifu(String huifu) {
        this.huifu = huifu;
    }

    @Override
    public String toString() {
        return "SearchXiaoxiRequest{" +
                "id='" + id + '\'' +
                ", yeshu='" + yeshu + '\'' +
                ", fankuiren='" + fankuiren + '\'' +
                ", fankuirenID='" + fankuirenID + '\'' +
                ", yuanxi='" + yuanxi + '\'' +
                ", chuli='" + chuli + '\'' +
                ", huifu='" + huifu + '\'' +
                '}';
    }
}
