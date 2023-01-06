package com.ocp.day23_thread;

// 放餅乾執行緒工作
public class Put implements Runnable {
    private Cookies cookies;
    
    public Put(Cookies cookies) {
        this.cookies = cookies;
    }
    
    @Override
    public void run() {
        try {
            // 放 10 次餅乾
            for(int i=1;i<=10;i++) {
                cookies.put(i); // 放餅乾
            }
        } catch (InterruptedException e) {
            e.printStackTrace(); // 放餅乾失敗
        }
    }
    
}
