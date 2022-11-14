package com.example.test.entity;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author  cxy 
 * @create 2022-11-13 15:44 
 */

@Data
public class Peiyangmubiao {

	/**
	 * table name:ID
	 * table type:varchar(10)
	 * table comment:null
	 */
	private String id;

	/**
	 * table name:PEIYANGFANGAN_ID
	 * table type:varchar(10)
	 * table comment:null
	 */
	private String peiyangfanganId;

	/**
	 * table name:CONTENT
	 * table type:varchar(200)
	 * table comment:null
	 */
	private String content;

	public Peiyangmubiao(String id, String peiyangfanganId, String content) {
		this.id = id;
		this.peiyangfanganId = peiyangfanganId;
		this.content = content;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPeiyangfanganId() {
		return peiyangfanganId;
	}

	public void setPeiyangfanganId(String peiyangfanganId) {
		this.peiyangfanganId = peiyangfanganId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String  toString() {
		return "Peiyangmubiao{" +
				"id='" + id + '\'' +
				", peiyangfanganId='" + peiyangfanganId + '\'' +
				", content='" + content + '\'' +
				'}';
	}
}
