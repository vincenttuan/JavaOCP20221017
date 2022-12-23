package com.ocp.day19_jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import org.apache.derby.jdbc.ClientDataSource;

public class Select2 {
    public static void main(String[] args) throws Exception {
        ClientDataSource dataSource = new ClientDataSource();
        dataSource.setServerName("localhost");
        dataSource.setPortNumber(1527);
        dataSource.setUser("app");
        dataSource.setPassword("app");
        dataSource.setDatabaseName("sample");
        
        String sql = "SELECT c.CUSTOMER_ID, c.NAME, c.PHONE, c.EMAIL FROM CUSTOMER c";
        Connection conn = dataSource.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        
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
