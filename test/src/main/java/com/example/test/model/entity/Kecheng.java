package com.example.test.model.entity;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author  cxy 
 * @create 2022-11-13 15:44 
 */

@Data
public class Kecheng {
	// 课程 表
	/**
	 * table name:ID
	 * table type:varchar(15)
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
	 * table name:TEACHER_ID
	 * table type:varchar(10)
	 * table comment:null
	 */
	private String teacherId;

	/**
	 * table name:PEIYANGFANGAN_ID
	 * table type:varchar(10)
	 * table comment:null
	 */
	private String peiyangfanganId;

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
	 * table name:LEIBIE
	 * table type:varchar(20)
	 * table comment:null
	 */
	private String leibie;

	/**
	 * table name:ISDAGANG
	 * table type:varchar(10)
	 * table comment:null
	 */
	private String isdagang;

	public Kecheng(String id, String name, String teacherId,
				   String peiyangfanganId, String kaikeshijian,
				   Integer xuefen, String leibie, String isdagang) {
		this.id = id;
		this.name = name;
		this.teacherId = teacherId;
		this.peiyangfanganId = peiyangfanganId;
		this.kaikeshijian = kaikeshijian;
		this.xuefen = xuefen;
		this.leibie = leibie;
		this.isdagang = isdagang;
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

	public String getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}

	public String getPeiyangfanganId() {
		return peiyangfanganId;
	}

	public void setPeiyangfanganId(String peiyangfanganId) {
		this.peiyangfanganId = peiyangfanganId;
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

	public String getLeibie() {
		return leibie;
	}

	public void setLeibie(String leibie) {
		this.leibie = leibie;
	}

	public String getIsdagang() {
		return isdagang;
	}

	public void setIsdagang(String isdagang) {
		this.isdagang = isdagang;
	}

	@Override
	public String toString() {
		return "Kecheng{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", teacherId='" + teacherId + '\'' +
				", peiyangfanganId='" + peiyangfanganId + '\'' +
				", kaikeshijian='" + kaikeshijian + '\'' +
				", xuefen=" + xuefen +
				", leibie='" + leibie + '\'' +
				", isdagang='" + isdagang + '\'' +
				'}';
	}
}
