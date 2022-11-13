package database;

import interfaces.Callable;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConnectDB {
    private static ConnectDB instance;

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://43.139.96.180:3306/Protest?characterEncoding=utf-8&rewriteBatchedStatement=true";

    static final String USER = "cxy";
    static final String PASS = "Cxy_20020208";


    private ConnectDB() {
    }

    public static ConnectDB GetInstance() {
        if (instance == null) {
            instance = new ConnectDB();
        }
        return instance;
    }


    public static List<Map<String, Object>> getList(String sql) {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        Connection conn = null;
        Statement sta = null;
        ResultSet rs = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            sta = conn.createStatement();
            rs = sta.executeQuery(sql);
            ResultSetMetaData md = rs.getMetaData();
            int columnCount = md.getColumnCount();
            while (rs.next()) {
                Map<String, Object> rowData = new HashMap<String, Object>();
                for (int i = 1; i <= columnCount; i++) {
                    rowData.put(md.getColumnName(i), rs.getObject(i));
                }
                list.add(rowData);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(rs!=null){
                try{
                    rs.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if(sta!=null){
                try {
                    sta.close();
                }catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
        return list;
    }

    // 增加单个元素
    public static boolean addContent(String sql){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
            return false;
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }finally {
            if(preparedStatement!=null){
                try{
                    preparedStatement.close();
                }catch (SQLException e){
                    e.printStackTrace();
                    return false;
                }
            }
            if(connection!=null){
                try {
                    connection.commit();
                    connection.close();
                }catch (SQLException e) {
                    e.printStackTrace();
                    return false;
                }
            }
        }
        return true;
    }

    // 增加多个元素
    public static boolean addContent(List<String> sqls) {
        Connection connection = null;
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            connection.setAutoCommit(false);
            for (String sql: sqls){
                PreparedStatement preparedStatement = null;
                try {
                    preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.executeUpdate();

                }catch (SQLException e){
                    e.printStackTrace();
                    return false;
                }finally {
                    if(preparedStatement!=null){
                        try{
                            preparedStatement.close();
                        }catch (SQLException e){
                            e.printStackTrace();
                            return false;
                        }
                    }

                }
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(connection!=null){
                try {
                    connection.commit();
                    connection.close();
                }catch (SQLException e) {
                    e.printStackTrace();
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean deleteContent(String sql) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();

        }catch (ClassNotFoundException e){
            e.printStackTrace();
            return false;
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }finally {
            if(preparedStatement!=null){
                try{
                    preparedStatement.close();
                }catch (SQLException e){
                    e.printStackTrace();
                    return false;
                }
            }
            if(connection!=null){
                try {
                    connection.commit();
                    connection.close();
                }catch (SQLException e) {
                    e.printStackTrace();
                    return false;
                }
            }
        }
        return true;
    }

    public  static  boolean deleteContent(List<String> sqls) {
        Connection connection = null;
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            connection.setAutoCommit(false);
            for (String sql: sqls){
                PreparedStatement preparedStatement = null;
                try {
                    preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.executeUpdate();

                }catch (SQLException e){
                    e.printStackTrace();
                    return false;
                }finally {
                    if(preparedStatement!=null){
                        try{
                            preparedStatement.close();
                        }catch (SQLException e){
                            e.printStackTrace();
                            return false;
                        }
                    }

                }
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(connection!=null){
                try {
                    connection.commit();
                    connection.close();
                }catch (SQLException e) {
                    e.printStackTrace();
                    return false;
                }
            }
        }
        return true;
    }

}