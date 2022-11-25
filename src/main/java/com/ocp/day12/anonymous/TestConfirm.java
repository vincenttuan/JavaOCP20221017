package com.ocp.day12.anonymous;

public class TestConfirm {
    public static void main(String[] args) {
        int[] scores = {90, 40, 60, 30, 50, 100};
        // 及格 60, 高標 70, 低標 40
        Confirm pass = (value) -> value >= 60; // {return value >= 60;};
        Confirm high = (value) -> value >= 70;
        Confirm low  = (value) -> value >= 40;
        printCheck(scores, pass);
    }
    
    public static void printCheck(int[] scores, Confirm confirm) {
        for(int score : scores) {
            if(confirm.check(score)) {
                System.out.println(score);
            }
        }
    }
}
