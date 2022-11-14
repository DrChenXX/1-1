package com.example.test.entity;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author  cxy 
 * @create 2022-11-13 15:44 
 */

@Data
public class Xueshengduizhibiaodian {

	/**
	 * table name:ID
	 * table type:varchar(10)
	 * table comment:null
	 */
	private String id;

	/**
	 * table name:XUESHENG_ID
	 * table type:varchar(20)
	 * table comment:null
	 */
	private String xueshengId;

	/**
	 * table name:ZHIBIAODIAN_ID
	 * table type:varchar(10)
	 * table comment:null
	 */
	private String zhibiaodianId;

	/**
	 * table name:CHENGJI
	 * table type:int(11)
	 * table comment:null
	 */
	private Integer chengji;

	public Xueshengduizhibiaodian(String id, String xueshengId, String zhibiaodianId, Integer chengji) {
		this.id = id;
		this.xueshengId = xueshengId;
		this.zhibiaodianId = zhibiaodianId;
		this.chengji = chengji;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getXueshengId() {
		return xueshengId;
	}

	public void setXueshengId(String xueshengId) {
		this.xueshengId = xueshengId;
	}

	public String getZhibiaodianId() {
		return zhibiaodianId;
	}

	public void setZhibiaodianId(String zhibiaodianId) {
		this.zhibiaodianId = zhibiaodianId;
	}

	public Integer getChengji() {
		return chengji;
	}

	public void setChengji(Integer chengji) {
		this.chengji = chengji;
	}

	@Override
	public String toString() {
		return "Xueshengduizhibiaodian{" +
				"id='" + id + '\'' +
				", xueshengId='" + xueshengId + '\'' +
				", zhibiaodianId='" + zhibiaodianId + '\'' +
				", chengji=" + chengji +
				'}';
	}
}
