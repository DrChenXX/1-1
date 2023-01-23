package com.example.test.datatype;

public class SearchZhuanyeRequest {
    private String userid;

    public SearchZhuanyeRequest() {
    }

    public SearchZhuanyeRequest(String userid) {
        this.userid = userid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "SearchZhuanyeRequest{" +
                "userid='" + userid + '\'' +
                '}';
    }
}
