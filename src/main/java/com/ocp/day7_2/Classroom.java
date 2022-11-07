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
    public double getScoreOfAvg() {
        if(students.size() == 0) {
            return 0.0;
        }
        return students.stream()
                       .mapToInt(Student::getScore)
                       //.mapToInt(student -> student.getScore())
                       .average()
                       .getAsDouble();
    }
    
    // 計算平均年齡
    public double getAgeOfAvg() {
        double avg = 0.0;
        if(teacher == null && students.size() == 0) {
            return avg;
        }
        if(teacher != null && students.size() == 0) {
            return teacher.getAge();
        }
        // 先計算出學生平均年齡
        double studentAgeOfAvg = students.stream()
                                         .mapToInt(Student::getAge)
                                         .average()
                                         .getAsDouble();
        // 有學生沒有老師的情況下
        if(teacher == null) { 
            return studentAgeOfAvg;
        }
        // 有學生有老師的情況下
        // 先計算出學生年齡總和 + 老師的年齡
        int sumOfAge = students.stream().mapToInt(Student::getAge).sum() + teacher.getAge();
        avg = sumOfAge / (double)(students.size() + 1);
        return avg;
    }
    
    @Override
    public String toString() {
        return "Classroom{" + "id=" + id + ", teacher=" + teacher + ", students=" + students + '}';
    }

}
