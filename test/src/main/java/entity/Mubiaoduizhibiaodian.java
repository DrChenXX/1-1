package entity;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author  cxy 
 * @create 2022-11-13 15:44 
 */

@Data
public class Mubiaoduizhibiaodian {

	/**
	 * table name:ID
	 * table type:varchar(10)
	 * table comment:null
	 */
	private String id;

	/**
	 * table name:KECHENGMUBIAO_ID
	 * table type:varchar(10)
	 * table comment:null
	 */
	private String kechengmubiaoId;

	/**
	 * table name:ZHIBIAODIAN_ID
	 * table type:varchar(10)
	 * table comment:null
	 */
	private String zhibiaodianId;

	/**
	 * table name:CONTENT
	 * table type:varchar(100)
	 * table comment:null
	 */
	private String content;

	public Mubiaoduizhibiaodian(String id, String kechengmubiaoId, String zhibiaodianId, String content) {
		this.id = id;
		this.kechengmubiaoId = kechengmubiaoId;
		this.zhibiaodianId = zhibiaodianId;
		this.content = content;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getKechengmubiaoId() {
		return kechengmubiaoId;
	}

	public void setKechengmubiaoId(String kechengmubiaoId) {
		this.kechengmubiaoId = kechengmubiaoId;
	}

	public String getZhibiaodianId() {
		return zhibiaodianId;
	}

	public void setZhibiaodianId(String zhibiaodianId) {
		this.zhibiaodianId = zhibiaodianId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
