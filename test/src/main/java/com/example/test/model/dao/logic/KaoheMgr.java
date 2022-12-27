package com.example.test.model.dao.logic;

import com.example.test.model.dao.database.ConnectDB;
import com.example.test.model.entity.Kaohe;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class KaoheMgr {

    // 增加单条信息
    public void add(Kaohe k) {
        String sql =
                "INSERT INTO T_KAOHE(ID,CONTENT,KECHENG_ID,KECHENGMUBIAO_ID,ZHANBI) "+
                        "VALUES('"+
                        k.getId()+ "','"+
                        k.getContent() + "','" +
                        k.getKechengId()+ "','" +
                        k.getKechengmubiaoId() + "'," +
                        k.getZhanbi() + ")";
        boolean check;
        check = ConnectDB.addContent(sql);
        if(check){
            System.out.println("增操作成功");
        } else {
            System.out.println("增操作失败");
        }
    }
    // 增加多条信息
    public void add(List<Kaohe> ks) {
        List<String> sqls = new ArrayList<String>();
        for (Kaohe k : ks){
            String sql =
                    "INSERT INTO T_KAOHE(ID,CONTENT,KECHENG_ID,KECHENGMUBIAO_ID,ZHANBI) "+
                            "VALUES('"+
                            k.getId()+ "','"+
                            k.getContent() + "','" +
                            k.getKechengId()+ "','" +
                            k.getKechengmubiaoId() + "'," +
                            k.getZhanbi() + ")";
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
    public void deleteByID(String ID) {
        String sql = "DELETE FROM T_KAOHE WHERE ID = " + ID;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }
    // 通过课程ID删除
    public void deleteByKechengID(String ID) {
        String sql = "DELETE FROM T_KAOHE WHERE KECHENG_ID = " + ID;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }
    // 通过课程目标ID删除
    public void deleteByKechengmubiaoID(String ID) {
        String sql = "DELETE FROM T_KAOHE WHERE KECHENGMUBIAO_ID = " + ID;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }
    // 删除所有ID
    public void deleteAll(){
        List<Kaohe> list = getAll();
        List<String> sqls = new ArrayList<String>();
        for(Kaohe k : list) {
            String sql = "DELETE FROM T_KAOHE WHERE ID = "+ k.getId();
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
    public Kaohe getByID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_KAOHE WHERE ID = " + ID);
        if (list.isEmpty()) {
            return null;
        }
        Kaohe k = new Kaohe(
                String.valueOf(list.get(0).get("ID")),
                String.valueOf(list.get(0).get("CONTENT")),
                String.valueOf(list.get(0).get("KECHENG_ID")),
                String.valueOf(list.get(0).get("KECHENGMUBIAO_ID")),
                Integer.parseInt(String.valueOf(list.get(0).get("XUEFEN")))
        );
        return k;
    }
    // 通过课程ID查
    public List<Kaohe> getByKechengID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_KAOHE WHERE KECHENG_ID = " + ID);
        if (list.isEmpty()) {
            return null;
        }
        List<Kaohe> result = new ArrayList<Kaohe>();
        for (Map<String,Object> map : list) {
            Kaohe k = new Kaohe(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("CONTENT")),
                    String.valueOf(map.get("KECHENG_ID")),
                    String.valueOf(map.get("KECHENGMUBIAO_ID")),
                    Integer.parseInt(String.valueOf(map.get("ZHANBI")))
            );
            result.add(k);
        }
        return result;
    }
    // 通过课程目标ID查
    public List<Kaohe> getByKechengmubiaoID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_KAOHE WHERE KECHENGMUBIAO_ID = " + ID);
        if (list.isEmpty()) {
            return null;
        }
        List<Kaohe> result = new ArrayList<Kaohe>();
        for (Map<String,Object> map : list) {
            Kaohe k = new Kaohe(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("CONTENT")),
                    String.valueOf(map.get("KECHENG_ID")),
                    String.valueOf(map.get("KECHENGMUBIAO_ID")),
                    Integer.parseInt(String.valueOf(map.get("ZHANBI")))
            );
            result.add(k);
        }
        return result;
    }
    // 查全部ID
    public List<Kaohe> getAll() {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_KAOHE");
        if (list.isEmpty()) {
            return null;
        }
        List<Kaohe> result = new ArrayList<Kaohe>();
        for (Map<String,Object> map : list) {
            Kaohe k = new Kaohe(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("CONTENT")),
                    String.valueOf(map.get("KECHENG_ID")),
                    String.valueOf(map.get("KECHENGMUBIAO_ID")),
                    Integer.parseInt(String.valueOf(map.get("ZHANBI")))
            );
            result.add(k);
        }
        return result;
    }
}
