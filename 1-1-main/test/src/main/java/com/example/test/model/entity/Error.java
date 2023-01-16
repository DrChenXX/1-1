package com.example.test.model.entity;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Timestamp;

/**
 * @author  cxy 
 * @create 2022-11-13 15:44 
 */

@Data
public class Error {
	// 错误 表
	/**
	 * table name:ID
	 * table type:varchar(10)
	 * table comment:null
	 */
	private String id;

	/**
	 * table name:SHIJIAN
	 * table type:time
	 * table comment:null
	 */
	private Timestamp shijian;

	/**
	 * table name:CONTENT
	 * table type:varchar(200)
	 * table comment:null
	 */
	private String content;

	public Error(String id, Timestamp shijian, String content) {
		this.id = id;
		this.shijian = shijian;
		this.content = content;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Timestamp getShijian() {
		return shijian;
	}

	public void setShijian(Timestamp shijian) {
		this.shijian = shijian;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Error{" +
				"id='" + id + '\'' +
				", shijian=" + shijian +
				", content='" + content + '\'' +
				'}';
	}
}
