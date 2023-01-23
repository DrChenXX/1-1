package com.example.test.datatype;

public class SearchPeiyangfanganRequest {
    private String userid;

    public SearchPeiyangfanganRequest() {
    }

    public SearchPeiyangfanganRequest(String userid) {
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
        return "SearchPeiyangfanganRequest{" +
                "userid='" + userid + '\'' +
                '}';
    }
}
