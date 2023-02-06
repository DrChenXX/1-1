package com.example.test.model.entity;

import lombok.Data;

/**
 * @author  cxy
 * @create 2023-2-3 17:10
 */

@Data
public class Xiaoxi {

    /**
     * table name:ID
     * table type:varchar(10)
     * table comment:null
     */
    private String id;

    /**
     * table name:FROM_ID
     * table type:varchar(10)
     * table comment:null
     */
    private String fromId;

    /**
     * table name:FROMNAME
     * table type:varchar(20)
     * table comment:null
     */
    private String fromName;

    /**
     * table name:TO_ID
     * table type:varchar(10)
     * table comment:null
     */
    private String toId;

    /**
     * table name:TONAME
     * table type:varchar(20)
     * table comment:null
     */
    private String toName;

    /**
     * table name:ISREAD
     * table type:varchar(10)
     * table comment:null
     */
    private String isRead;

    /**
     * table name:DATA
     * table type:varchar(200)
     * table comment:null
     */
    private String data;

    /**
     * table name:PEIYANGANGFANID
     * table type:varchar(10)
     * table comment:null
     */
    private String peiyangfanganID;

    public Xiaoxi() {
    }

    public Xiaoxi(String id, String fromId, String fromName,
                  String toId, String toName, String isRead,
                  String data, String peiyangfanganID) {
        this.id = id;
        this.fromId = fromId;
        this.fromName = fromName;
        this.toId = toId;
        this.toName = toName;
        this.isRead = "未读";
        this.data = data;
        this.peiyangfanganID = peiyangfanganID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFromId() {
        return fromId;
    }

    public void setFromId(String fromId) {
        this.fromId = fromId;
    }

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public String getToId() {
        return toId;
    }

    public void setToId(String toId) {
        this.toId = toId;
    }

    public String getToName() {
        return toName;
    }

    public void setToName(String toName) {
        this.toName = toName;
    }

    public String getIsRead() {
        return isRead;
    }

    public void setIsRead(String isRead) {
        this.isRead = isRead;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getPeiyangfanganID() {
        return peiyangfanganID;
    }

    public void setPeiyangfanganID(String peiyangfanganID) {
        this.peiyangfanganID = peiyangfanganID;
    }

    @Override
    public String toString() {
        return "Xiaoxi{" +
                "id='" + id + '\'' +
                ", fromId='" + fromId + '\'' +
                ", fromName='" + fromName + '\'' +
                ", toId='" + toId + '\'' +
                ", toName='" + toName + '\'' +
                ", isRead='" + isRead + '\'' +
                ", data='" + data + '\'' +
                ", peiyangfanganID='" + peiyangfanganID + '\'' +
                '}';
    }
}
