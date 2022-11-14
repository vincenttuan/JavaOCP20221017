package com.ocp.day9_2;

public class Test6 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Manager manager = new Manager();
        Supervisor supervisor = new Supervisor();
        printBudget(employee);
    }
    
    // 印出 budget 資源
    public static void printBudget(Employee employee) {
        if(employee instanceof Manager) {
            System.out.println(((Manager)employee).budget);
        }
    }
}
