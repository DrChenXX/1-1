package logic;

import database.ConnectDB;
import entity.Dangqiankecheng;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DangqiankechengMgr {

    // 增加单条信息
    public static void add(Dangqiankecheng d) {
        String sql =
                "INSERT INTO T_DANGQIANKECHENG(ID,KECHENG_ID,TEACHER_ID,SEMESTER,KKAIKESHIJIAN,XUEFEN) "+
                        "VALUES('"+
                        d.getId()+ "','"+
                        d.getKechengId() + "','" +
                        d.getTeacherId()+ "','" +
                        d.getSemester() + "','" +
                        d.getKaikeshijian() + "'," +
                        d.getXuefen() + ")";
        boolean check;
        check = ConnectDB.addContent(sql);
        if(check){
            System.out.println("增操作成功");
        } else {
            System.out.println("增操作失败");
        }
    }
    // 增加多条信息
    public static void add(List<Dangqiankecheng> ds) {
        List<String> sqls = new ArrayList<String>();
        for (Dangqiankecheng d :ds){
            String sql =
                    "INSERT INTO T_DANGQIANKECHENG(ID,KECHENG_ID,TEACHER_ID,SEMESTER,KKAIKESHIJIAN,XUEFEN) "+
                            "VALUES('"+
                            d.getId()+ "','"+
                            d.getKechengId() + "','" +
                            d.getTeacherId()+ "','" +
                            d.getSemester() + "','" +
                            d.getKaikeshijian() + "'," +
                            d.getXuefen() + ")";
            sqls.add(sql);
        }
        boolean check;
        check = ConnectDB.addContent(sqls);
        if(check){
            System.out.println("增操作成功");
        } else {
            System.out.println("增操作失败");
        }
    }

    // 通过ID删除
    public static void deleteByID(String ID) {
        String sql = "DELETE FROM T_DANGQIANKECHENG WHERE ID = " + ID;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }
    // 通过课程ID删除
    public static void deleteByKechengID(String ID) {
        String sql = "DELETE FROM T_DANGQIANKECHENG WHERE KECHENG_ID = " + ID;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }
    // 通过老师ID删除
    public static void deleteByTeacherID(String ID) {
        String sql = "DELETE FROM T_DANGQIANKECHENG WHERE TEACHER_ID = " + ID;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }
    // 删除所有ID
    public static void deleteAll(){
        List<Dangqiankecheng> list = getAll();
        List<String> sqls = new ArrayList<String>();
        for(Dangqiankecheng d : list) {
            String sql = "DELETE FROM T_DANGQIANKECHENG WHERE ID = "+ d.getId();
            sqls.add(sql);
        }
        boolean check;
        check = ConnectDB.deleteContent(sqls);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }

    // 通过ID查
    public static Dangqiankecheng getByID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_DANGQIANKECHENG WHERE ID = " + ID);
        Dangqiankecheng d = new Dangqiankecheng(
                String.valueOf(list.get(0).get("ID")),
                String.valueOf(list.get(0).get("KECHENG_ID")),
                String.valueOf(list.get(0).get("TEACHER_ID")),
                String.valueOf(list.get(0).get("SEMESTER")),
                String.valueOf(list.get(0).get("KAIKESHIJIAN")),
                Integer.parseInt(String.valueOf(list.get(0).get("XUEFEN")))
        );
        return d;
    }
    // 通过课程ID查
    public static List<Dangqiankecheng> getByKechengID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_DANGQIANKECHENG WHERE KECHENG_ID = " + ID);
        List<Dangqiankecheng> result = new ArrayList<Dangqiankecheng>();
        for (Map<String,Object> map : list) {
            Dangqiankecheng d = new Dangqiankecheng(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("KECHENG_ID")),
                    String.valueOf(map.get("TEACHER_ID")),
                    String.valueOf(map.get("SEMESTER")),
                    String.valueOf(map.get("KAIKESHIJIAN")),
                    Integer.parseInt(String.valueOf(map.get("XUEFEN")))
            );
            result.add(d);
        }
        return result;
    }
    // 通过老师ID查
    public static List<Dangqiankecheng> getByTeacherID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_DANGQIANKECHENG WHERE TEACHER_ID = " + ID);
        List<Dangqiankecheng> result = new ArrayList<Dangqiankecheng>();
        for (Map<String,Object> map : list) {
            Dangqiankecheng d = new Dangqiankecheng(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("KECHENG_ID")),
                    String.valueOf(map.get("TEACHER_ID")),
                    String.valueOf(map.get("SEMESTER")),
                    String.valueOf(map.get("KAIKESHIJIAN")),
                    Integer.parseInt(String.valueOf(map.get("XUEFEN")))
            );
            result.add(d);
        }
        return result;
    }
    // 查全部ID
    public static List<Dangqiankecheng> getAll() {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_DANGQIANKECHENG");
        List<Dangqiankecheng> result = new ArrayList<Dangqiankecheng>();
        for (Map<String,Object> map : list) {
            Dangqiankecheng d = new Dangqiankecheng(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("KECHENG_ID")),
                    String.valueOf(map.get("TEACHER_ID")),
                    String.valueOf(map.get("SEMESTER")),
                    String.valueOf(map.get("KAIKESHIJIAN")),
                    Integer.parseInt(String.valueOf(map.get("XUEFEN")))
            );
            result.add(d);
        }
        return result;
    }
}
