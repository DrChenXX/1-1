package database;

import interfaces.Callable;

import java.sql.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ConnectDB implements Callable {
    private static ConnectDB instance;

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://43.139.96.180:3306/Protest?characterEncoding=utf-8&rewriteBatchedStatement=true";

    static final String USER = "cxy";
    static final String PASS = "Cxy_20020208";


    private ConnectDB(){
    }

    public static ConnectDB GetInstance(){
        if(instance==null){
            instance = new ConnectDB();
        }
        return instance;
    }

    public void call(){

    }


}
    public static List<Map<String, Object>> queryAll(String sql) {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        Connection conn = null;
        Statement sta = null;
        ResultSet rs = null;
        try{
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            sta = conn.createStatement();
            rs = sta.executeQuery(sql);
            ResultSetMetaData md = rs.getMetaData();
            int columnCount = md.getColumnCount();
            while(rs.next()) {
                Map<String, Object> rowData = new HashMap<String, Object>();
                for (int i = 1; i <= columnCount; i++) {
                    rowData.put(md.getCatalogName(i), rs.getObject(i));
                }
                list.add(rowData);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {
        List<Map<String, Object>> list = queryAll("SELECT * FROM T_ERROR");
        for (String s : list.get(0).keySet()) {
            System.out.println(s);
        }
        System.out.println(list.get(0).get("ID"));
        System.out.println(list.get(0).get("SHIJIAN"));
        System.out.println(list.get(0).get("CONTENT"));
    }
}
}
