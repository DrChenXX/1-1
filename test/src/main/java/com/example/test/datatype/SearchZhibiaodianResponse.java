package com.example.test.datatype;

public class SearchZhibiaodianResponse {
    private int id;
    private String content;

    public SearchZhibiaodianResponse() {
    }

    public SearchZhibiaodianResponse(int id, String content) {
        this.id = id;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "SearchZhibiaodianResponse{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}
