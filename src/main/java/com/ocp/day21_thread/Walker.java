package com.ocp.day21_thread;

public class Walker extends Thread {

    @Override
    public void run() {
        job();
    }
    
    private void job() {
        String threadName = Thread.currentThread().getName(); // 取得執行緒的名字
        for(int i=1;i<=1000;i++) {
            System.out.printf("%s 走了 %d 步\n", threadName, i);
        }
    }
    
}
