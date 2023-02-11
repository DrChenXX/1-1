package com.example.test.model.dao.logic;

import com.example.test.model.dao.database.ConnectDB;
import com.example.test.model.entity.Mubiaoduizhibiaodian;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MubiaoduizhibiaodianMgr {
    public void add(Mubiaoduizhibiaodian mubiaoduizhibiaodian) {
        String sql =
                "INSERT INTO T_MUBIAODUIZHIBIAODIAN(ID,KECHENGMUBIAO_ID,ZHIBIAODIAN_ID,CONTENT) " +
                        "VALUES('" +
                        mubiaoduizhibiaodian.getId() + "','" +
                        mubiaoduizhibiaodian.getKechengmubiaoId() + "','" +
                        mubiaoduizhibiaodian.getZhibiaodianId() + "','" +
                        mubiaoduizhibiaodian.getContent() + "')";
        boolean check;
        check = ConnectDB.addContent(sql);
        if (check) {
            System.out.println("增操作成功");
        } else {
            System.out.println("增操作失败");
        }
    }
    public void add(List<Mubiaoduizhibiaodian> mubiaoduizhibiaodians) {
        List<String> sqls = new ArrayList<String>();
        for (Mubiaoduizhibiaodian mubiaoduizhibiaodian : mubiaoduizhibiaodians) {
            String sql =
                    "INSERT INTO T_MUBIAODUIZHIBIAODIAN(ID,KECHENGMUBIAO_ID,ZHIBIAODIAN_ID,CONTENT) " +
                            "VALUES('" +
                            mubiaoduizhibiaodian.getId() + "','" +
                            mubiaoduizhibiaodian.getKechengmubiaoId() + "','" +
                            mubiaoduizhibiaodian.getZhibiaodianId() + "','" +
                            mubiaoduizhibiaodian.getContent() + "')";
            sqls.add(sql);
        }
        boolean check;
        check = ConnectDB.addContent(sqls);
        if (check) {
            System.out.println("增操作成功");
        } else {
            System.out.println("增操作失败");
        }
    }
    public void deleteByID(String ID) {
        String sql = "DELETE FROM T_MUBIAODUIZHIBIAODIAN WHERE ID = " + ID;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }
    public Mubiaoduizhibiaodian getByID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_MUBIAODUIZHIBIAODIAN WHERE ID = " + ID);
        if (list.isEmpty()) {
            return null;
        }
        Mubiaoduizhibiaodian mubiaoduizhibiaodian = new Mubiaoduizhibiaodian(
                String.valueOf(list.get(0).get("ID")),
                String.valueOf(list.get(0).get("KECHENGMUBIAO_ID")),
                String.valueOf(list.get(0).get("ZHIBIAODIAN_ID")),
                String.valueOf(list.get(0).get("CONTENT"))
        );
        return mubiaoduizhibiaodian;
    }
    public List<Mubiaoduizhibiaodian> getAll() {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_MUBIAODUIZHIBIAODIAN");
        if (list.isEmpty()) {
            return null;
        }
        List<Mubiaoduizhibiaodian> result = new ArrayList<Mubiaoduizhibiaodian>();
        for (Map<String, Object> map : list) {
            Mubiaoduizhibiaodian mubiaoduizhibiaodian = new Mubiaoduizhibiaodian(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("KECHENGMUBIAO_ID")),
                    String.valueOf(map.get("ZHIBIAODIAN_ID")),
                    String.valueOf(map.get("CONTENT"))
            );
            result.add(mubiaoduizhibiaodian);
        }
        return result;
    }
}
