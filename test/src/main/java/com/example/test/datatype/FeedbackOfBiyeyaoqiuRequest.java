package com.example.test.datatype;

public class FeedbackOfBiyeyaoqiuRequest {
    private String kechengid;

    public FeedbackOfBiyeyaoqiuRequest() {
    }

    public FeedbackOfBiyeyaoqiuRequest(String kechengid) {
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

