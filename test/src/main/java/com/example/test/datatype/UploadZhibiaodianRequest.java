package com.example.test.datatype;

public class UploadZhibiaodianRequest {
    private String kechengid;

    public UploadZhibiaodian() {
    }

    public UploadZhibiaodianRequest(String kechengid) {
        this.kechengid = kechengid;
    }

    public String getKechengid() {
        return kechengid;
    }

    @Override
    public String toString() {
        return "UploadZhibiaodian{" +
                "UploadZhibiaodian='" + kechengid + '\'' +
                '}';
    }
}

