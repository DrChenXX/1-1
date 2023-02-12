package com.example.test.datatype;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchPeiyangmubiaoResponse {
    @JsonProperty("ID")
    private int ID;
    private String neirong;

    public SearchPeiyangmubiaoResponse() {
    }

    public SearchPeiyangmubiaoResponse(int number, String content) {
        this.ID = number;
        this.neirong = content;
    }

    public int getID() {
        return ID;
    }

    public void setID(int id) {
        this.ID = id;
    }

    public String getNeirong() {
        return neirong;
    }

    public void setNeirong(String content) {
        this.neirong = content;
    }

    @Override
    public String toString() {
        return "SearchPeiyangfanganResponse{" +
                "number=" + ID +
                ", content='" + neirong + '\'' +
                '}';
    }
}
