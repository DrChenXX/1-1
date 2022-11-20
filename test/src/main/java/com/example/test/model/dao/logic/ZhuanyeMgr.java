package com.example.test.model.dao.logic;

import com.example.test.model.dao.database.ConnectDB;
import com.example.test.model.entity.Zhuanye;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ZhuanyeMgr {
    /**
     * ID
     * NAME
     * FUZEREN_ID
     */

    public void add(Zhuanye z) {
        String sql =
                "INSERT INTO T_ZHUANYE(ID,NAME,FUZEREN_ID) "+
                        "VALUES('"+
                        z.getId() + "','" +
                        z.getName() + "','" +
                        z.getFuzerenId() + "')";
        boolean check;
        check = ConnectDB.addContent(sql);
        if (check){
            System.out.println("增操作成功");
        } else {
            System.out.println("增操作失败");
        }
    }

    public void add(List<Zhuanye> zs) {
        List<String> sqls = new ArrayList<String>();
        for (Zhuanye z : zs){
            String sql =
                    "INSERT INTO T_ZHUANYE(ID,NAME,FUZEREN_ID) "+
                            "VALUES('"+
                            z.getId() + "','" +
                            z.getName() + "','" +
                            z.getFuzerenId() + "')";
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

    public void deleteByID(String ID) {
        String sql = "DELETE FROM T_ZHUANYE WHERE ID = " + ID;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }

    public void deleteByName(String NAME) {
        String sql = "DELETE FROM T_ZHUANYE WHERE NAME = " + NAME;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }

    public void deleteAll(){
        List<Zhuanye> list = getAll();
        List<String> sqls = new ArrayList<String>();
        for(Zhuanye z : list) {
            String sql = "DELETE FROM T_ZHUANYE WHERE ID = "+ z.getId();
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

    public Zhuanye getByID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_ZHUANYE WHERE ID = " + ID);
        Zhuanye z = new Zhuanye(
                String.valueOf(list.get(0).get("ID")),
                String.valueOf(list.get(0).get("NAME")),
                String.valueOf(list.get(0).get("FUZEREN_ID"))
        );
        return z;
    }

    public List<Zhuanye> getByNAME(String NAME) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_ZHUANYE WHERE NAME = " + NAME);
        List <Zhuanye> result = new ArrayList<Zhuanye>();
        for (Map<String,Object> map : list) {
            Zhuanye z = new Zhuanye(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("NAME")),
                    String.valueOf(map.get("FUZEREN_ID"))
            );
            result.add(z);
        }
        return result;
    }

    public List<Zhuanye> getByFUZERENID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_ZHUANYE WHERE FUZEREN_ID = " + ID);
        List <Zhuanye> result = new ArrayList<Zhuanye>();
        for (Map<String,Object> map : list) {
            Zhuanye z = new Zhuanye(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("NAME")),
                    String.valueOf(map.get("FUZEREN_ID"))
            );
            result.add(z);
        }
        return result;
    }

    public List<Zhuanye> getAll() {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_ZHUANYE");
        List<Zhuanye> result = new ArrayList<Zhuanye>();
        for (Map<String,Object> map : list) {
            Zhuanye z = new Zhuanye(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("NAME")),
                    String.valueOf(map.get("FUZEREN_ID"))
            );
            result.add(z);
        }
        return result;
    }
}
