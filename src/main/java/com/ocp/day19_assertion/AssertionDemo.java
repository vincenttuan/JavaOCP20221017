package com.ocp.day19_assertion;

public class AssertionDemo {
    public static void main(String[] args) {
        int score = 49;
        
        // 不滿足 score >= 60 會拋出 Assertion Error
        assert score >= 60: "Fail: " + score;
        
        System.out.println("Good: " + score);
        
    }
}
