package entity;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author  cxy 
 * @create 2022-11-13 15:44 
 */

@Data
public class Kaohe {

	/**
	 * table name:ID
	 * table type:varchar(10)
	 * table comment:null
	 */
	private String id;

	/**
	 * table name:CONTENT
	 * table type:varchar(100)
	 * table comment:null
	 */
	private String content;

	/**
	 * table name:KECHENG_ID
	 * table type:varchar(10)
	 * table comment:null
	 */
	private String kechengId;

	/**
	 * table name:KECHENGMUBIAO_ID
	 * table type:varchar(10)
	 * table comment:null
	 */
	private String kechengmubiaoId;

	/**
	 * table name:ZHANBI
	 * table type:int(11)
	 * table comment:null
	 */
	private Integer zhanbi;

	public Kaohe(String id, String content, String kechengId, String kechengmubiaoId, Integer zhanbi) {
		this.id = id;
		this.content = content;
		this.kechengId = kechengId;
		this.kechengmubiaoId = kechengmubiaoId;
		this.zhanbi = zhanbi;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getKechengId() {
		return kechengId;
	}

	public void setKechengId(String kechengId) {
		this.kechengId = kechengId;
	}

	public String getKechengmubiaoId() {
		return kechengmubiaoId;
	}

	public void setKechengmubiaoId(String kechengmubiaoId) {
		this.kechengmubiaoId = kechengmubiaoId;
	}

	public Integer getZhanbi() {
		return zhanbi;
	}

	public void setZhanbi(Integer zhanbi) {
		this.zhanbi = zhanbi;
	}
}
