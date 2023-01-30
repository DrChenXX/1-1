package com.example.test.datatype;

public class ConfirmMatrixOfBiyeyaoqiuRequest {
    private String kechengid;

    public ConfirmMatrixOfBiyeyaoqiuRequest() {
    }

    public ConfirmMatrixOfBiyeyaoqiuRequest(String kechengid) {
        this.kechengid = kechengid;
    }

    public String getKechengid() {
        return kechengid;
    }

    @Override
    public String toString() {
        return "ConfirmMatrixOfBiyeyaoqiu{" +
                "confirmMatrixOfBiyeyaoqiu='" + kechengid + '\'' +
                '}';
    }
}

