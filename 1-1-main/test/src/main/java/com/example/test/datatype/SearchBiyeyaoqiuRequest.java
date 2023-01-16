package com.example.test.datatype;

public class SearchBiyeyaoqiuRequest {
    private String peiyangfangan;

    public SearchBiyeyaoqiuRequest() {
    }

    public SearchBiyeyaoqiuRequest(String peiyangfangan) {
        this.peiyangfangan = peiyangfangan;
    }

    public String getPeiyangfangan() {
        return peiyangfangan;
    }

    public void setPeiyangfangan(String peiyangfangan) {
        this.peiyangfangan = peiyangfangan;
    }

    @Override
    public String toString() {
        return "SearchBiyeyaoqiuRequest{" +
                "peiyangfangan='" + peiyangfangan + '\'' +
                '}';
    }
}
