package logic;

import database.ConnectDB;
import entity.Kecheng;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class KechengMgr {

    // 增加单条信息
    public static void add(Kecheng k) {
        String sql =
                "INSERT INTO T_KECHENG(ID,NAME,TEACHER_ID,PEIYANGFANGAN_ID,KAIKESHIJIAN,XUEFEN) "+
                        "VALUES('"+
                        k.getId()+ "','"+
                        k.getName() + "','" +
                        k.getTeacherId() + "','" +
                        k.getPeiyangfanganId() + "','" +
                        k.getKaikeshijian() + "'," +
                        k.getXuefen()+ ")";
        boolean check;
        check = ConnectDB.addContent(sql);
        if(check){
            System.out.println("增操作成功");
        } else {
            System.out.println("增操作失败");
        }
    }
    // 增加多条信息
    public static void add(List<Kecheng> ks) {
        List<String> sqls = new ArrayList<String>();
        for (Kecheng k : ks){
            String sql =
                    "INSERT INTO T_KECHENG(ID,NAME,TEACHER_ID,PEIYANGFANGAN_ID,KAIKESHIJIAN,XUEFEN) "+
                            "VALUES('"+
                            k.getId()+ "','"+
                            k.getName() + "','" +
                            k.getTeacherId() + "','" +
                            k.getPeiyangfanganId() + "','" +
                            k.getKaikeshijian() + "'," +
                            k.getXuefen()+ ")";
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
        String sql = "DELETE FROM T_KECHENG WHERE ID = " + ID;
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
        String sql = "DELETE FROM T_KECHENG WHERE TEACHER_ID = " + ID;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }
    // 通往过培养方案ID删除
    public static void deleteByPeiyangfanganID(String ID) {
        String sql = "DELETE FROM T_KECHENG WHERE PEIYANGFANGAN_ID = " + ID;
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
        List<Kecheng> list = getAll();
        List<String> sqls = new ArrayList<String>();
        for(Kecheng k : list) {
            String sql = "DELETE FROM T_KECHENG WHERE ID = "+ k.getId();
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
    public static Kecheng getByID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_KECHENG WHERE ID = " + ID);
        Kecheng k = new Kecheng(
                String.valueOf(list.get(0).get("ID")),
                String.valueOf(list.get(0).get("NAME")),
                String.valueOf(list.get(0).get("TEACHER_ID")),
                String.valueOf(list.get(0).get("PEIYANGFANGAN_ID")),
                String.valueOf(list.get(0).get("KAIKESHIJIAN")),
                Integer.parseInt(String.valueOf(list.get(0).get("XUEFEN")))
        );
        return k;
    }
    // 通过老师ID查
    public static List<Kecheng> getByTeacherID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_KECHENG WHERE TEACHER_ID = " + ID);
        List<Kecheng> result = new ArrayList<Kecheng>();
        for (Map<String,Object> map : list) {
            Kecheng k = new Kecheng(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("NAME")),
                    String.valueOf(map.get("TEACHER_ID")),
                    String.valueOf(map.get("PEIYANGFANGAN_ID")),
                    String.valueOf(map.get("KAIKESHIJIAN")),
                    Integer.parseInt(String.valueOf(map.get("XUEFEN")))
            );
            result.add(k);
        }
        return result;
    }
    // 通过培养方案ID查
    public static List<Kecheng> getByPeiyangfanganID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_KECHENG WHERE PEIYANGFANGAN_ID = " + ID);
        List<Kecheng> result = new ArrayList<Kecheng>();
        for (Map<String,Object> map : list) {
            Kecheng k = new Kecheng(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("NAME")),
                    String.valueOf(map.get("TEACHER_ID")),
                    String.valueOf(map.get("PEIYANGFANGAN_ID")),
                    String.valueOf(map.get("KAIKESHIJIAN")),
                    Integer.parseInt(String.valueOf(map.get("XUEFEN")))
            );
            result.add(k);
        }
        return result;
    }
    // 查所有ID
    public static List<Kecheng> getAll() {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_KECHENG");
        List<Kecheng> result = new ArrayList<Kecheng>();
        for (Map<String,Object> map : list) {
            Kecheng k = new Kecheng(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("NAME")),
                    String.valueOf(map.get("TEACHER_ID")),
                    String.valueOf(map.get("PEIYANGFANGAN_ID")),
                    String.valueOf(map.get("KAIKESHIJIAN")),
                    Integer.parseInt(String.valueOf(map.get("XUEFEN")))
            );
            result.add(k);
        }
        return result;
    }
}
