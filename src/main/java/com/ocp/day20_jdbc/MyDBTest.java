package com.ocp.day20_jdbc;

import com.ocp.day20_jdbc.dao.MyDao;
import com.ocp.day20_jdbc.entity.Department;
import com.ocp.day20_jdbc.entity.Employee;
import java.util.List;

public class MyDBTest {
    public static void main(String[] args) {
        MyDao myDao = new MyDao();
        
        List<Department> departments = myDao.queryDepartments();
        System.out.println(departments);
        
        List<Employee> employees = myDao.queryEmployees();
        System.out.println(employees);
    }
}
