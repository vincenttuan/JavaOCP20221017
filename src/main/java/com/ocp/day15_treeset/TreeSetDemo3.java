package com.ocp.day15_treeset;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo3 {
    public static void main(String[] args) {
        Employee.setSort(SortType.小到大);
        Employee emp1 = new Employee("John", 30, 45000);
        Employee emp2 = new Employee("Mary", 25, 48000);
        Employee emp3 = new Employee("Bob", 40, 55000);
        Set<Employee> employees = new TreeSet<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        System.out.println(employees);
        
    }
}
