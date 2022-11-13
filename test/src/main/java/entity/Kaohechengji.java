package entity;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author  cxy 
 * @create 2022-11-13 15:44 
 */

@Data
public class Kaohechengji {

	/**
	 * table name:ID
	 * table type:varchar(10)
	 * table comment:null
	 */
	private String id;

	/**
	 * table name:XUESHENG_ID
	 * table type:varchar(20)
	 * table comment:null
	 */
	private String xueshengId;

	/**
	 * table name:DANGQIANKAOHE_ID
	 * table type:varchar(10)
	 * table comment:null
	 */
	private String dangqiankaoheId;

	/**
	 * table name:SCORE
	 * table type:int(11)
	 * table comment:null
	 */
	private Integer score;

	public Kaohechengji(String id, String xueshengId, String dangqiankaoheId, Integer score) {
		this.id = id;
		this.xueshengId = xueshengId;
		this.dangqiankaoheId = dangqiankaoheId;
		this.score = score;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getXueshengId() {
		return xueshengId;
	}

	public void setXueshengId(String xueshengId) {
		this.xueshengId = xueshengId;
	}

	public String getDangqiankaoheId() {
		return dangqiankaoheId;
	}

	public void setDangqiankaoheId(String dangqiankaoheId) {
		this.dangqiankaoheId = dangqiankaoheId;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}
}
