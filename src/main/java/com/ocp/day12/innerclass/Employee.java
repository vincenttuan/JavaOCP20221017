package com.ocp.day12.innerclass;

// 員工類別(外部類別)
public class Employee {
    private String name; // 員工姓名
    public Employee(String name) {
        this.name = name;
    }
    // 員工的工作類別(內部類別)
    public class Job {
        private String name; // 工作名稱
        private int level; // 工作難易度(1~10)
        public Job(String name, int level) {
            this.name = name;
            this.level = level;
        }
        public void printJob() {
            String name = "我的工作";
            System.out.printf("%s: %s, 員工姓名: %s, level: %d\n", name, this.name, Employee.this.name, level);
        }
    }
    
}
