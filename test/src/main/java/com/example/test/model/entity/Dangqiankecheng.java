package com.example.test.model.entity;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author  cxy 
 * @create 2022-11-13 15:44 
 */

@Data
public class Dangqiankecheng {
	// 当前课程 表
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
	 * table name:TEACHER_ID
	 * table type:varchar(10)
	 * table comment:null
	 */
	private String teacherId;

	/**
	 * table name:SEMESTER
	 * table type:varchar(10)
	 * table comment:null
	 */
	private String semester;

	/**
	 * table name:NIANJI
	 * table type:varchar(10)
	 * table comment:null
	 */
	private String nianji;

	/**
	 * table name:KAIKESHIJIAN
	 * table type:varchar(10)
	 * table comment:null
	 */
	private String kaikeshijian;

	/**
	 * table name:XUEFEN
	 * table type:int(11)
	 * table comment:null
	 */
	private Integer xuefen;

	/**
	 * table name:CURTASK
	 * table type:varchar(10)
	 * table comment:null
	 */
	private String curtask;

	/**
	 * table name:TASK1_0
	 * table type:varchar(10)
	 * table comment:null
	 */
	private String task1_0;

	/**
	 * table name:TASK1_1
	 * table type:varchar(10)
	 * table comment:null
	 */
	private String task1_1;

	/**
	 * table name:TASK2
	 * table type:varchar(10)
	 * table comment:null
	 */
	private String task2;

	/**
	 * table name:TASK3
	 * table type:varchar(10)
	 * table comment:null
	 */
	private String task3;

	/**
	 * table name:TASK4
	 * table type:varchar(10)
	 * table comment:null
	 */
	private String task4;

	public Dangqiankecheng(String id, String kechengId, String teacherId,
						   String semester, String nianji, String kaikeshijian, Integer xuefen,
						   String curtask, String task1_0, String task1_1,
						   String task2, String task3, String task4) {
		this.id = id;
		this.kechengId = kechengId;
		this.teacherId = teacherId;
		this.semester = semester;
		this.nianji = nianji;
		this.kaikeshijian = kaikeshijian;
		this.xuefen = xuefen;
		this.curtask = curtask;
		this.task1_0 = task1_0;
		this.task1_1 = task1_1;
		this.task2 = task2;
		this.task3 = task3;
		this.task4 = task4;
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

	public String getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getNianji() {
		return nianji;
	}

	public void setNianji(String nianji) {
		this.nianji = nianji;
	}

	public String getKaikeshijian() {
		return kaikeshijian;
	}

	public void setKaikeshijian(String kaikeshijian) {
		this.kaikeshijian = kaikeshijian;
	}

	public Integer getXuefen() {
		return xuefen;
	}

	public void setXuefen(Integer xuefen) {
		this.xuefen = xuefen;
	}

	public String getCurtask() {
		return curtask;
	}

	public void setCurtask(String curtask) {
		this.curtask = curtask;
	}

	public String getTask1_0() {
		return task1_0;
	}

	public void setTask1_0(String task1_0) {
		this.task1_0 = task1_0;
	}

	public String getTask1_1() {
		return task1_1;
	}

	public void setTask1_1(String task1_1) {
		this.task1_1 = task1_1;
	}

	public String getTask2() {
		return task2;
	}

	public void setTask2(String task2) {
		this.task2 = task2;
	}

	public String getTask3() {
		return task3;
	}

	public void setTask3(String task3) {
		this.task3 = task3;
	}

	public String getTask4() {
		return task4;
	}

	public void setTask4(String task4) {
		this.task4 = task4;
	}

	@Override
	public String toString() {
		return "Dangqiankecheng{" +
				"id='" + id + '\'' +
				", kechengId='" + kechengId + '\'' +
				", teacherId='" + teacherId + '\'' +
				", semester='" + semester + '\'' +
				", nianji='" + nianji + '\'' +
				", kaikeshijian='" + kaikeshijian + '\'' +
				", xuefen=" + xuefen +
				", curtask='" + curtask + '\'' +
				", task1_0='" + task1_0 + '\'' +
				", task1_1='" + task1_1 + '\'' +
				", task2='" + task2 + '\'' +
				", task3='" + task3 + '\'' +
				", task4='" + task4 + '\'' +
				'}';
	}
}
