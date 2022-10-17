package com.ocp.day1;

public class CalcBMI {
    public static void main(String[] args) {
        double h = 170;
        double w = 60;
        double bmi = w / Math.pow(h/100, 2);
        System.out.printf("身高: %.1f 體重: %.1f BMI: %.2f\n", h, w, bmi);
    }
}
