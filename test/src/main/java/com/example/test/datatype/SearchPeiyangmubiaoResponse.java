package com.example.test.datatype;

import com.fasterxml.jackson.annotation.JsonProperty;
public class SearchPeiyangmubiaoResponse {
    @JsonProperty("ID")
    private int ID;
    private String neirong;

    public SearchPeiyangmubiaoResponse() {
    }

    public SearchPeiyangmubiaoResponse(int ID, String content) {
        this.ID = ID;
        this.neirong = content;
    }

    @JsonProperty("ID")
    public int getID() {
        return ID;
    }

    @JsonProperty("ID")
    public void setID(int ID) {
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
        return "SearchPeiyangmubiaoResponse{" +
                "ID=" + ID +
                ", neirong='" + neirong + '\'' +
                '}';
    }
}
