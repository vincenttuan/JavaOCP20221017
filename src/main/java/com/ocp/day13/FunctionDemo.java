package com.ocp.day13;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

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
        
        // BinaryOperator
        /*
            public interface BiFunction<T, U, R> {
                R apply(T t, U u);
            }
            public interface BinaryOperator<T> extends BiFunction<T, T, T> {
                
            }
        */
        BinaryOperator<Double> binaryOperator = (h, w) -> w / Math.pow(h/100, 2);
        BiFunction<Double, Double, Double> biFunction2 = (h, w) -> w / Math.pow(h/100, 2);
        // 利用 BinaryOperator<Double> 取代 BiFunction<Double, Double, Double>
        System.out.println(binaryOperator.apply(170.0, 60.0));
        System.out.println(biFunction2.apply(170.0, 60.0));
        
        // UnaryOperator 輸入參數與回傳值的型別一致
        /*
        public interface Function<T, R> {
            R apply(T t);
        }
        public interface UnaryOperator<T> extends Function<T, T> {
        }
        */
        UnaryOperator<Double> unaryOperator = (r) -> r * r * 3.14; // Math.pow(r, 2) * Math.PI
        System.out.println(unaryOperator.apply(10.0));
    }
}
