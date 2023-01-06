package com.ocp.day23_thread;

import java.util.Arrays;
import java.util.concurrent.CyclicBarrier;

public class CarDemo {
    public static void main(String[] args) {
        Runnable lunch = () -> System.out.println("吃中餐");
        CyclicBarrier cb = new CyclicBarrier(4, lunch);
        
        Thread[] threads = {
            new Thread(new Car(cb), "A"),
            new Thread(new Car(cb), "B"),
            new Thread(new Car(cb), "C"),
            new Thread(new Car(cb), "D")
        };
        
        Arrays.stream(threads).forEach(Thread::start);
        //Arrays.stream(threads).forEach(t -> t.start());
        
    }
}
