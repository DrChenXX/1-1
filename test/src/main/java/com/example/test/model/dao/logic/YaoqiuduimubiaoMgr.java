package com.example.test.model.dao.logic;

import com.example.test.model.dao.database.ConnectDB;
import com.example.test.model.entity.Yaoqiuduimubiao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class YaoqiuduimubiaoMgr {
    public void add(Yaoqiuduimubiao yaoqiuduimubiao) {
        String sql =
                "INSERT INTO T_YAOQIUDUIMUBIAO(ID,BIYEYAOQIU_ID,PEIYANGMUBIAO_ID) " +
                        "VALUES('" +
                        yaoqiuduimubiao.getId() + "','" +
                        yaoqiuduimubiao.getBiyeyaoqiuId() + "','" +
                        yaoqiuduimubiao.getPeiyangmubiaoId() + "')";
        boolean check;
        check = ConnectDB.addContent(sql);
        if (check) {
            System.out.println("增操作成功");
        } else {
            System.out.println("增操作失败");
        }
    }
    public void add(List<Yaoqiuduimubiao> yaoqiuduimubiaos) {
        List<String> sqls = new ArrayList<String>();
        for (Yaoqiuduimubiao yaoqiuduimubiao : yaoqiuduimubiaos) {
            String sql =
                    "INSERT INTO T_YAOQIUDUIMUBIAO(ID,BIYEYAOQIU_ID,PEIYANGMUBIAO_ID) " +
                            "VALUES('" +
                            yaoqiuduimubiao.getId() + "','" +
                            yaoqiuduimubiao.getBiyeyaoqiuId() + "','" +
                            yaoqiuduimubiao.getPeiyangmubiaoId() + "')";
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
        String sql = "DELETE FROM T_YAOQIUDUIMUBIAO WHERE ID = " + ID;
        boolean check;
        check = ConnectDB.deleteContent(sql);
        if(check){
            System.out.println("删操作成功");
        } else {
            System.out.println("删操作失败");
        }
    }
    public Yaoqiuduimubiao getByID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_YAOQIUDUIMUBIAO WHERE ID = " + ID);
        if (list.isEmpty()) {
            return null;
        }
        Yaoqiuduimubiao yaoqiuduimubiao = new Yaoqiuduimubiao(
                String.valueOf(list.get(0).get("ID")),
                String.valueOf(list.get(0).get("BIYEYAOQIU_ID")),
                String.valueOf(list.get(0).get("PEIYANGMUBIAO_ID"))
        );
        return yaoqiuduimubiao;
    }
    public List<Yaoqiuduimubiao> getAll() {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_YAOQIUDUIMUBIAO");
        if (list.isEmpty()) {
            return null;
        }
        List<Yaoqiuduimubiao> result = new ArrayList<Yaoqiuduimubiao>();
        for (Map<String, Object> map : list) {
            Yaoqiuduimubiao yaoqiuduimubiao = new Yaoqiuduimubiao(
                    String.valueOf(map.get("ID")),
                    String.valueOf(map.get("BIYEYAOQIU_ID")),
                    String.valueOf(map.get("PEIYANGMUBIAO_ID"))
            );
            result.add(yaoqiuduimubiao);
        }
        return result;
    }
}
