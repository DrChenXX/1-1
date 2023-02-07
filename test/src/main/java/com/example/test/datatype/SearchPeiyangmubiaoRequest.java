package com.example.test.datatype;

public class SearchPeiyangmubiaoRequest {
    private String id;

    public SearchPeiyangmubiaoRequest() {
    }

    public SearchPeiyangmubiaoRequest(String id) {
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
        return "SearchPeiyangmubiaoRequest{" +
                "id='" + id + '\'' +
                '}';
    }
}
