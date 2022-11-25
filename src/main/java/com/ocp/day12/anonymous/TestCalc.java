package com.ocp.day12.anonymous;

public class TestCalc {
    public static void main(String[] args) {
        Calc calc = new CalcImpl();
        System.out.println(calc.submit(10, 20));
    }
}
