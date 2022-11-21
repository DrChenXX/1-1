package com.example.test.interfaces.model.entity;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author  cxy 
 * @create 2022-11-13 15:44 
 */

@Data
public class Dangqiankaohe {
	// 当前考核 表
	/**
	 * table name:ID
	 * table type:varchar(10)
	 * table comment:null
	 */
	private String id;

	/**
	 * table name:CONTENT
	 * table type:varchar(100)
	 * table comment:null
	 */
	private String content;

	/**
	 * table name:DANGQIANKECHENG_ID
	 * table type:varchar(10)
	 * table comment:null
	 */
	private String dangqiankechengId;

	/**
	 * table name:DANGQIANMUBIAO_ID
	 * table type:varchar(10)
	 * table comment:null
	 */
	private String dangqianmubiaoId;

	/**
	 * table name:KAOHE_ID
	 * table type:varchar(10)
	 * table comment:null
	 */
	private String kaoheId;

	/**
	 * table name:ZHANBI
	 * table type:int(11)
	 * table comment:null
	 */
	private Integer zhanbi;

	public Dangqiankaohe(String id, String content, String dangqiankechengId, String dangqianmubiaoId, String kaoheId, Integer zhanbi) {
		this.id = id;
		this.content = content;
		this.dangqiankechengId = dangqiankechengId;
		this.dangqianmubiaoId = dangqianmubiaoId;
		this.kaoheId = kaoheId;
		this.zhanbi = zhanbi;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDangqiankechengId() {
		return dangqiankechengId;
	}

	public void setDangqiankechengId(String dangqiankechengId) {
		this.dangqiankechengId = dangqiankechengId;
	}

	public String getDangqianmubiaoId() {
		return dangqianmubiaoId;
	}

	public void setDangqianmubiaoId(String dangqianmubiaoId) {
		this.dangqianmubiaoId = dangqianmubiaoId;
	}

	public String getKaoheId() {
		return kaoheId;
	}

	public void setKaoheId(String kaoheId) {
		this.kaoheId = kaoheId;
	}

	public Integer getZhanbi() {
		return zhanbi;
	}

	public void setZhanbi(Integer zhanbi) {
		this.zhanbi = zhanbi;
	}

	@Override
	public String toString() {
		return "Dangqiankaohe{" +
				"id='" + id + '\'' +
				", content='" + content + '\'' +
				", dangqiankechengId='" + dangqiankechengId + '\'' +
				", dangqianmubiaoId='" + dangqianmubiaoId + '\'' +
				", kaoheId='" + kaoheId + '\'' +
				", zhanbi=" + zhanbi +
				'}';
	}
}
