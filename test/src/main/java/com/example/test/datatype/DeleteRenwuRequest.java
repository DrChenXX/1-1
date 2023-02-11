package com.example.test.datatype;

public class DeleteRenwuRequest {
    private String renwuID;

    public DeleteRenwuRequest() {
    }

    public DeleteRenwuRequest(String renwuID) {
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
        return "DeleteRenwuRequest{" +
                "renwuID='" + renwuID + '\'' +
                '}';
    }
}
