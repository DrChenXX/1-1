package com.example.test.datatype;

public class FeedbackMatrixOfBiyeyaoqiuRequest {
    private String kechengid;

    public FeedbackMatrixOfBiyeyaoqiuRequest() {
    }

    public FeedbackMatrixOfBiyeyaoqiuRequest(String kechengid) {
        this.kechengid = kechengid;
    }

    public String getKechengid() {
        return kechengid;
    }

    @Override
    public String toString() {
        return "FeedbackMatrixOfBiyeyaoqiuRequest{" +
                "feedbackMatrixOfBiyeyaoqiuRequest='" + kechengid + '\'' +
                '}';
    }
}

