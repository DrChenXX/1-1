package entity;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author  cxy 
 * @create 2022-11-13 15:44 
 */

@Data
public class Dangqianmubiao {
	// 当前目标 表
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
	 * table name:MUBIAO_ID
	 * table type:varchar(10)
	 * table comment:null
	 */
	private String mubiaoId;

	/**
	 * table name:CONTENT
	 * table type:varchar(100)
	 * table comment:null
	 */
	private String content;

	public Dangqianmubiao(String id, String dangqiankechengId, String mubiaoId, String content) {
		this.id = id;
		this.dangqiankechengId = dangqiankechengId;
		this.mubiaoId = mubiaoId;
		this.content = content;
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

	public String getMubiaoId() {
		return mubiaoId;
	}

	public void setMubiaoId(String mubiaoId) {
		this.mubiaoId = mubiaoId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Dangqianmubiao{" +
				"id='" + id + '\'' +
				", dangqiankechengId='" + dangqiankechengId + '\'' +
				", mubiaoId='" + mubiaoId + '\'' +
				", content='" + content + '\'' +
				'}';
	}
}
