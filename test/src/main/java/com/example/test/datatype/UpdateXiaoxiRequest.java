package com.example.test.datatype;

public class UpdateXiaoxiRequest {
    private String id;
    private String data;

    public UpdateXiaoxiRequest() {
    }

    public UpdateXiaoxiRequest(String id, String data) {
        this.id = id;
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "updateXiaoxiRequest{" +
                "id='" + id + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
