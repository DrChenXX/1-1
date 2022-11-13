package entity;

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

	public Yonghu(String id, String name, String dianhua, String youxiang) {
		this.id = id;
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
}
