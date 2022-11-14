package com.ocp.day9_2;

public class Test3 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Employee manager = new Manager();
        Employee supervisor = new Supervisor();
        
        employee.job();
        manager.job();
        supervisor.job();
    }
}
