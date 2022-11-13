package entity;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author  cxy 
 * @create 2022-11-13 15:44 
 */

@Data
public class Dangqianduizhibiaodian {
	// 当前课程对应指标点 表
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
	 * table name:ZHIBIAODIAN_ID
	 * table type:varchar(10)
	 * table comment:null
	 */
	private String zhibiaodianId;

	/**
	 * table name:YUAN_ID
	 * table type:varchar(10)
	 * table comment:null
	 */
	private String yuanId;

	/**
	 * table name:CONTENT
	 * table type:varchar(100)
	 * table comment:null
	 */
	private String content;

	/**
	 * table name:CHENGJI
	 * table type:int(11)
	 * table comment:null
	 */
	private Integer chengji;

	public Dangqianduizhibiaodian(String id, String dangqiankechengId, String zhibiaodianId, String yuanId, String content, Integer chengji) {
		this.id = id;
		this.dangqiankechengId = dangqiankechengId;
		this.zhibiaodianId = zhibiaodianId;
		this.yuanId = yuanId;
		this.content = content;
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

	public String getZhibiaodianId() {
		return zhibiaodianId;
	}

	public void setZhibiaodianId(String zhibiaodianId) {
		this.zhibiaodianId = zhibiaodianId;
	}

	public String getYuanId() {
		return yuanId;
	}

	public void setYuanId(String yuanId) {
		this.yuanId = yuanId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getChengji() {
		return chengji;
	}

	public void setChengji(Integer chengji) {
		this.chengji = chengji;
	}

	@Override
	public String toString() {
		return "Dangqianduizhibiaodian{" +
				"id='" + id + '\'' +
				", dangqiankechengId='" + dangqiankechengId + '\'' +
				", zhibiaodianId='" + zhibiaodianId + '\'' +
				", yuanId='" + yuanId + '\'' +
				", content='" + content + '\'' +
				", chengji=" + chengji +
				'}';
	}
}
