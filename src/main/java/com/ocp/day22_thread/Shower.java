package com.ocp.day22_thread;
// 第一條執行緒: 爸爸
// 第二條執行緒: 瓦斯工人

import java.util.logging.Level;
import java.util.logging.Logger;

// 1. 爸爸下班回家
// 2. 爸爸要洗熱水澡
// 3. 爸爸發現沒瓦斯了
// 4. 爸爸請瓦斯工人送瓦斯
// 5. 瓦斯工人開始送瓦斯 ...
// 6. 瓦斯工人將瓦斯送達並裝好
// 7. 爸爸開始洗澡
// 8. 爸爸洗完澡了
public class Shower {
    public static void main(String[] args) {
        new Father().start();
    }
}

class Father extends Thread {

    @Override
    public void run() {
        System.out.println("1. 爸爸下班回家");
        System.out.println("2. 爸爸要洗熱水澡");
        System.out.println("3. 爸爸發現沒瓦斯了");
        System.out.println("4. 爸爸請瓦斯工人送瓦斯");
        
        Worker worker = new Worker();
        worker.start();
        try {
            // Father 要等待 Worker 完成後再執行後續實作
            worker.join();
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        
        System.out.println("7. 爸爸開始洗澡");
        System.out.println("8. 爸爸洗完澡了");
    }
}

class Worker extends Thread {
    @Override
    public void run() {
        System.out.println("5. 瓦斯工人開始送瓦斯 ...");
        for(int i=0;i<Integer.MAX_VALUE;i++); // 模擬忙碌的狀況
        System.out.println("6. 瓦斯工人將瓦斯送達並裝好");
    }
}
