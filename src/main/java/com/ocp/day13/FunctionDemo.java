package com.ocp.day13;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        // Function
        /*
            public interface Function<T, R> {
                R apply(T t);
            }
        */
        Function<String, Integer> func = (words) -> {
            return words.split(" ").length;
        };
        System.out.println(func.apply("she sell sea shell on the sea shore"));
        
        Function<String, Integer> func2 = (words) -> words.split(" ").length;
        System.out.println(func2.apply("she sell sea shell on the sea shore"));
        
        // BiFunction
        /*
            public interface BiFunction<T, U, R> {
                R apply(T t, U u);
            }
        */
        BiFunction<String, Integer, Double> biFunction = (name, value) -> {
            double result = 0.0;
            switch (name) {
                case "正方形":
                    result = Math.pow(value, 2);
                    break;
                case "圓形":
                    result = Math.pow(value, 2) * Math.PI;
                    break;
            }
            return result;
        };
        System.out.println("正方形面積: " + biFunction.apply("正方形", 10));
        System.out.println("圓形面積: " + biFunction.apply("圓形", 10));
    }
}
