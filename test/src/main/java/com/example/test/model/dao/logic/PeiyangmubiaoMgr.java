package com.example.test.model.dao.logic;

import com.example.test.model.dao.database.ConnectDB;
import com.example.test.model.entity.Peiyangmubiao;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class PeiyangmubiaoMgr {
    /**
     * ID
     * PEIYANGFANGAN_ID
     * CONTENT
     */

    public void add(Peiyangmubiao p) {
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

    public void add(List<Peiyangmubiao> ps) {
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

    public void deleteByID(String ID) {
        String sql = "DELETE FROM T_PEIYANGMUBIAO WHERE ID = " + ID;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }

    public void deleteByPEIYANGFANGANID(String ID) {
        String sql = "DELETE FROM T_PEIYANGMUBIAO WHERE PEIYANGFANGAN_ID = " + ID;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }

    public void deleteAll(){
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

    public Peiyangmubiao getByID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_PEIYANGMUBIAO WHERE ID = " + ID);
        if (list.isEmpty()) {
            return null;
        }
        Peiyangmubiao p = new Peiyangmubiao(
                String.valueOf(list.get(0).get("ID")),
                String.valueOf(list.get(0).get("PEIYANGFANGAN_ID")),
                String.valueOf(list.get(0).get("CONTENT"))
        );
        return p;
    }

    public List<Peiyangmubiao> getByPEIYANGFANGANID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_PEIYANGMUBIAO WHERE PEIYANGFANGAN_ID = " + ID);
        if (list.isEmpty()) {
            return null;
        }
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

    public List<Peiyangmubiao> getAll() {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_PEIYANGMUBIAO");
        if (list.isEmpty()) {
            return null;
        }
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
