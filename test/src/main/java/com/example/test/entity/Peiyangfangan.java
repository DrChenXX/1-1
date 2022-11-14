package com.example.test.entity;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author  cxy 
 * @create 2022-11-13 15:44 
 */

@Data
public class Peiyangfangan {

	/**
	 * table name:ID
	 * table type:varchar(10)
	 * table comment:null
	 */
	private String id;

	/**
	 * table name:ZHUANYE_ID
	 * table type:varchar(10)
	 * table comment:null
	 */
	private String zhuanyeId;

	/**
	 * table name:VERSION
	 * table type:varchar(10)
	 * table comment:null
	 */
	private String version;

	public Peiyangfangan(String id, String zhuanyeId, String version) {
		this.id = id;
		this.zhuanyeId = zhuanyeId;
		this.version = version;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getZhuanyeId() {
		return zhuanyeId;
	}

	public void setZhuanyeId(String zhuanyeId) {
		this.zhuanyeId = zhuanyeId;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Peiyangfangan{" +
				"id='" + id + '\'' +
				", zhuanyeId='" + zhuanyeId + '\'' +
				", version='" + version + '\'' +
				'}';
	}
}
