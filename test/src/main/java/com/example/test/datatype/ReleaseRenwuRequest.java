package com.example.test.datatype;

public class ReleaseRenwuRequest {
    private String renwuID;
    private String kaikenianji;

    public ReleaseRenwuRequest() {
    }

    public ReleaseRenwuRequest(String renwuID, String kaikenianji) {
        this.renwuID = renwuID;
        this.kaikenianji = kaikenianji;
    }

    public String getRenwuID() {
        return renwuID;
    }

    public void setRenwuID(String renwuID) {
        this.renwuID = renwuID;
    }

    public String getKaikenianji() {
        return kaikenianji;
    }

    public void setKaikenianji(String kaikenianji) {
        this.kaikenianji = kaikenianji;
    }

    @Override
    public String toString() {
        return "ReleaseRenwu{" +
                "renwuID='" + renwuID + '\'' +
                ", kaikenianji='" + kaikenianji + '\'' +
                '}';
    }
}
