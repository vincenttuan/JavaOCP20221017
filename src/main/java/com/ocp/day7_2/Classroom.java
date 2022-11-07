package com.ocp.day7_2;

import java.util.ArrayList;

// 組合模式
public class Classroom {
    
    private int id; // 教室編號
    private Teacher teacher;
    private ArrayList<Student> students = new ArrayList<>();

    public Classroom(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    
    // 新增學生
    public void addStudent(Student student) {
        students.add(student);
    }
    
    // 移除學生
    public void removeStudent(int index) {
        students.remove(index);
    }
    
    // 清空所有學生
    public void removeAllStudents() {
        students.clear();
    }
    
    
    
    
}
