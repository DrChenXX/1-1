package com.example.test.datatype;

import java.util.List;

public class SearchBiyeyaoqiuResponse {
    private int id;
    private String neirong;

    public SearchBiyeyaoqiuResponse() {
    }

    public SearchBiyeyaoqiuResponse(int id, String neirong) {
        this.id = id;
        this.neirong = neirong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNeirong() {
        return neirong;
    }

    public void setNeirong(String neirong) {
        this.neirong = neirong;
    }

    public List<SearchZhibiaodianResponse> getZhibiaodian() {
        return zhibiaodian;
    }

    public void setZhibiaodian(List<SearchZhibiaodianResponse> zhibiaodian) {
        this.zhibiaodian = zhibiaodian;
    }

    @Override
    public String toString() {
        return "SearchBiyeyaoqiuResponse{" +
                "id=" + id +
                ", neirong='" + neirong + '\'' +
                ", zhibiaodian=" + zhibiaodian +
                '}';
    }
}
