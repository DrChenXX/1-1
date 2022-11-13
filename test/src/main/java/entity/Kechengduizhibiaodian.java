package entity;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author  cxy 
 * @create 2022-11-13 15:44 
 */

@Data
public class Kechengduizhibiaodian {

	/**
	 * table name:Column_4
	 * table type:varchar(10)
	 * table comment:null
	 */
	private String column4;

	/**
	 * table name:KECHENG_ID
	 * table type:varchar(15)
	 * table comment:null
	 */
	private String kechengId;

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

	public Kechengduizhibiaodian(String column4, String kechengId, String zhibiaodianId, String content) {
		this.column4 = column4;
		this.kechengId = kechengId;
		this.zhibiaodianId = zhibiaodianId;
		this.content = content;
	}

	public String getColumn4() {
		return column4;
	}

	public void setColumn4(String column4) {
		this.column4 = column4;
	}

	public String getKechengId() {
		return kechengId;
	}

	public void setKechengId(String kechengId) {
		this.kechengId = kechengId;
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

	@Override
	public String toString() {
		return "Kechengduizhibiaodian{" +
				"column4='" + column4 + '\'' +
				", kechengId='" + kechengId + '\'' +
				", zhibiaodianId='" + zhibiaodianId + '\'' +
				", content='" + content + '\'' +
				'}';
	}
}
