package com.example.test.datatype;

public class SearchZhibiaodianResponse {
    private int id;
    private String neirong;

    public SearchZhibiaodianResponse() {
    }

    public SearchZhibiaodianResponse(int id, String content) {
        this.id = id;
        this.neirong = content;
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

    @Override
    public String toString() {
        return "SearchZhibiaodianResponse{" +
                "id=" + id +
                ", content='" + neirong + '\'' +
                '}';
    }
}
