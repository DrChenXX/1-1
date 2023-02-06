package com.example.test.datatype;

public class SearchXiaoxiRequest {
    private String id;

    public SearchXiaoxiRequest() {
    }

    public SearchXiaoxiRequest(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "SearchXiaoxiRequest{" +
                "id='" + id + '\'' +
                '}';
    }
}
