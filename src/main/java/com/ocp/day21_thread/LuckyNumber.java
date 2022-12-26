package com.ocp.day21_thread;

public class LuckyNumber extends Thread {
    private int number;
    
    public LuckyNumber(String name, int number) {
        super(name); // 設定執行緒的名字
        this.number = number;
    }

    @Override
    public void run() {
        job();
    }
    
    private void job() {
        String threadName = Thread.currentThread().getName();
        for(int i=1;;i++) {            
            int number = (int)(Math.random() * 1000);
            if(number == this.number) {
                System.out.printf("%s 總共取了 %d 次才得到 %d\n", threadName, i, number);
            }
        }
    }
    
}
