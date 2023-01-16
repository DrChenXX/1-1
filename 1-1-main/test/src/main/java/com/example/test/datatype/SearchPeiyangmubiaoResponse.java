package com.example.test.datatype;

public class SearchPeiyangmubiaoResponse {
    private int id;
    private String content;

    public SearchPeiyangmubiaoResponse() {
    }

    public SearchPeiyangmubiaoResponse(int number, String content) {
        this.id = number;
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
        return "SearchPeiyangfanganResponse{" +
                "number=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}
