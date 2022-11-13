package database;

import interfaces.Callable;

import java.sql.*;

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

    public static ResultSet getResultSet(String sql) {
        Connection connection = null;
        try {
            //加载mysql的驱动类
            Class.forName(JDBC_DRIVER);
            //获取数据库连接
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement prst = connection.prepareStatement(sql);
            //结果集
            ResultSet rs = prst.executeQuery();
            prst.close();
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ResultSet rs = getResultSet("SELECT ID FROM T_ERROR");
        try {
            while (rs.next()){
                System.out.println("ID:"+rs.getString("ID"));
            }
        } catch (Exception a ) {

        }

    }
}
