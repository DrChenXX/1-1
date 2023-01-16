package com.example.test.datatype;

public class SearchZhibiaodianRequest {
    private String peiyangfangan;
    private String biyemubiao;

    public SearchZhibiaodianRequest() {
    }

    public SearchZhibiaodianRequest(String peiyangfangan, String biyemubiao) {
        this.peiyangfangan = peiyangfangan;
        this.biyemubiao = biyemubiao;
    }

    public SearchZhibiaodianRequest(String peiyangfangan) {
        this.peiyangfangan = peiyangfangan;
    }

    public String getPeiyangfangan() {
        return peiyangfangan;
    }

    public void setPeiyangfangan(String peiyangfangan) {
        this.peiyangfangan = peiyangfangan;
    }

    public String getBiyemubiao() {
        return biyemubiao;
    }

    public void setBiyemubiao(String biyemubiao) {
        this.biyemubiao = biyemubiao;
    }

    @Override
    public String toString() {
        return "SearchZhibiaodianRequest{" +
                "peiyangfangan='" + peiyangfangan + '\'' +
                ", biyemubiao='" + biyemubiao + '\'' +
                '}';
    }
}
