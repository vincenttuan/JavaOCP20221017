package com.ocp.day25_io;

import java.io.FileReader;
import java.io.FileWriter;

public class Copy {
    public static void main(String[] args) {
        String sourcePath = "src/main/java/com/ocp/day25_io/data/news.txt";
        String distPath = "src/main/java/com/ocp/day25_io/data/backup.txt";
        try(FileReader fr = new FileReader(sourcePath);
            FileWriter fw = new FileWriter(distPath)) {
            
            char[] buffer = new char[1];
            while (fr.read(buffer) != -1) {                
                fw.append(new String(buffer));
            }
            System.out.println("Copy OK !");
            
        } catch (Exception e) {
        }
        
    }
}
