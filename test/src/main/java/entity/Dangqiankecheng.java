package entity;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author  cxy 
 * @create 2022-11-13 15:44 
 */

@Data
public class Dangqiankecheng {

	/**
	 * table name:ID
	 * table type:varchar(10)
	 * table comment:null
	 */
	private String id;

	/**
	 * table name:KECHENG_ID
	 * table type:varchar(15)
	 * table comment:null
	 */
	private String kechengId;

	/**
	 * table name:TEACHER_ID
	 * table type:varchar(10)
	 * table comment:null
	 */
	private String teacherId;

	/**
	 * table name:SEMESTER
	 * table type:varchar(10)
	 * table comment:null
	 */
	private String semester;

	/**
	 * table name:KAIKESHIJIAN
	 * table type:varchar(10)
	 * table comment:null
	 */
	private String kaikeshijian;

	/**
	 * table name:XUEFEN
	 * table type:int(11)
	 * table comment:null
	 */
	private Integer xuefen;

	public Dangqiankecheng(String id, String kechengId, String teacherId, String semester, String kaikeshijian, Integer xuefen) {
		this.id = id;
		this.kechengId = kechengId;
		this.teacherId = teacherId;
		this.semester = semester;
		this.kaikeshijian = kaikeshijian;
		this.xuefen = xuefen;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getKechengId() {
		return kechengId;
	}

	public void setKechengId(String kechengId) {
		this.kechengId = kechengId;
	}

	public String getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getKaikeshijian() {
		return kaikeshijian;
	}

	public void setKaikeshijian(String kaikeshijian) {
		this.kaikeshijian = kaikeshijian;
	}

	public Integer getXuefen() {
		return xuefen;
	}

	public void setXuefen(Integer xuefen) {
		this.xuefen = xuefen;
	}

	@Override
	public String toString() {
		return "Dangqiankecheng{" +
				"id='" + id + '\'' +
				", kechengId='" + kechengId + '\'' +
				", teacherId='" + teacherId + '\'' +
				", semester='" + semester + '\'' +
				", kaikeshijian='" + kaikeshijian + '\'' +
				", xuefen=" + xuefen +
				'}';
	}
}
