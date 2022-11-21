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
	 * table type:int(11)
	 * table comment:null
	 */
	private Integer grade;

	public Xuesheng(String id, String name, String zhuanyeId, Integer grade) {
		this.id = id;
		this.name = name;
		this.zhuanyeId = zhuanyeId;
		this.grade = grade;
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

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Xuesheng{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", zhuanyeId='" + zhuanyeId + '\'' +
				", grade=" + grade +
				'}';
	}
}
