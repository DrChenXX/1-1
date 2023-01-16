package com.example.test.model.entity;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author  cxy 
 * @create 2022-11-13 15:44 
 */

@Data
public class Zhibiaodian {

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
	 * table name:CONTENT
	 * table type:varchar(100)
	 * table comment:null
	 */
	private String content;

	public Zhibiaodian(String id, String biyeyaoqiuId, String content) {
		this.id = id;
		this.biyeyaoqiuId = biyeyaoqiuId;
		this.content = content;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Zhibiaodian{" +
				"id='" + id + '\'' +
				", biyeyaoqiuId='" + biyeyaoqiuId + '\'' +
				", content='" + content + '\'' +
				'}';
	}
}
