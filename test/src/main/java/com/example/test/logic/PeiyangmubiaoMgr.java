package com.example.test.logic;

import com.example.test.database.ConnectDB;
import com.example.test.entity.Peiyangmubiao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PeiyangmubiaoMgr {
    /**
     * ID
     * PEIYANGFANGAN_ID
     * CONTENT
     */

    public static void add(Peiyangmubiao p) {
        String sql =
                "INSERT INTO T_PEIYANGMUBIAO(ID,PEIYANGFANGAN_ID,CONTENT) "+
                        "VALUES('"+
                        p.getId() + "','" +
                        p.getPeiyangfanganId() + "','" +
                        p.getContent() + "')";
        boolean check;
        check = ConnectDB.addContent(sql);
        if (check){
            System.out.println("增操作成功");
        } else {
            System.out.println("增操作失败");
        }
    }

    public static void add(List<Peiyangmubiao> ps) {
        List<String> sqls = new ArrayList<String>();
        for (Peiyangmubiao p : ps) {
            String sql =
                    "INSERT INTO T_PEIYANGMUBIAO(ID,PEIYANGFANGAN_ID,CONTENT) "+
                            "VALUES('"+
                            p.getId() + "','" +
                            p.getPeiyangfanganId() + "','" +
                            p.getContent() + "')";
            sqls.add(sql);
        }
        boolean check;
        check = ConnectDB.addContent(sqls);
        if (check){
            System.out.println("增操作成功");
        } else {
            System.out.println("增操作失败");
        }
    }

    public static void deleteByID(String ID) {
        String sql = "DELETE FROM T_PEIYANGMUBIAO WHERE ID = " + ID;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }

    public static void deleteByPEIYANGFANGANID(String ID) {
        String sql = "DELETE FROM T_PEIYANGMUBIAO WHERE PEIYANGFANGAN_ID = " + ID;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }

    public static void deleteAll(){
        List<Peiyangmubiao> list = getAll();
        List<String> sqls = new ArrayList<String>();
        for(Peiyangmubiao p : list) {
            String sql = "DELETE FROM T_PEIYANGMUBIAO WHERE ID = "+ p.getId();
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

    public static Peiyangmubiao getByID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_PEIYANGMUBIAO WHERE ID = " + ID);
        Peiyangmubiao p = new Peiyangmubiao(
                String.valueOf(list.get(0).get("ID")),
                String.valueOf(list.get(0).get("PEIYANGFANGAN_ID")),
                String.valueOf(list.get(0).get("CONTENT"))
        );
        return p;
    }

    public static List<Peiyangmubiao> getByPEIYANGFANGANID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_PEIYANGMUBIAO WHERE PEIYANGFANGAN_ID = " + ID);
        List <Peiyangmubiao> result = new ArrayList<Peiyangmubiao>();
        for (Map<String,Object> map : list) {
            Peiyangmubiao p = new Peiyangmubiao(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("PEIYANGFANGAN_ID")),
                    String.valueOf(map.get("CONTENT"))
            );
            result.add(p);
        }
        return result;
    }

    public static List<Peiyangmubiao> getAll() {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_PEIYANGMUBIAO");
        List<Peiyangmubiao> result = new ArrayList<Peiyangmubiao>();
        for (Map<String,Object> map : list) {
            Peiyangmubiao p = new Peiyangmubiao(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("PEIYANGFANGAN_ID")),
                    String.valueOf(map.get("CONTENT"))
            );
            result.add(p);
        }
        return result;
    }
}
