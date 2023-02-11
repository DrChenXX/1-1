package com.example.test.datatype;

public class ReleaseRenwuRequest {
    private String renwuID;

    public ReleaseRenwuRequest() {
    }

    public ReleaseRenwuRequest(String renwuID) {
        this.renwuID = renwuID;
    }

    public String getRenwuID() {
        return renwuID;
    }

    public void setRenwuID(String renwuID) {
        this.renwuID = renwuID;
    }

    @Override
    public String toString() {
        return "ReleaseRenwuRequest{" +
                "renwuID='" + renwuID + '\'' +
                '}';
    }
}
