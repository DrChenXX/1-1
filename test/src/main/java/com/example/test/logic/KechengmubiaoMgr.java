package com.example.test.logic;

import com.example.test.database.ConnectDB;
import com.example.test.entity.Kechengmubiao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class KechengmubiaoMgr {

    // 增加单条信息
    public static void add(Kechengmubiao k) {
        String sql =
                "INSERT INTO T_KECHENGMUBIAO(ID,KECHENG_ID,CONTENT) "+
                        "VALUES('"+
                        k.getId()+ "','"+
                        k.getKechengId() + "','" +
                        k.getContent() + "')";
        boolean check;
        check = ConnectDB.addContent(sql);
        if(check){
            System.out.println("增操作成功");
        } else {
            System.out.println("增操作失败");
        }
    }
    // 增加多条信息
    public static void add(List<Kechengmubiao> ks) {
        List<String> sqls = new ArrayList<String>();
        for (Kechengmubiao k : ks){
            String sql =
                    "INSERT INTO T_KECHENGMUBIAO(ID,KECHENG_ID,CONTENT) "+
                            "VALUES('"+
                            k.getId()+ "','"+
                            k.getKechengId() + "','" +
                            k.getContent() + "')";
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
        String sql = "DELETE FROM T_KECHENGMUBIAO WHERE ID = " + ID;
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
        String sql = "DELETE FROM T_KECHENGMUBIAO WHERE KECHENG_ID = " + ID;
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
        List<Kechengmubiao> list = getAll();
        List<String> sqls = new ArrayList<String>();
        for(Kechengmubiao k : list) {
            String sql = "DELETE FROM T_KECHENGMUBIAO WHERE ID = "+ k.getId();
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
    public static Kechengmubiao getByID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_KECHENGMUBIAO WHERE ID = " + ID);
        Kechengmubiao k = new Kechengmubiao(
                String.valueOf(list.get(0).get("ID")),
                String.valueOf(list.get(0).get("KECHENG_ID")),
                String.valueOf(list.get(0).get("CONTENT"))
        );
        return k;
    }
    // 通过课程ID查
    public static List<Kechengmubiao> getByKechengID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_KECHENGMUBIAO WHERE KECHENG_ID = " + ID);
        List<Kechengmubiao> result = new ArrayList<Kechengmubiao>();
        for (Map<String,Object> map : list) {
            Kechengmubiao k = new Kechengmubiao(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("KECHENG_ID")),
                    String.valueOf(map.get("CONTENT"))
            );
            result.add(k);
        }
        return result;
    }
    // 查所有ID
    public static List<Kechengmubiao> getAll() {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_KECHENGMUBIAO");
        List<Kechengmubiao> result = new ArrayList<Kechengmubiao>();
        for (Map<String,Object> map : list) {
            Kechengmubiao k = new Kechengmubiao(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("KECHENG_ID")),
                    String.valueOf(map.get("CONTENT"))
            );
            result.add(k);
        }
        return result;
    }
}
