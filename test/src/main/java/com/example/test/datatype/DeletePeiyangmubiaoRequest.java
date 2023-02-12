package com.example.test.datatype;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeletePeiyangmubiaoRequest {
    private String fanganid;//培养方案id
    @JsonProperty("ID")
    private String ID;//当前编号

    public DeletePeiyangmubiaoRequest() {
    }

    public DeletePeiyangmubiaoRequest(String id, String ID) {
        this.fanganid = id;
        this.ID = ID;
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

    @Override
    public String toString() {
        return "DeletePeiyangmubiaoRequest{" +
                "id='" + fanganid + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }
}
