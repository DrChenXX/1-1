package com.example.test.datatype;

public class SearchDangqiankechengRequest {
    private String peiyangfangan;

    public SearchBiyeyaoqiuRequest() {
    }

    public SearchBiyeyaoqiuRequest(String dangqiankecheng) {
        this.dangqiankecheng = dangqiankecheng;
    }

    public String getDangqiankecheng() {
        return dangqiankecheng;
    }

    public void setDangqiankecheng(String dangqiankecheng) {
        this.dangqiankecheng = dangqiankecheng;
    }

    @Override
    public String toString() {
        return "SearchDangqiankecheng{" +
                "dangqiankecheng='" + dangqiankecheng + '\'' +
                '}';
    }
}

