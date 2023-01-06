package com.ocp.day23_thread;

public class Job implements Runnable {
    @Override
    public void run() {
        System.out.println("一般任務");
    }
}
