package com.example.test.datatype;

public class SearchPeiyangmubiaoResponse {
    private String id;
    private String content;

    public SearchPeiyangmubiaoResponse() {
    }

    public SearchPeiyangmubiaoResponse(String number, String content) {
        this.id = number;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
