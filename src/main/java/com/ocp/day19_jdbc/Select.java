package com.ocp.day19_jdbc;

// 查詢 CUSTOMER 資料表

import java.sql.Connection;
import java.sql.DriverManager;

// SQL => SELECT c.CUSTOMER_ID, c."NAME", c.PHONE, c.EMAIL FROM CUSTOMER c;
public class Select {
    
    public static void main(String[] args) throws Exception {
        // JDBC 3.0 要定義 Class.forName() 動態載入 Driver, JDBC 4.0 則不用
        // JDBC 4.0 會有 META-INF > service > java.sql.Driver 的結構
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        // 透過 DriverManager 來得到 Connection
        String url = ""; // 資料庫連線路徑
        String user = "app";
        String password = "app";
        Connection conn = DriverManager.getConnection(url, user, password);
        
    }
    
}
