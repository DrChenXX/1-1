package com.example.test.datatype;

public class SearchTeacherRequest {
    private String id;
    private String name;
    private String yuanxi;

    public SearchTeacherRequest() {
    }

    public SearchTeacherRequest(String id, String name, String yuanxi) {
        this.id = id;
        this.name = name;
        this.yuanxi = yuanxi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYuanxi() {
        return yuanxi;
    }

    public void setYuanxi(String yuanxi) {
        this.yuanxi = yuanxi;
    }

    @Override
    public String toString() {
        return "SearchTeacherRequest{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", yuanxi='" + yuanxi + '\'' +
                '}';
    }
}
