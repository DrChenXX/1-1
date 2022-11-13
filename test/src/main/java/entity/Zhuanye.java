package entity;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author  cxy 
 * @create 2022-11-13 15:44 
 */

@Data
public class Zhuanye {

	/**
	 * table name:ID
	 * table type:varchar(10)
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
	 * table name:FUZEREN_ID
	 * table type:varchar(10)
	 * table comment:null
	 */
	private String fuzerenId;

	public Zhuanye(String id, String name, String fuzerenId) {
		this.id = id;
		this.name = name;
		this.fuzerenId = fuzerenId;
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

	public String getFuzerenId() {
		return fuzerenId;
	}

	public void setFuzerenId(String fuzerenId) {
		this.fuzerenId = fuzerenId;
	}

	@Override
	public String toString() {
		return "Zhuanye{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", fuzerenId='" + fuzerenId + '\'' +
				'}';
	}
}
