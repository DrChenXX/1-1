package com.example.test.model.entity;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author  cxy 
 * @create 2022-11-13 15:44 
 */

@Data
public class Yonghu {

	/**
	 * table name:ID
	 * table type:varchar(10)
	 * table comment:null
	 */
	private String id;

	/**
	 * table name:PASSWORD
	 * table type:varchar(30)
	 * table comment:null
	 */
	private String password;


	/**
	 * table name:NAME
	 * table type:varchar(10)
	 * table comment:null
	 */
	private String name;

	/**
	 * table name:DIANHUA
	 * table type:varchar(15)
	 * table comment:null
	 */
	private String dianhua;

	/**
	 * table name:YOUXIANG
	 * table type:varchar(30)
	 * table comment:null
	 */
	private String youxiang;

	public Yonghu(String id, String password,String name, String dianhua, String youxiang) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.dianhua = dianhua;
		this.youxiang = youxiang;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() { return password; }

	public void setPassword() { this.password = password; }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDianhua() {
		return dianhua;
	}

	public void setDianhua(String dianhua) {
		this.dianhua = dianhua;
	}

	public String getYouxiang() {
		return youxiang;
	}

	public void setYouxiang(String youxiang) {
		this.youxiang = youxiang;
	}

	@Override
	public String toString() {
		return "Yonghu{" +
				"id='" + id + '\'' +
				", password='" + password + '\'' +
				", name='" + name + '\'' +
				", dianhua='" + dianhua + '\'' +
				", youxiang='" + youxiang + '\'' +
				'}';
	}
}
