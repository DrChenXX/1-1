package com.example.test.datatype;

public class DeletePeiyangmubiaoRequest {
    private String id;//培养方案id
    private String ID;//当前编号

    public DeletePeiyangmubiaoRequest() {
    }

    public DeletePeiyangmubiaoRequest(String id, String ID) {
        this.id = id;
        this.ID = ID;
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

    @Override
    public String toString() {
        return "DeletePeiyangmubiaoRequest{" +
                "id='" + id + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }
}
