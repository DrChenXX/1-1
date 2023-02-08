package com.example.test.datatype;

public class SearchPeiyangmubiaoRequest {
    private String peiyangfangan;

    public SearchPeiyangmubiaoRequest() {
    }

    public SearchPeiyangmubiaoRequest(String peiyangfangan) {
        this.peiyangfangan = peiyangfangan;
    }

    public String getPeiyangfangan() {
        return peiyangfangan;
    }

    public void setPeiyangfangan(String peiyangfangan) {
        this.peiyangfangan = peiyangfangan;
    }
}
