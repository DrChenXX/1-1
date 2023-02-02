package com.example.test.datatype;

public class DowmloadZhibiaodianRequest {
    private String kechengid;

    public DowmloadZhibiaodianRequest() {
    }

    public void setKechengid(String kechengid) {
        this.kechengid = kechengid;
    }

    public String getKechengid() {
        return kechengid;
    }

    @Override
    public String toString() {
        return "DowmloadZhibiaodianRequest{" +
                "DowmloadZhibiaodianRequest=" + kechengid + '\'' +
                '}';
    }
}

