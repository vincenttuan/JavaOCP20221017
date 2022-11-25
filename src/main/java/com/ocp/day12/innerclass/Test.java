package com.ocp.day12.innerclass;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee("Mary");
        Employee.Job job = employee.new Job("Program", 7);
        job.printJob();
        
    }
}
