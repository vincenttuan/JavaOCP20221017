package com.ocp.day25_io;

import java.io.File;
import java.io.IOException;

public class CreateFolderAndFile {
    // 欲在 "com.ocp.day25_io" 下建立 data 的資料夾
    // 欲在 "com.ocp.day25_io\data" 下建立 news.txt 文件檔案
    public static void main(String[] args) throws IOException {
        String basePath = "src/main/java/com/ocp/day25_io";
        String folderPath = basePath + "/data";
        
        // 建立資料夾
        File folderFile = new File(folderPath); // 資料夾物件
        if(!folderFile.exists()) { // 若路徑資料夾是否存在 ?
            folderFile.mkdir(); // 建立資料夾
            System.out.println("/data 資料夾建立成功!");
        } else {
            System.out.println("/data 資料夾已存在!");
        }
        
        // 建立檔案
        File file = new File(folderPath + "/news.txt");
        if(!file.exists()) { // 判斷檔案是否存在 ?
            boolean check = file.createNewFile();
            System.out.println("建立檔案: " + check);
        } else {
            System.out.println("/news.txt 檔案已存在!");
        }
        
        // 判斷某資源路徑指的是檔案or目錄 ?
        String testPath = "src/main/java/com/ocp/day25_io/data";
        File testFile = new File(testPath);
        System.out.printf("%s 是路徑 => %b\n", testPath, testFile.isDirectory());
        System.out.printf("%s 是檔案 => %b\n", testPath, testFile.isFile());
        
        testPath = "src/main/java/com/ocp/day25_io/data/news.txt";
        testFile = new File(testPath);
        System.out.printf("%s 是路徑 => %b\n", testPath, testFile.isDirectory());
        System.out.printf("%s 是檔案 => %b\n", testPath, testFile.isFile());
        
    }
}
