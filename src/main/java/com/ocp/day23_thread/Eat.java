package com.ocp.day23_thread;

// 吃餅乾執行緒工作
public class Eat implements Runnable {
    private Cookies cookies;
    
    public Eat(Cookies cookies) {
        this.cookies = cookies;
    }
    
    @Override
    public void run() {
        try {
            // 吃 10 次餅乾
            for(int i=1;i<=10;i++) {
                cookies.eat(i); // 吃餅乾
            }
        } catch (InterruptedException e) {
            e.printStackTrace(); // 吃餅乾失敗
        }
    }
    
}
