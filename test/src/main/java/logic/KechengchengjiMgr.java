package logic;

import database.ConnectDB;
import entity.Kechengchengji;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class KechengchengjiMgr {

    // 增加单条信息
    public static void add(Kechengchengji k) {
        String sql =
                "INSERT INTO T_KECHENGCHENGJI(ID,DANGQIANKECHENG_ID,DANGQIANMUBIAO_ID,CHENGJI) "+
                        "VALUES('"+
                        k.getId()+ "','"+
                        k.getDangqiankechengId() + "','" +
                        k.getDangqianmubiaoId() + "'," +
                        k.getChengji() + ")";
        boolean check;
        check = ConnectDB.addContent(sql);
        if(check){
            System.out.println("增操作成功");
        } else {
            System.out.println("增操作失败");
        }
    }
    // 增加多条信息
    public static void add(List<Kechengchengji> ks) {
        List<String> sqls = new ArrayList<String>();
        for (Kechengchengji k : ks){
            String sql =
                    "INSERT INTO T_KECHENGCHENGJI(ID,DANGQIANKECHENG_ID,DANGQIANMUBIAO_ID,CHENGJI) "+
                            "VALUES('"+
                            k.getId()+ "','"+
                            k.getDangqiankechengId() + "','" +
                            k.getDangqianmubiaoId() + "'," +
                            k.getChengji() + ")";
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
        String sql = "DELETE FROM T_KECHENGCHENGJI WHERE ID = " + ID;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }
    // 通过当前课程ID删除
    public static void deleteByDangqiankechengID(String ID) {
        String sql = "DELETE FROM T_KECHENGCHENGJI WHERE DANGQIANKECHENG_ID = " + ID;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }
    // 通过当前目标ID删除
    public static void deleteByDangqianmubiaoID(String ID) {
        String sql = "DELETE FROM T_KECHENGCHENGJI WHERE DANGQIANMUBIAO_ID = " + ID;
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
        List<Kechengchengji> list = getAll();
        List<String> sqls = new ArrayList<String>();
        for(Kechengchengji k : list) {
            String sql = "DELETE FROM T_KECHENGCHENGJI WHERE ID = "+ k.getId();
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
    public static Kechengchengji getByID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_KECHENGCHENGJI WHERE ID = " + ID);
        Kechengchengji k = new Kechengchengji(
                String.valueOf(list.get(0).get("ID")),
                String.valueOf(list.get(0).get("DANGQIANKECHENG_ID")),
                String.valueOf(list.get(0).get("DANGQIANMUBIAO_ID")),
                Integer.parseInt(String.valueOf(list.get(0).get("CHENGJI")))
        );
        return k;
    }
    // 通过当前按课程ID查
    public static List<Kechengchengji> getByDangqiankechengID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_KECHENGCHENGJI WHERE DANGQIANKECHENG_ID = " + ID);
        List<Kechengchengji> result = new ArrayList<Kechengchengji>();
        for (Map<String,Object> map : list) {
            Kechengchengji k = new Kechengchengji(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("DANGQIANKECHENG_ID")),
                    String.valueOf(map.get("DANGQIANMUBIAO")),
                    Integer.parseInt(String.valueOf(map.get("CHENGJI")))
            );
            result.add(k);
        }
        return result;
    }
    // 通过当前目标ID查
    public static List<Kechengchengji> getByDangqianmubiaoID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_KECHENGCHENGJI WHERE DANGQIANMUBIAO_ID = " + ID);
        List<Kechengchengji> result = new ArrayList<Kechengchengji>();
        for (Map<String,Object> map : list) {
            Kechengchengji k = new Kechengchengji(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("DANGQIANKECHENG_ID")),
                    String.valueOf(map.get("DANGQIANMUBIAO")),
                    Integer.parseInt(String.valueOf(map.get("CHENGJI")))
            );
            result.add(k);
        }
        return result;
    }
    // 查所有ID
    public static List<Kechengchengji> getAll() {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_KECHENGCHENGJI");
        List<Kechengchengji> result = new ArrayList<Kechengchengji>();
        for (Map<String,Object> map : list) {
            Kechengchengji k = new Kechengchengji(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("DANGQIANKECHENG_ID")),
                    String.valueOf(map.get("DANGQIANMUBIAO")),
                    Integer.parseInt(String.valueOf(map.get("CHENGJI")))
            );
            result.add(k);
        }
        return result;
    }
}
