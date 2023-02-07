package com.example.test.datatype;

public class SearchTeacherRequest {
    private String id;
    private String yeshu;
    private String userid;
    private String name;
    private String yuanxi;

    public SearchTeacherRequest() {
    }

    public SearchTeacherRequest(String id, String yeshu, String userid, String name, String yuanxi) {
        this.id = id;
        this.yeshu = yeshu;
        this.userid = userid;
        this.name = name;
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

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
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
                ", yeshu='" + yeshu + '\'' +
                ", userid='" + userid + '\'' +
                ", name='" + name + '\'' +
                ", yuanxi='" + yuanxi + '\'' +
                '}';
    }
}
