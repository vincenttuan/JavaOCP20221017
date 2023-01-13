package com.ocp.day25_io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class DownloadImage {
    public static void main(String[] args) throws Exception {
        String sourcePath = "https://hips.hearstapps.com/hmg-prod/images/2023-mclaren-artura-101-1655218102.jpg";
        String distPath = "src/main/java/com/ocp/day25_io/data/car.jpg";
        // 得到一個來自網路的串流 InputStream
        URL url = new URL(sourcePath);
        URLConnection conn = url.openConnection();
        try(InputStream is = conn.getInputStream();
            FileOutputStream fos = new FileOutputStream(distPath)) {
            
            byte[] buffer = new byte[1];
            while (is.read(buffer) != -1) { // 將資料讀進 buffer 中     
                fos.write(buffer); // 將 buffer(就是 byte[]) 直接寫入
            }
            System.out.println("Download OK");
            
        } catch(IOException e) {
            e.printStackTrace();
        }
        
    }
}
