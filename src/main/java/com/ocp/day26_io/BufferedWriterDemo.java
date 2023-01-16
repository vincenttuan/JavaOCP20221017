package com.ocp.day26_io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        String[] logs = {"2023-01-05 log1...", "2023-01-06 log2..."};
        String filePath = "src/main/java/com/ocp/day25_io/data/log.txt";
        try(FileWriter fw = new FileWriter(filePath, true);
            BufferedWriter bw = new BufferedWriter(fw)) {
            
            for(String log : logs) {
                bw.write(log);
                bw.newLine(); // 換行符號
            }
            System.out.println("寫入完畢 !");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
