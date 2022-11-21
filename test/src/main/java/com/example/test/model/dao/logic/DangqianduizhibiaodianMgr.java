package com.example.test.model.dao.logic;

import com.example.test.model.dao.database.ConnectDB;
import com.example.test.model.entity.Dangqianduizhibiaodian;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DangqianduizhibiaodianMgr {
    /**
     * ID
     * DANGQIANKECHENG_ID
     * ZHIBIAODIAN_ID
     * YUAN_ID
     * CONTENT
     * CHENGJI
     */

    // 增加单条信息
    public void add(Dangqianduizhibiaodian d) {
        String sql =
                "INSERT INTO T_DANGQIANDUIZHIBIAODIAN(ID,DANGQIANKECHENG_ID,ZHIBIAODIAN_ID,YUAN_ID,CONTENT,CHENGJI) "+
                        "VALUES('"+
                        d.getId()+ "','"+
                        d.getDangqiankechengId() + "','" +
                        d.getZhibiaodianId()+ "','" +
                        d.getYuanId() + "','" +
                        d.getContent() + "'," +
                        d.getChengji() + ")";
        boolean check;
        check = ConnectDB.addContent(sql);
        if(check){
            System.out.println("增操作成功");
        } else {
            System.out.println("增操作失败");
        }
    }
    // 增加多条信息
    public void add(List<Dangqianduizhibiaodian> ds) {
        List<String> sqls = new ArrayList<String>();
        for (Dangqianduizhibiaodian d :ds){
            String sql =
                    "INSERT INTO T_DANGQIANDUIZHIBIAODIAN(ID,DANGQIANKECHENG_ID,ZHIBIAODIAN_ID,YUAN_ID,CONTENT,CHENGJI) "+
                            "VALUES('"+
                            d.getId()+ "','"+
                            d.getDangqiankechengId() + "','" +
                            d.getZhibiaodianId()+ "','" +
                            d.getYuanId() + "','" +
                            d.getContent() + "'," +
                            d.getChengji() + ")";
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
        String sql = "DELETE FROM T_DANGQIANDUIZHIBIAODIAN WHERE ID = " + ID;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }
    // 通过当前课程ID删除
    public void deleteByDangqiankechengID(String ID) {
        String sql = "DELETE FROM T_DANGQIANDUIZHIBIAODIAN WHERE DANGQIANKECHENG_ID = " + ID;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }
    // 通过指标点ID删除
    public void deleteByZhibiaodianID(String ID) {
        String sql = "DELETE FROM T_DANGQIANDUIZHIBIAODIAN WHERE ZHIBIAODIAN_ID = " + ID;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }
    // 通过YUAN_ID删除
    public void deleteByYuanID(String ID){
        String sql = "DELETE FROM T_DANGQIANDUIZHIBIAODIAN WHERE YUAN_ID = " + ID;
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
        List<Dangqianduizhibiaodian> list = getAll();
        List<String> sqls = new ArrayList<String>();
        for(Dangqianduizhibiaodian d : list) {
            String sql = "DELETE FROM T_DANGQIANDUIZHIBIAODIAN WHERE ID = "+ d.getId();
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

    // 根据ID查
    public Dangqianduizhibiaodian getByID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_DANGQIANDUIZHIBIAODIAN WHERE ID = " + ID);
        if (list.isEmpty()) {
            return null;
        }
        Dangqianduizhibiaodian d = new Dangqianduizhibiaodian(
                String.valueOf(list.get(0).get("ID")),
                String.valueOf(list.get(0).get("DANGQIANKECHENG_ID")),
                String.valueOf(list.get(0).get("ZHIBIAODIAN_ID")),
                String.valueOf(list.get(0).get("YUAN_ID")),
                String.valueOf(list.get(0).get("CONTENT")),
                Integer.parseInt(String.valueOf(list.get(0).get("CHENGJI")))
        );
        return d;
    }
    // 根据当前课程查
    public List<Dangqianduizhibiaodian> getByDangqiankechengID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_DANGQIANDUIZHIBIAODIAN WHERE DANGQIANKECHENG_ID = " + ID);
        List<Dangqianduizhibiaodian> result = new ArrayList<Dangqianduizhibiaodian>();
        if (list.isEmpty()) {
            return null;
        }
        for (Map<String,Object> map : list) {
            Dangqianduizhibiaodian d = new Dangqianduizhibiaodian(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("DANGQIANKECHENG_ID")),
                    String.valueOf(map.get("ZHIBIAODIAN_ID")),
                    String.valueOf(map.get("YUAN_ID")),
                    String.valueOf(map.get("CONTENT")),
                    Integer.parseInt(String.valueOf(map.get("CHENGJI")))
            );
            result.add(d);
        }
        return result;
    }
    // 根据指标点查
    public List<Dangqianduizhibiaodian> getByZhibiaodianID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_DANGQIANDUIZHIBIAODIAN WHERE ZHIBIAODIAN_ID = " + ID);
        List<Dangqianduizhibiaodian> result = new ArrayList<Dangqianduizhibiaodian>();
        if (list.isEmpty()) {
            return null;
        }
        for (Map<String,Object> map : list) {
            Dangqianduizhibiaodian d = new Dangqianduizhibiaodian(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("DANGQIANKECHENG_ID")),
                    String.valueOf(map.get("ZHIBIAODIAN_ID")),
                    String.valueOf(map.get("YUAN_ID")),
                    String.valueOf(map.get("CONTENT")),
                    Integer.parseInt(String.valueOf(map.get("CHENGJI")))
            );
            result.add(d);
        }
        return result;
    }
    // 根据YUAN_ID查
    public List<Dangqianduizhibiaodian> getByYuanID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_DANGQIANDUIZHIBIAODIAN WHERE YUAN_ID = " + ID);
        List<Dangqianduizhibiaodian> result = new ArrayList<Dangqianduizhibiaodian>();
        if (list.isEmpty()) {
            return null;
        }
        for (Map<String,Object> map : list) {
            Dangqianduizhibiaodian d = new Dangqianduizhibiaodian(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("DANGQIANKECHENG_ID")),
                    String.valueOf(map.get("ZHIBIAODIAN_ID")),
                    String.valueOf(map.get("YUAN_ID")),
                    String.valueOf(map.get("CONTENT")),
                    Integer.parseInt(String.valueOf(map.get("CHENGJI")))
            );
            result.add(d);
        }
        return result;
    }
    // 查整个列表
    public List<Dangqianduizhibiaodian> getAll(){
        List<Map<String,Object>> list = ConnectDB.getList("SELECT * FROM T_DANGQIANDUIZHIBIAODIAN");
        List<Dangqianduizhibiaodian> result = new ArrayList<Dangqianduizhibiaodian>();
        if (list.isEmpty()) {
            return null;
        }
        for (Map<String,Object> map : list) {
            Dangqianduizhibiaodian d = new Dangqianduizhibiaodian(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("DANGQIANKECHENG_ID")),
                    String.valueOf(map.get("ZHIBIAODIAN_ID")),
                    String.valueOf(map.get("YUAN_ID")),
                    String.valueOf(map.get("CONTENT")),
                    Integer.parseInt(String.valueOf(map.get("CHENGJI")))
            );
            result.add(d);
        }
        return result;
    }
}
