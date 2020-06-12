package com.liting.util;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class C3p0 {
    //获取数据源
    private    static ComboPooledDataSource dataSource =new ComboPooledDataSource();
    //获取连接池
    public  static ComboPooledDataSource getDataSource(){
        return dataSource;
    }
    //抛出异常
    public  static Connection getconnecttion(){
        try {
            return  dataSource.getConnection();
        } catch (SQLException e) {
           throw new RuntimeException("404");
        }

    }
    //释放资源
    public  static void  getCloes(Connection connection, ResultSet resultSet, PreparedStatement ps){

        if (connection!=null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            connection=null;
        }
        if (resultSet!=null){
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (ps!=null){
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
