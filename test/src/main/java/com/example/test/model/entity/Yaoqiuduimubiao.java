package com.example.test.model.entity;

public class Yaoqiuduimubiao {
    /**
     * table name:ID
     * table type:varchar(10)
     * table comment:null
     */
    private String id;

    /**
     * table name:BIYEYAOQIU_ID
     * table type:varchar(10)
     * table comment:null
     */
    private String biyeyaoqiuId;

    /**
     * table name:PEIYANGMUBIAO_ID
     * table type:varchar(10)
     * table comment:null
     */
    private String peiyangmubiaoId;

    /**
     * table name:DATA
     * table type:varchar(20)
     * table comment:null
     */
    private String data;

    public Yaoqiuduimubiao() {
    }

    public Yaoqiuduimubiao(String id, String biyeyaoqiuId, String peiyangmubiaoId, String data) {
        this.id = id;
        this.biyeyaoqiuId = biyeyaoqiuId;
        this.peiyangmubiaoId = peiyangmubiaoId;
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBiyeyaoqiuId() {
        return biyeyaoqiuId;
    }

    public void setBiyeyaoqiuId(String biyeyaoqiuId) {
        this.biyeyaoqiuId = biyeyaoqiuId;
    }

    public String getPeiyangmubiaoId() {
        return peiyangmubiaoId;
    }

    public void setPeiyangmubiaoId(String peiyangmubiaoId) {
        this.peiyangmubiaoId = peiyangmubiaoId;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Yaoqiuduimubiao{" +
                "id='" + id + '\'' +
                ", biyeyaoqiuId='" + biyeyaoqiuId + '\'' +
                ", peiyangmubiaoId='" + peiyangmubiaoId + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
