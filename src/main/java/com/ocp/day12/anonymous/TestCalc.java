package com.ocp.day12.anonymous;

public class TestCalc {
    public static void main(String[] args) {
        Calc calc = new CalcImpl();
        System.out.println(calc.submit(10, 20));
        // 匿名內部類別
        Calc calc2 = new Calc(){
            
            @Override
            public int submit(int x, int y) {
                return x + y;
            }
        
        };
        System.out.println(calc2.submit(10, 20));
        // Lambda
        Calc calc3 = (int x, int y) -> { return x + y; };
        System.out.println(calc3.submit(10, 20));
        
        Calc calc4 = (x, y) -> { return x + y; };
        System.out.println(calc4.submit(10, 20));
        
        Calc calc5 = (x, y) -> x + y ;
        System.out.println(calc5.submit(10, 20));
    }
}
