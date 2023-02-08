package com.example.test.datatype;

public class SearchKaohefangshiRequest {
    private String kechengid;

    public SearchKaohefangshiRequest() {
    }

    public SearchKaohefangshiRequest(String kechengid) {
        this.kechengid = kechengid;
    }

    public String getKechengid() {
        return kechengid;
    }

    @Override
    public String toString() {
        return "SearchKaohefangshiRequest{" +
                "searchKaohefangshiRequest='" + kechengid + '\'' +
                '}';
    }
}

