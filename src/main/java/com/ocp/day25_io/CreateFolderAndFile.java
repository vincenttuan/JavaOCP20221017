package com.ocp.day25_io;

import java.io.File;

public class CreateFolderAndFile {
    // 欲在 "com.ocp.day25_io" 下建立 data 的資料夾
    // 欲在 "com.ocp.day25_io\data" 下建立 news.txt 文件檔案
    public static void main(String[] args) {
        String basePath = "src/main/java/com/ocp/day25_io";
        String folderPath = basePath + "/data";
        File folderFile = new File(folderPath); // 資料夾物件
        
        if(!folderFile.exists()) { // 若路徑資料夾不存在
            folderFile.mkdir(); // 建立資料夾
            System.out.println("/data 資料夾建立成功!");
        } else {
            System.out.println("/data 資料夾已存在!");
        }
    }
}
