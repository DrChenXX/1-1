package com.example.test.datatype;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdatePeiyangmubiaoRequest {
    private String fanganid;
    @JsonProperty("ID")
    private String ID;
    private String neirong;
    @JsonProperty("oldID")
    private String oldID;
    private String oldneirong;

    public UpdatePeiyangmubiaoRequest() {
    }

    public UpdatePeiyangmubiaoRequest(String id, String ID, String neirong, String oldID, String oldneirong) {
        this.fanganid = id;
        this.ID = ID;
        this.neirong = neirong;
        this.oldID = oldID;
        this.oldneirong = oldneirong;
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

    public String getOldID() {
        return oldID;
    }

    public void setOldID(String oldID) {
        this.oldID = oldID;
    }

    public String getOldneirong() {
        return oldneirong;
    }

    public void setOldneirong(String oldneirong) {
        this.oldneirong = oldneirong;
    }

    @Override
    public String toString() {
        return "UpdatePeiyangmubiaoRequest{" +
                "id='" + fanganid + '\'' +
                ", ID='" + ID + '\'' +
                ", neirong='" + neirong + '\'' +
                ", oldID='" + oldID + '\'' +
                ", oldneirong='" + oldneirong + '\'' +
                '}';
    }
}
