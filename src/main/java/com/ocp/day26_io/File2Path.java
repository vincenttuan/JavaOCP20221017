package com.ocp.day26_io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class File2Path {
    public static void main(String[] args) throws IOException {
        String filePath = "src/main/java/com/ocp/day25_io/data/log.txt";
        File file = new File(filePath);
        
        Path path = file.toPath();
        byte[] bytes = Files.readAllBytes(path);
        String str = new String(bytes, "UTF-8");
        System.out.println(str);
    }
}
