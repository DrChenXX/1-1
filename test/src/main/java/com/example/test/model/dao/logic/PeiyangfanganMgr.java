package com.example.test.model.dao.logic;

import com.example.test.model.dao.database.ConnectDB;
import com.example.test.model.entity.Peiyangfangan;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class PeiyangfanganMgr {
    /**
     * ID
     * NAME
     * ZHUANYE_ID
     * VERSION
     * FUZEREN_ID
     */

    public void add(Peiyangfangan p) {
        String sql =
                "INSERT INTO T_PEIYANGFANGAN(ID,NAME,ZHUANYE_ID,VERSION,FUZEREN_ID) "+
                        "VALUES('"+
                        p.getId() + "','" +
                        p.getName() + "','" +
                        p.getZhuanyeId() + "','" +
                        p.getVersion() + "','" +
                        p.getFuzerenId() + "')";
        boolean check;
        check = ConnectDB.addContent(sql);
        if (check){
            System.out.println("增操作成功");
        } else {
            System.out.println("增操作失败");
        }
    }

    public void add(List<Peiyangfangan> ps) {
        List<String> sqls = new ArrayList<String>();
        for (Peiyangfangan p : ps) {
            String sql =
                    "INSERT INTO T_PEIYANGFANGAN(ID,NAME,ZHUANYE_ID,VERSION,FUZEREN_ID) "+
                            "VALUES('"+
                            p.getId() + "','" +
                            p.getName() + "','" +
                            p.getZhuanyeId() + "','" +
                            p.getVersion() + "','" +
                            p.getFuzerenId() + "')";
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

    public void deleteByID(String ID) {
        String sql = "DELETE FROM T_PEIYANGFANGAN WHERE ID = " + ID;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }

    public void deleteByZHUANYEID(String ID) {
        String sql = "DELETE FROM T_PEIYANGFANGAN WHERE ZHUANYE_ID = " + ID;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }

    public void deleteAll(){
        List<Peiyangfangan> list = getAll();
        List<String> sqls = new ArrayList<String>();
        for(Peiyangfangan p : list) {
            String sql = "DELETE FROM T_PEIYANGFANGAN WHERE ID = "+ p.getId();
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

    public Peiyangfangan getByID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_PEIYANGFANGAN WHERE ID = " + ID);
        if (list.isEmpty()) {
            return null;
        }
        Peiyangfangan p = new Peiyangfangan(
                String.valueOf(list.get(0).get("ID")),
                String.valueOf(list.get(0).get("NAME")),
                String.valueOf(list.get(0).get("ZHUANYE_ID")),
                String.valueOf(list.get(0).get("VERSION")),
                String.valueOf(list.get(0).get("FUZEREN_ID"))
        );
        return p;
    }

    public List<Peiyangfangan> getByName(String NAME) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_PEIYANGFANGAN WHERE NAME = " + NAME);
        if (list.isEmpty()) {
            return null;
        }
        List <Peiyangfangan> result = new ArrayList<Peiyangfangan>();
        for (Map<String, Object> map : list) {
            Peiyangfangan p = new Peiyangfangan(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("NAME")),
                    String.valueOf(map.get("ZHUANYE_ID")),
                    String.valueOf(map.get("VERSION")),
                    String.valueOf(map.get("FUZEREN_ID"))
            );
            result.add(p);
        }
        return result;
    }

    public List<Peiyangfangan> getByZHUANYEID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_PEIYANGFANGAN WHERE PEIYANGFANGAN_ID = " + ID);
        if (list.isEmpty()) {
            return null;
        }
        List <Peiyangfangan> result = new ArrayList<Peiyangfangan>();
        for (Map<String,Object> map : list) {
            Peiyangfangan p = new Peiyangfangan(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("NAME")),
                    String.valueOf(map.get("ZHUANYE_ID")),
                    String.valueOf(map.get("VERSION")),
                    String.valueOf(map.get("FUZEREN_ID"))
            );
            result.add(p);
        }
        return result;
    }

    public List<Peiyangfangan> getByFUZERENID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_PEIYANGFANGAN WHERE FUZEREN_ID = " + ID);
        if (list.isEmpty()) {
            return null;
        }
        List <Peiyangfangan> result = new ArrayList<Peiyangfangan>();
        for (Map<String,Object> map : list) {
            Peiyangfangan p = new Peiyangfangan(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("NAME")),
                    String.valueOf(map.get("ZHUANYE_ID")),
                    String.valueOf(map.get("VERSION")),
                    String.valueOf(map.get("FUZEREN_ID"))
            );
            result.add(p);
        }
        return result;
    }

    public List<Peiyangfangan> getAll() {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_PEIYANGFANGAN");
        if (list.isEmpty()) {
            return null;
        }
        List<Peiyangfangan> result = new ArrayList<Peiyangfangan>();
        for (Map<String,Object> map : list) {
            Peiyangfangan p = new Peiyangfangan(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("NAME")),
                    String.valueOf(map.get("ZHUANYE_ID")),
                    String.valueOf(map.get("VERSION")),
                    String.valueOf(map.get("FUZEREN_ID"))
            );
            result.add(p);
        }
        return result;
    }
}
