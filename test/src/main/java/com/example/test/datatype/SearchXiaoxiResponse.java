package com.example.test.datatype;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchXiaoxiResponse {
    @JsonProperty("ID")
    String ID;
    String fankuiren;
    @JsonProperty("fankuirenID")
    String fankuirenID;
    String yuanxi;
    String data;

    public SearchXiaoxiResponse(String ID, String fankuiren, String fankuirenID,
                                String yuanxi, String data) {
        this.ID = ID;
        this.fankuiren = fankuiren;
        this.fankuirenID = fankuirenID;
        this.yuanxi = yuanxi;
        this.data = data;
    }

    @JsonProperty("ID")
    public String getID() {
        return ID;
    }

    @JsonProperty("ID")
    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFankuiren() {
        return fankuiren;
    }

    public void setFankuiren(String fankuiren) {
        this.fankuiren = fankuiren;
    }

    @JsonProperty("fankuirenID")
    public String getFankuirenID() {
        return fankuirenID;
    }

    @JsonProperty("fankuirenID")
    public void setFankuirenID(String fankuirenID) {
        this.fankuirenID = fankuirenID;
    }

    public String getYuanxi() {
        return yuanxi;
    }

    public void setYuanxi(String yuanxi) {
        this.yuanxi = yuanxi;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
