package com.example.test.model.dao.logic;

import com.example.test.model.dao.database.ConnectDB;
import com.example.test.model.entity.Renwu;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RenwuMgr {
    public void add(Renwu renwu) {
        String sql =
                "INSERT INTO T_RENWU(ID,KECHENG,KECHENG_ID,XUEFEN,LEIBIE,RENKELAOSHI,RENKELAOSHI_ID,YUANXI,NIANJI,FABU,FUZEREN_ID,ZHUANYE,ZHUANYE_ID,PEIYANGFANGAN,XUEQI) " +
                        "VALUES('" +
                        renwu.getId() + "','" +
                        renwu.getKecheng() + "','" +
                        renwu.getKechengId() + "','" +
                        renwu.getXuefen() + "','" +
                        renwu.getLeibie() + "','" +
                        renwu.getRenkelaoshi() + "','" +
                        renwu.getRenkelaoshiId() + "','" +
                        renwu.getYuanxi() + "','" +
                        renwu.getNianji() + "','" +
                        renwu.getFabu() + "','" +
                        renwu.getFuzerenId() + "','" +
                        renwu.getZhuanye() + "','" +
                        renwu.getZhuanyeId() + "','" +
                        renwu.getPeiyangfangan() + "','" +
                        renwu.getXueqi() + "')";
        boolean check;
        check = ConnectDB.addContent(sql);
        if (check) {
            System.out.println("增操作成功");
        } else {
            System.out.println("增操作失败");
        }
    }

    public void add(List<Renwu> renwus) {
        List<String> sqls = new ArrayList<String>();
        for (Renwu renwu : renwus) {
            String sql =
                    "INSERT INTO T_RENWU(ID,KECHENG,KECHENG_ID,XUEFEN,LEIBIE,RENKELAOSHI,YUANXI,NIANJI,FABU,FUZEREN_ID,ZHUANYE,ZHUANYE_ID,PEIYANGFANGAN,XUEQI) " +
                            "VALUES('" +
                            renwu.getId() + "','" +
                            renwu.getKecheng() + "','" +
                            renwu.getKechengId() + "','" +
                            renwu.getXuefen() + "','" +
                            renwu.getLeibie() + "','" +
                            renwu.getRenkelaoshi() + "','" +
                            renwu.getRenkelaoshiId() + "','" +
                            renwu.getYuanxi() + "','" +
                            renwu.getNianji() + "','" +
                            renwu.getFabu() + "','" +
                            renwu.getFuzerenId() + "','" +
                            renwu.getZhuanye() + "','" +
                            renwu.getZhuanyeId() + "','" +
                            renwu.getPeiyangfangan() + "','" +
                            renwu.getXueqi() + "')";
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

    public Renwu getByID(String ID) {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_RENWU WHERE ID = " + ID);
        if (list.isEmpty()) {
            return null;
        }
        Renwu renwu = new Renwu(
                String.valueOf(list.get(0).get("ID")),
                String.valueOf(list.get(0).get("KECHENG")),
                String.valueOf(list.get(0).get("KECHENG_ID")),
                String.valueOf(list.get(0).get("XUEFEN")),
                String.valueOf(list.get(0).get("LEIBIE")),
                String.valueOf(list.get(0).get("RENKELAOSHI")),
                String.valueOf(list.get(0).get("RENKELAOSHI_ID")),
                String.valueOf(list.get(0).get("YUANXI")),
                String.valueOf(list.get(0).get("NIANJI")),
                String.valueOf(list.get(0).get("FABU")),
                String.valueOf(list.get(0).get("FUZEREN_ID")),
                String.valueOf(list.get(0).get("ZHUANYE")),
                String.valueOf(list.get(0).get("ZHUANYE_ID")),
                String.valueOf(list.get(0).get("PEIYANGFANGAN")),
                String.valueOf(list.get(0).get("XUEQI"))
                );
        return renwu;
    }

    public List<Renwu> getAll() {
        List<Map<String, Object>> list;
        list = ConnectDB.getList("SELECT * FROM T_RENWU");
        if (list.isEmpty()) {
            return null;
        }
        List<Renwu> result = new ArrayList<Renwu>();
        for (Map<String, Object> map : list) {
            Renwu renwu = new Renwu(
                    String.valueOf(list.get(0).get("ID")),
                    String.valueOf(list.get(0).get("KECHENG")),
                    String.valueOf(list.get(0).get("KECHENG_ID")),
                    String.valueOf(list.get(0).get("XUEFEN")),
                    String.valueOf(list.get(0).get("LEIBIE")),
                    String.valueOf(list.get(0).get("RENKELAOSHI")),
                    String.valueOf(list.get(0).get("RENKELAOSHI_ID")),
                    String.valueOf(list.get(0).get("YUANXI")),
                    String.valueOf(list.get(0).get("NIANJI")),
                    String.valueOf(list.get(0).get("FABU")),
                    String.valueOf(list.get(0).get("FUZEREN_ID")),
                    String.valueOf(list.get(0).get("ZHUANYE")),
                    String.valueOf(list.get(0).get("ZHUANYE_ID")),
                    String.valueOf(list.get(0).get("PEIYANGFANGAN")),
                    String.valueOf(list.get(0).get("XUEQI"))
            );
            result.add(renwu);
        }
        return result;
    }
}