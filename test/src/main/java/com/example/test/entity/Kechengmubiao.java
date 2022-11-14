package com.example.test.entity;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author  cxy 
 * @create 2022-11-13 15:44 
 */

@Data
public class Kechengmubiao {
	// 课程目标 表
	/**
	 * table name:ID
	 * table type:varchar(10)
	 * table comment:null
	 */
	private String id;

	/**
	 * table name:KECHENG_ID
	 * table type:varchar(15)
	 * table comment:null
	 */
	private String kechengId;

	/**
	 * table name:CONTENT
	 * table type:varchar(100)
	 * table comment:null
	 */
	private String content;

	public Kechengmubiao(String id, String kechengId, String content) {
		this.id = id;
		this.kechengId = kechengId;
		this.content = content;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getKechengId() {
		return kechengId;
	}

	public void setKechengId(String kechengId) {
		this.kechengId = kechengId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Kechengmubiao{" +
				"id='" + id + '\'' +
				", kechengId='" + kechengId + '\'' +
				", content='" + content + '\'' +
				'}';
	}
}
