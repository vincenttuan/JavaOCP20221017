package com.ocp.day20_jdbc.dao;

import com.ocp.day20_jdbc.entity.Department;
import com.ocp.day20_jdbc.entity.Employee;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.apache.derby.jdbc.ClientDataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class MyDao {
    public static ClientDataSource dataSource;
    static {
        dataSource = new ClientDataSource();
        dataSource.setServerName("localhost");
        dataSource.setPortNumber(1527);
        dataSource.setUser("app");
        dataSource.setPassword("app");
        dataSource.setDatabaseName("mydb");
    }
    
    public List<Department> queryDepartments() {
        List<Department> departments = new ArrayList<>();
        //String sql = "select id, name from mydb.department";
        String sql = "select id, name from department";
        // try with resources 寫法, 會自動關閉 Closeable 物件
        // Java 在跳離 try-catch 前會自動執行 close() 方法 <-- 在 finally 裡面
        try(Connection conn = dataSource.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {
            // O/R Mapping: Object Relational Mapping
            // 物件關聯對應 -> Java物件 對應 關聯式資料庫
            while (rs.next()) {
                Department department = new Department();
                department.setId(rs.getInt("id")); // O/R Mapping
                department.setName(rs.getString("name")); // O/R Mapping
                // 將每一筆物件加入到列表中 
                departments.add(department);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return departments;
    }

    public List<Employee> queryEmployees() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        String sql = "select id, name, salary, dept_id from employee";
        List<Employee> employees = jdbcTemplate.query(sql, new BeanPropertyRowMapper(Employee.class));
        // 再根據每一個 employee 查詢自己的 department 根據 dept_id
        for(Employee employee : employees) {
            sql = "select id, name from department where id=?";
            Object[] args = {employee.getDeptId()};
            Department department = (Department)jdbcTemplate.queryForObject(sql, args, new BeanPropertyRowMapper(Department.class));
            employee.setDepartment(department);
        }
        return employees;
    }
}
