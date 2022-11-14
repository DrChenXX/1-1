package com.example.test.logic;

import com.example.test.database.ConnectDB;
import com.example.test.entity.Biyeyaoqiu;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BiyeyaoqiuMgr {
    /**
     * ID
     * PEIYANGFANGAN_ID
     * CONTENT
     */
    // 增加单条信息
    public static void add(Biyeyaoqiu b) {
        String sql =
                "INSERT INTO T_BIYEYAOQIU(ID,PEIYANGFANGAN_ID,CONTENT) "+
                "VALUES('"+
                        b.getId()+ "','"+
                        b.getPeiyangfanganId()+ "','" +
                        b.getContent()+ "')";
        boolean check;
        check = ConnectDB.addContent(sql);
        if(check){
            System.out.println("增操作成功");
        } else {
            System.out.println("增操作失败");
        }
    }
    // 增加多条信息
    public static void add(List<Biyeyaoqiu> bs) {
        List<String> sqls = new ArrayList<String>();
        for (Biyeyaoqiu b :bs){
            String sql =
                    "INSERT INTO T_BIYEYAOQIU(ID,PEIYANGFANGAN_ID,CONTENT) "+
                            "VALUES('"+
                            b.getId()+ "','"+
                            b.getPeiyangfanganId()+ "','" +
                            b.getContent()+ "')";
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
        String sql = "DELETE FROM T_BIYEYAOQIU WHERE ID = " + ID;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }
    // 通过培养方案ID删除
    public static void deleteByPeiyangfanganID(String ID) {
        String sql = "DELETE FROM T_BIYEYAOQIU WHERE PEIYANGFANGAN_ID = " + ID;
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
        List<Biyeyaoqiu> list = getAll();
        List<String> sqls = new ArrayList<String>();
        for(Biyeyaoqiu b : list) {
            String sql = "DELETE FROM T_BIYEYAOQIU WHERE ID = "+ b.getId();
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


    // 查整个列表
    public static List<Biyeyaoqiu> getAll(){
        List<Map<String,Object>> list = ConnectDB.getList("SELECT * FROM T_BIYEYAOQIU");
        List<Biyeyaoqiu> result = new ArrayList<Biyeyaoqiu>();
        for (Map<String,Object> map : list) {
            Biyeyaoqiu biyeyaoqiu = new Biyeyaoqiu(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("PEIYANGFANGAN_ID")),
                    String.valueOf(map.get("CONTENT"))
            );
            result.add(biyeyaoqiu);
        }
        return result;
    }
    // 通过ID查
    public static Biyeyaoqiu getByID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_BIYEYAOQIU WHERE ID = " + ID);
        Biyeyaoqiu biyeyaoqiu = new Biyeyaoqiu(
                String.valueOf(list.get(0).get("ID")),
                String.valueOf(list.get(0).get("PEIYANGFANGAN_ID")),
                String.valueOf(list.get(0).get("CONTENT"))
        );
        return biyeyaoqiu;
    }
    // 通过PEIYANGFANGAN_ID查
    public static List<Biyeyaoqiu> getByPeiyangfanganID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_BIYEYAOQIU WHERE PEIYANGFANGAN_ID = " + ID);
        List<Biyeyaoqiu> result = new ArrayList<Biyeyaoqiu>();
        for (Map<String,Object> map : list) {
            Biyeyaoqiu biyeyaoqiu = new Biyeyaoqiu(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("PEIYANGFANGAN_ID")),
                    String.valueOf(map.get("CONTENT"))
            );
            result.add(biyeyaoqiu);
        }

        return result;
    }

}
