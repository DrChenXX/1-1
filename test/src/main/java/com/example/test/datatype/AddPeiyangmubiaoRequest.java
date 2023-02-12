package com.example.test.datatype;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddPeiyangmubiaoRequest {
    private String fanganid;//培养方案id
    @JsonProperty("ID")
    private String ID;//当前编号
    private String neirong;

    public AddPeiyangmubiaoRequest() {
    }

    public AddPeiyangmubiaoRequest(String fanganid, String ID, String neirong) {
        this.fanganid = fanganid;
        this.ID = ID;
        this.neirong = neirong;
    }

    public String getFanganid() {
        return fanganid;
    }

    public void setFanganid(String id) {
        this.fanganid = id;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNeirong() {
        return neirong;
    }

    public void setNeirong(String neirong) {
        this.neirong = neirong;
    }

    @Override
    public String toString() {
        return "AddPeiyangmubiaoRequest{" +
                "fanganid='" + fanganid + '\'' +
                ", ID='" + ID + '\'' +
                ", neirong='" + neirong + '\'' +
                '}';
    }
}
