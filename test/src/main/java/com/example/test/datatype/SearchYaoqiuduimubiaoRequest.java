package com.example.test.datatype;

public class SearchYaoqiuduimubiaoRequest {
    private String peiyangfanganId;

    public SearchYaoqiuduimubiaoRequest() {
    }

    public SearchYaoqiuduimubiaoRequest(String peiyangfanganId) {
        this.peiyangfanganId = peiyangfanganId;
    }

    public String getPeiyangfanganId() {
        return peiyangfanganId;
    }

    public void setPeiyangfanganId(String peiyangfanganId) {
        this.peiyangfanganId = peiyangfanganId;
    }

    @Override
    public String toString() {
        return "SearchYaoqiuduimubiaoRequest{" +
                "peiyangfanganId='" + peiyangfanganId + '\'' +
                '}';
    }
}
