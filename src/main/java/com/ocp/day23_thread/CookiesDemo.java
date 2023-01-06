package com.ocp.day23_thread;

public class CookiesDemo {
    public static void main(String[] args) {
        Cookies cookies = new Cookies();
        // 工作
        Runnable put = new Put(cookies);
        Runnable eat = new Eat(cookies);
        // 執行緒排定工作
        Thread master = new Thread(put);
        Thread dog = new Thread(eat);
        // 執行
        dog.start();
        master.start();
        
    }
}
