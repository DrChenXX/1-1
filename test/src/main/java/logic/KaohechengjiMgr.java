package logic;

import database.ConnectDB;
import entity.Kaohechengji;
import org.springframework.core.KotlinDetector;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class KaohechengjiMgr {
    // 增加单条信息
    public static void add(Kaohechengji k) {
        String sql =
                "INSERT INTO T_KAOHECHENGJI(ID,XUESHENG_ID,DANGQIANKAOHE_ID,SCORE) "+
                        "VALUES('"+
                        k.getId()+ "','"+
                        k.getXueshengId() + "','" +
                        k.getDangqiankaoheId() + "'," +
                        k.getScore()+ ")";
        boolean check;
        check = ConnectDB.addContent(sql);
        if(check){
            System.out.println("增操作成功");
        } else {
            System.out.println("增操作失败");
        }
    }
    // 增加多条信息
    public static void add(List<Kaohechengji> ks) {
        List<String> sqls = new ArrayList<String>();
        for (Kaohechengji k : ks){
            String sql =
                    "INSERT INTO T_KAOHECHENGJI(ID,XUESHENG_ID,DANGQIANKAOHE_ID,SCORE) "+
                            "VALUES('"+
                            k.getId()+ "','"+
                            k.getXueshengId() + "','" +
                            k.getDangqiankaoheId() + "'," +
                            k.getScore()+ ")";
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
        String sql = "DELETE FROM T_KAOHECHENGJI WHERE ID = " + ID;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }
    // 通过学生ID删除
    public static void deleteByXueshengID(String ID) {
        String sql = "DELETE FROM T_KAOHECHENGJI WHERE XUESHENG_ID = " + ID;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }
    // 通过当前考核ID删除
    public static void deleteByDangqiankaoheID(String ID) {
        String sql = "DELETE FROM T_KAOHECHENGJI WHERE DANGQIANKAOHE_ID = " + ID;
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
        List<Kaohechengji> list = getAll();
        List<String> sqls = new ArrayList<String>();
        for(Kaohechengji k : list) {
            String sql = "DELETE FROM T_KAOHECHENGJI WHERE ID = "+ k.getId();
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
    public static Kaohechengji getByID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_KAOHECHENGJI WHERE ID = " + ID);
        Kaohechengji k = new Kaohechengji(
                String.valueOf(list.get(0).get("ID")),
                String.valueOf(list.get(0).get("XUESHENG_ID")),
                String.valueOf(list.get(0).get("DANGQIANKAOHE_ID")),
                Integer.parseInt(String.valueOf(list.get(0).get("SCORE")))
        );
        return k;
    }
    // 通过学生ID查
    public static List<Kaohechengji> getByXueshengID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_KAOHECHENGJI WHERE XUESHENG_ID = " + ID);
        List<Kaohechengji> result = new ArrayList<Kaohechengji>();
        for (Map<String,Object> map : list) {
            Kaohechengji k = new Kaohechengji(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("XUESHENG_ID")),
                    String.valueOf(map.get("DANGQIANKAOHE")),
                    Integer.parseInt(String.valueOf(map.get("SCORE")))
            );
            result.add(k);
        }
        return result;
    }
    // 通过当前考核ID查
    public static List<Kaohechengji> getByDangqiankaoheID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_KAOHECHENGJI WHERE DANGQIANKAOHE_ID = " + ID);
        List<Kaohechengji> result = new ArrayList<Kaohechengji>();
        for (Map<String,Object> map : list) {
            Kaohechengji k = new Kaohechengji(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("XUESHENG_ID")),
                    String.valueOf(map.get("DANGQIANKAOHE")),
                    Integer.parseInt(String.valueOf(map.get("SCORE")))
            );
            result.add(k);
        }
        return result;
    }
    // 查所有ID
    public static List<Kaohechengji> getAll() {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_KAOHECHENGJI");
        List<Kaohechengji> result = new ArrayList<Kaohechengji>();
        for (Map<String,Object> map : list) {
            Kaohechengji k = new Kaohechengji(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("XUESHENG_ID")),
                    String.valueOf(map.get("DANGQIANKAOHE")),
                    Integer.parseInt(String.valueOf(map.get("SCORE")))
            );
            result.add(k);
        }
        return result;
    }

}
