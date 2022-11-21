package com.example.test.datatype;

public class SearchPeiyangfanganResponse {
    private int number;
    private String content;

    public SearchPeiyangfanganResponse() {
    }

    public SearchPeiyangfanganResponse(int number, String content) {
        this.number = number;
        this.content = content;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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
                "number=" + number +
                ", content='" + content + '\'' +
                '}';
    }
}
