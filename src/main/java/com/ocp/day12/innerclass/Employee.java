package com.ocp.day12.innerclass;

// 員工類別(外部類別)
public class Employee {
    // 員工的工作類別(內部類別)
    public class Job {
        String name; // 工作名稱
        int level; // 工作難易度(1~10)
        public Job(String name, int level) {
            this.name = name;
            this.level = level;
        }
        public void printJob() {
            System.out.printf("Job name: %s Job level: %d\n", name, level);
        }
    }
    
}
