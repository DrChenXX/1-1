package com.example.test.datatype;

public class SaveMatrixOfBiyeyaoqiuRequest {
    private String kechengid;

    public SaveMatrixOfBiyeyaoqiuRequest() {
    }

    public SaveMatrixOfBiyeyaoqiuRequest(String kechengid) {
        this.kechengid = kechengid;
    }

    public String getKechengid() {
        return kechengid;
    }

    @Override
    public String toString() {
        return "SaveMatrixOfBiyeyaoqiuRequest{" +
                "saveMatrixOfBiyeyaoqiuRequest='" + kechengid + '\'' +
                '}';
    }
}

