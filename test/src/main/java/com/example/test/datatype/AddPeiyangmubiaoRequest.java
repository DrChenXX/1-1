package com.example.test.datatype;

public class AddPeiyangmubiaoRequest {
    private String id;//培养方案id
    private String ID;//当前编号
    private String neirong;

    public AddPeiyangmubiaoRequest() {
    }

    public AddPeiyangmubiaoRequest(String id, String ID, String neirong) {
        this.id = id;
        this.ID = ID;
        this.neirong = neirong;
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

    @Override
    public String toString() {
        return "AddPeiyangmubiaoRequest{" +
                "id='" + id + '\'' +
                ", ID='" + ID + '\'' +
                ", neirong='" + neirong + '\'' +
                '}';
    }
}
