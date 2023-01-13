package com.ocp.day25_io;

import java.io.File;
import java.io.IOException;

public class CreateTempFiles {
    public static void main(String[] args) throws IOException {
        String basePath = "src/main/java/com/ocp/day25_io/data";
        File folderFile = new File(basePath);
        // 建立暫存檔(temp files)
        File f1 = File.createTempFile("temp", ".txt", folderFile);
        File f2 = File.createTempFile("foo", ".sql", folderFile);
        File f3 = File.createTempFile("bar", ".csv", folderFile);
        
    }
}
