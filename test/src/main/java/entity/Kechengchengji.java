package entity;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author  cxy 
 * @create 2022-11-13 15:44 
 */

@Data
public class Kechengchengji {

	/**
	 * table name:ID
	 * table type:varchar(10)
	 * table comment:null
	 */
	private String id;

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
	 * table name:CHENGJI
	 * table type:int(11)
	 * table comment:null
	 */
	private Integer chengji;

	public Kechengchengji(String id, String dangqiankechengId, String dangqianmubiaoId, Integer chengji) {
		this.id = id;
		this.dangqiankechengId = dangqiankechengId;
		this.dangqianmubiaoId = dangqianmubiaoId;
		this.chengji = chengji;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public Integer getChengji() {
		return chengji;
	}

	public void setChengji(Integer chengji) {
		this.chengji = chengji;
	}

	@Override
	public String toString() {
		return "Kechengchengji{" +
				"id='" + id + '\'' +
				", dangqiankechengId='" + dangqiankechengId + '\'' +
				", dangqianmubiaoId='" + dangqianmubiaoId + '\'' +
				", chengji=" + chengji +
				'}';
	}
}
