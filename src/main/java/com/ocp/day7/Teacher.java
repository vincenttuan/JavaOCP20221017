package com.ocp.day7;

public class Teacher extends Person {
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void job() {
        System.out.println("教課");
    }

    @Override
    public String toString() {
        return "Teacher{" + "salary=" + salary + '}';
    }
    
    
}
