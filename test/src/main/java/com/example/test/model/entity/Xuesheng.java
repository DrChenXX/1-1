package com.example.test.model.entity;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author  cxy 
 * @create 2022-11-13 15:44 
 */

@Data
public class Xuesheng {

	/**
	 * table name:ID
	 * table type:varchar(20)
	 * table comment:null
	 */
	private String id;

	/**
	 * table name:NAME
	 * table type:varchar(20)
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
	 * table name:GRADE
	 * table type:varchar(10)
	 * table comment:null
	 */
	private String grade;

	/**
	 * table name:BANJI
	 * table type:varchar(20)
	 * table comment:null
	 */
	private String banji;

	/**
	 * table name:YUANXI
	 * table type:varchar(20)
	 * table comment:null
	 */
	private String yuanxi;

	public Xuesheng() {
	}

	public Xuesheng(String id, String name, String zhuanyeId, String grade, String banji, String yuanxi) {
		this.id = id;
		this.name = name;
		this.zhuanyeId = zhuanyeId;
		this.grade = grade;
		this.banji = banji;
		this.yuanxi = yuanxi;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getZhuanyeId() {
		return zhuanyeId;
	}

	public void setZhuanyeId(String zhuanyeId) {
		this.zhuanyeId = zhuanyeId;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getBanji() {
		return banji;
	}

	public void setBanji(String banji) {
		this.banji = banji;
	}

	public String getYuanxi() {
		return yuanxi;
	}

	public void setYuanxi(String yuanxi) {
		this.yuanxi = yuanxi;
	}

	@Override
	public String toString() {
		return "Xuesheng{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", zhuanyeId='" + zhuanyeId + '\'' +
				", grade='" + grade + '\'' +
				", banji='" + banji + '\'' +
				", yuanxi='" + yuanxi + '\'' +
				'}';
	}
}
