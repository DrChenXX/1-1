package com.example.test.datatype;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchXiaoxiRequest {
    private String id;
    private String yeshu;
    private String fankuiren;
    private String fankuirenID;
    private String yuanxi;

    public SearchXiaoxiRequest() {
    }

    public SearchXiaoxiRequest(String id, String yeshu,String fankuiren, String fankuirenID, String yuanxi) {
        this.id = id;//专业负责人的id
        this.yeshu = yeshu;
        this.fankuiren = fankuiren;
        this.fankuirenID = fankuirenID;
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

    @Override
    public String toString() {
        return "SearchXiaoxiRequest{" +
                "id='" + id + '\'' +
                ", yeshu='" + yeshu + '\'' +
                ", fankuiren='" + fankuiren + '\'' +
                ", fankuirenID='" + fankuirenID + '\'' +
                ", yuanxi='" + yuanxi + '\'' +
                '}';
    }
}
