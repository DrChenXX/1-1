package com.example.test.datatype;

public class Task11FeedbackSendRequest {
    private String courseid;
    private String zhichengdian;
    private String zhichi;
    private String xiugai;
    private String yijian;

    public Task11FeedbackSendRequest() {
    }

    public Task11FeedbackSendRequest(String courseid, String zhichengdian, String zhichi, String xiugai, String yijian) {
        this.courseid = courseid;
        this.zhichengdian = zhichengdian;
        this.zhichi = zhichi;
        this.xiugai = xiugai;
        this.yijian = yijian;
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    public String getZhichengdian() {
        return zhichengdian;
    }

    public void setZhichengdian(String zhichengdian) {
        this.zhichengdian = zhichengdian;
    }

    public String getZhichi() {
        return zhichi;
    }

    public void setZhichi(String zhichi) {
        this.zhichi = zhichi;
    }

    public String getXiugai() {
        return xiugai;
    }

    public void setXiugai(String xiugai) {
        this.xiugai = xiugai;
    }

    public String getYijian() {
        return yijian;
    }

    public void setYijian(String yijian) {
        this.yijian = yijian;
    }
}
