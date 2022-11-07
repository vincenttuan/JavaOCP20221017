package com.ocp.day7_2;

import java.util.ArrayList;
import java.util.Arrays;

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
    
    // 計算學生平均成績 
    public double getAvgOfScore() {
        if(students.size() == 0) {
            return 0.0;
        }
        return students.stream()
                       .mapToInt(Student::getScore)
                       //.mapToInt(student -> student.getScore())
                       .average()
                       .getAsDouble();
    }
    
    @Override
    public String toString() {
        return "Classroom{" + "id=" + id + ", teacher=" + teacher + ", students=" + students + '}';
    }

}
