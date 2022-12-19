package com.ocp.day19_jdbc;

// 查詢 CUSTOMER 資料表

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// SQL => SELECT c.CUSTOMER_ID, c."NAME", c.PHONE, c.EMAIL FROM CUSTOMER c
public class Select {
    
    public static void main(String[] args) throws Exception {
        // JDBC 3.0 要定義 Class.forName() 動態載入 Driver, JDBC 4.0 則不用
        // JDBC 4.0 會有 META-INF > service > java.sql.Driver 的結構
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        // 透過 DriverManager 來得到 Connection
        String url = "jdbc:derby://localhost:1527/sample"; // 資料庫連線路徑
        String user = "app";
        String password = "app";
        Connection conn = DriverManager.getConnection(url, user, password);
        // 取得 Statement
        Statement stmt = conn.createStatement();
        // 撰寫 sql 並執行 executeQuery 後得到 ResultSet
        String sql = "SELECT c.CUSTOMER_ID, c.NAME, c.PHONE, c.EMAIL FROM CUSTOMER c";
        ResultSet rs = stmt.executeQuery(sql);
        // 分析 rs (裡面存放的就是資料表的資訊)
        while (rs.next()) { // 走訪集合資料
            int id = rs.getInt("CUSTOMER_ID");
            String name = rs.getString("NAME");
            String phone = rs.getString("PHONE");
            String email = rs.getString("EMAIL");
            System.out.printf("| %5d | %-30s | %15s | %-30s |\n", id, name, phone, email);
        }
        
        // 關閉資源
        rs.close();
        stmt.close();
        conn.close();
        
    }
    
}
