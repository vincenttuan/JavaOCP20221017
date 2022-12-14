package com.ocp.day16_map;

import java.util.Objects;

public class Exam implements Comparable<Exam>{
    private String subject; // 科目
    private Integer score; // 分數

    public Exam() {
    }

    public Exam(String subject, Integer score) {
        this.subject = subject;
        this.score = score;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.subject);
        hash = 29 * hash + Objects.hashCode(this.score);
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
        final Exam other = (Exam) obj;
        if (!Objects.equals(this.subject, other.subject)) {
            return false;
        }
        return Objects.equals(this.score, other.score);
    }
    
    @Override
    public String toString() {
        return "Exam{" + "subject=" + subject + ", score=" + score + '}';
    }

    @Override
    public int compareTo(Exam o) {
        return score - o.score;
    }
    
    
}
