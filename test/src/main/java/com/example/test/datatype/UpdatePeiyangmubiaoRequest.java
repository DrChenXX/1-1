package com.example.test.datatype;

public class UpdatePeiyangmubiaoRequest {
    private String id;
    private String ID;
    private String neirong;
    private String oldID;
    private String oldneirong;

    public UpdatePeiyangmubiaoRequest() {
    }

    public UpdatePeiyangmubiaoRequest(String id, String ID, String neirong, String oldID, String oldneirong) {
        this.id = id;
        this.ID = ID;
        this.neirong = neirong;
        this.oldID = oldID;
        this.oldneirong = oldneirong;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNeirong() {
        return neirong;
    }

    public void setNeirong(String neirong) {
        this.neirong = neirong;
    }

    public String getOldID() {
        return oldID;
    }

    public void setOldID(String oldID) {
        this.oldID = oldID;
    }

    public String getOldneirong() {
        return oldneirong;
    }

    public void setOldneirong(String oldneirong) {
        this.oldneirong = oldneirong;
    }

    @Override
    public String toString() {
        return "UpdatePeiyangmubiaoRequest{" +
                "id='" + id + '\'' +
                ", ID='" + ID + '\'' +
                ", neirong='" + neirong + '\'' +
                ", oldID='" + oldID + '\'' +
                ", oldneirong='" + oldneirong + '\'' +
                '}';
    }
}
