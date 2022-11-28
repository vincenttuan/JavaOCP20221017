package com.ocp.day13;

import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        // Consumer
        Consumer<String> consumer = (String x) -> System.out.println("Hello " + x);
        consumer.accept("John");
        // Consumer 多參數
        Consumer<Integer[]> consumer2 = (values) -> {
            int sum = Arrays.stream(values).mapToInt(Integer::intValue).sum();
            //int sum = Arrays.stream(values).mapToInt(x -> x.intValue()).sum();
            System.out.println(sum);
        };
        consumer2.accept(new Integer[]{100, 90, 80});
        
        Consumer<int[]> consumer3 = (values) -> {
            int sum = Arrays.stream(values).sum();
            System.out.println(sum);
        };
        consumer3.accept(new int[]{70, 60, 50});
        
        // BiConsumer
        /*
        public interface BiConsumer<T, U>
            public void accept(T t, U u);
        }
        */
        BiConsumer<String, Integer> biConsumer = (name, age) -> System.out.println(name + " 的年齡是 " + age);
        biConsumer.accept("John", 18);
        // ObjIntConsumer
        /*
        public interface ObjIntConsumer<T>
            public void accept(T t, int x);
        }
        */
        ObjIntConsumer<String> objIntConsumer = (name, age) -> System.out.println(name + " 的年齡是 " + age);
        objIntConsumer.accept("John", 18);
    }
}
