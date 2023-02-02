package com.example.test.datatype;

public class DownloadZhibiaodianRequest {
    private String kechengid;

    public DownloadZhibiaodianRequest() {
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

