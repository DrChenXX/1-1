package com.example.test.datatype;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class SearchYaoqiuduimubiaoResponse {
    @JsonProperty("tableHeader")
    TableHeader tableHeader;
    @JsonProperty("tableData")
    List<TableData> tableData;

    public SearchYaoqiuduimubiaoResponse() {
    }

    public SearchYaoqiuduimubiaoResponse(TableHeader tableHeader, List<TableData> tableData) {
        this.tableHeader = tableHeader;
        this.tableData = tableData;
    }

    @JsonProperty("tableHeader")
    public TableHeader getTableHeader() {
        return tableHeader;
    }

    @JsonProperty("tableHeader")
    public void setTableHeader(TableHeader tableHeader) {
        this.tableHeader = tableHeader;
    }

    @JsonProperty("tableData")
    public List<TableData> getTableData() {
        return tableData;
    }

    @JsonProperty("tableData")
    public void setTableData(List<TableData> tableData) {
        this.tableData = tableData;
    }

    @Override
    public String toString() {
        return "SearchYaoqiuduimubiaoResponse{" +
                "tableHeader=" + tableHeader +
                ", tableData=" + tableData +
                '}';
    }
}
