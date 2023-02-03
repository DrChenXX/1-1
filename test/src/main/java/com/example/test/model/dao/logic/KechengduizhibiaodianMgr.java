package com.example.test.model.dao.logic;

import com.example.test.model.dao.database.ConnectDB;
import com.example.test.model.entity.Kechengduizhibiaodian;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class KechengduizhibiaodianMgr {

    // 增加单条信息
    public void add(Kechengduizhibiaodian k) {
        String sql =
                "INSERT INTO T_KECHENGDUIZHIBIAODIAN(ID,KECHENG_ID,ZHIBIAODIAN_ID,CONTENT) "+
                        "VALUES('"+
                        k.getId()+ "','"+
                        k.getKechengId() + "','" +
                        k.getZhibiaodianId()+ "','" +
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
    public void add(List<Kechengduizhibiaodian> ks) {
        List<String> sqls = new ArrayList<String>();
        for (Kechengduizhibiaodian k : ks){
            String sql =
                    "INSERT INTO T_KECHENGDUIZHIBIAODIAN(ID,KECHENG_ID,ZHIBIAODIAN_ID,CONTENT) "+
                            "VALUES('"+
                            k.getId()+ "','"+
                            k.getKechengId() + "','" +
                            k.getZhibiaodianId()+ "','" +
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
    public void deleteByID(String ID) {
        String sql = "DELETE FROM T_KECHENGDUIZHIBIAODIAN WHERE ID = " + ID;
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
        String sql = "DELETE FROM T_KECHENGDUIZHIBIAODIAN WHERE KECHENG_ID = " + ID;
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
        String sql = "DELETE FROM T_KECHENGDUIZHIBIAODIAN WHERE ZHIBIAODIAN_ID = " + ID;
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
        List<Kechengduizhibiaodian> list = getAll();
        List<String> sqls = new ArrayList<String>();
        for(Kechengduizhibiaodian k : list) {
            String sql = "DELETE FROM T_KECHENGDUIZHIBIAODIAN WHERE ID = "+ k.getId();
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
    public Kechengduizhibiaodian getByID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_KECHENGDUIZHIBIAODIAN WHERE ID = " + ID);
        if (list.isEmpty()) {
            return null;
        }
        Kechengduizhibiaodian k = new Kechengduizhibiaodian(
                String.valueOf(list.get(0).get("ID")),
                String.valueOf(list.get(0).get("KECHENG_ID")),
                String.valueOf(list.get(0).get("ZHIBIAODIAN_ID")),
                String.valueOf(list.get(0).get("CONTENT"))
        );
        return k;
    }
    // 通过课程ID查
    public List<Kechengduizhibiaodian> getByKechengID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_KECHENGDUIZHIBIAODIAN WHERE KECHENG_ID = " + ID);
        if (list.isEmpty()) {
            return null;
        }
        List<Kechengduizhibiaodian> result = new ArrayList<Kechengduizhibiaodian>();
        for (Map<String,Object> map : list) {
            Kechengduizhibiaodian k = new Kechengduizhibiaodian(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("KECHENG_ID")),
                    String.valueOf(map.get("ZHIBIAODIAN_ID")),
                    String.valueOf(map.get("CONTENT"))
            );
            result.add(k);
        }
        return result;
    }
    // 通过指标点ID查
    public List<Kechengduizhibiaodian> getByZhibiaodianID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_KECHENGDUIZHIBIAODIAN WHERE ZHIBIAODIAN_ID = " + ID);
        if (list.isEmpty()) {
            return null;
        }
        List<Kechengduizhibiaodian> result = new ArrayList<Kechengduizhibiaodian>();
        for (Map<String,Object> map : list) {
            Kechengduizhibiaodian k = new Kechengduizhibiaodian(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("KECHENG_ID")),
                    String.valueOf(map.get("ZHIBIAODIAN_ID")),
                    String.valueOf(map.get("CONTENT"))
            );
            result.add(k);
        }
        return result;
    }
    // 查所有ID
    public List<Kechengduizhibiaodian> getAll() {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_KECHENGDUIZHIBIAODIAN");
        if (list.isEmpty()) {
            return null;
        }
        List<Kechengduizhibiaodian> result = new ArrayList<Kechengduizhibiaodian>();
        for (Map<String,Object> map : list) {
            Kechengduizhibiaodian k = new Kechengduizhibiaodian(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("KECHENG_ID")),
                    String.valueOf(map.get("ZHIBIAODIAN_ID")),
                    String.valueOf(map.get("CONTENT"))
            );
            result.add(k);
        }
        return result;
    }
}
