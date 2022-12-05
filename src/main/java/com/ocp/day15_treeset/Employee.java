package com.ocp.day15_treeset;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
    private String name;
    private int age;
    private int salary;
    private static boolean sort = true; // true: 小到大, false: 大到小
    
    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    
    public static void setSort(boolean sort) {
        Employee.sort = sort;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + this.age;
        hash = 53 * hash + this.salary;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (this.age != other.age) {
            return false;
        }
        if (this.salary != other.salary) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", age=" + age + ", salary=" + salary + '}';
    }

    @Override
    public int compareTo(Employee o) {
        //return age - o.age; // 由小到大
        //return salary - o.salary;
        //return o.age - age; // 由大到小
        return (age - o.age) * (sort ? 1 : -1);
    }
    
    
}
