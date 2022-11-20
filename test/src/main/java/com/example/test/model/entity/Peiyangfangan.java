package com.example.test.model.entity;

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
	 * table name:NAME
	 * table type:varchar(30)
	 * table comment:null
	 */
	private String name;

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

	public Peiyangfangan(String id, String name, String zhuanyeId, String version) {
		this.id = id;
		this.name = name;
		this.zhuanyeId = zhuanyeId;
		this.version = version;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() { return name;}

	public void setName(String name) { this.name = name; }

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
