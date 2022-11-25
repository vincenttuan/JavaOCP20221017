package com.ocp.day12.innerclass;

// 員工類別(外部類別)
public class Employee {
    private String name; // 員工姓名
    static int score = 100; // 外部類別可以定義類別成員
    public Employee(String name) {
        this.name = name;
    }
    // 員工的工作類別(一般內部類別)
    // 不可以有 static  類別成員(屬性/方法 )
    public class Job {
        //static int score = 100; // 內部類別不可以定義類別成員
        private String name; // 工作名稱
        private int level; // 工作難易度(1~10)
        public Job(String name, int level) {
            this.name = name;
            this.level = level;
        }
        public void printJob() {
            String name = "我的工作";
            System.out.printf("%s: %s, 員工姓名: %s, level: %d\n", name, this.name, Employee.this.name, level);
            System.out.printf("score: %d\n", Employee.score);
        }
    }
    
}
