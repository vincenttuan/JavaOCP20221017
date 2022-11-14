package com.ocp.day9_2;

// 多型應用
public class Test4 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Manager manager = new Manager();
        Supervisor supervisor = new Supervisor();
        
        Employee[] employees = {employee, manager, supervisor};
        for(Employee emp : employees) {
            System.out.println("salary: " + emp.salary);
            System.out.println(emp.getClass().getSimpleName());
            // 若 emp 是 Manager 則可以轉型成 Manager 並且可以得到 budget
            if(emp.getClass().getSimpleName().equals("Manager")) {
                System.out.println("budget: " + ((Manager)emp).budget);
            }
            emp.job();
        }
        
        //Manager[] managers = {manager, supervisor};
        
    }
}
