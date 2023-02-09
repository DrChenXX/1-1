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

	/**
	 * table name:TOKEN
	 * table type:varchar(200)
	 * table comment:null
	 */
	private String token;

	/**
	 * table name:TYPE
	 * table type:varchar(10)
	 * table comment:null
	 */
	private String type;

	/**
	 * table name:YUANXI
	 * table type:varchar(20)
	 * table comment:null
	 */
	private String yuanxi;

	/**
	 * table name:ZHICHENG
	 * table type:varchar(20)
	 * table comment:null
	 */
	private String zhicheng;

	public Yonghu() {
	}

	public Yonghu(String id, String password, String name,
				  String dianhua, String youxiang, String token,
				  String type, String yuanxi, String zhicheng) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.dianhua = dianhua;
		this.youxiang = youxiang;
		this.token = token;
		this.type = type;
		this.yuanxi = yuanxi;
		this.zhicheng = zhicheng;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

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

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getYuanxi() {
		return yuanxi;
	}

	public void setYuanxi(String yuanxi) {
		this.yuanxi = yuanxi;
	}

	public String getZhicheng() {
		return zhicheng;
	}

	public void setZhicheng(String zhicheng) {
		this.zhicheng = zhicheng;
	}

	@Override
	public String toString() {
		return "Yonghu{" +
				"id='" + id + '\'' +
				", password='" + password + '\'' +
				", name='" + name + '\'' +
				", dianhua='" + dianhua + '\'' +
				", youxiang='" + youxiang + '\'' +
				", token='" + token + '\'' +
				", type='" + type + '\'' +
				", yuanxi='" + yuanxi + '\'' +
				", zhicheng='" + zhicheng + '\'' +
				'}';
	}
}
