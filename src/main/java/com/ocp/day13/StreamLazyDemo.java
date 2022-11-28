package com.ocp.day13;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamLazyDemo {
    public static void main(String[] args) {
        String[] names = {"Java", "Jo", "Helen", "Bob", "Vincent"};
        // name 的長度 >= 5 的數量有幾個
        // Stream Lazy
        IntStream intStream = Arrays.stream(names)
                                    .mapToInt(name -> name.length())
                                    .peek(System.out::println) // 印出目前 stream 中每一個元素
                                    .filter(lens -> lens >= 5);
                                    //.peek(System.out::println); // 印出目前 stream 中每一個元素
        
        // 只有遇到終點流才會執行
        System.out.println(intStream.count() + "個");
        
    }
}
