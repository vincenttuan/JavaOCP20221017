package com.ocp.day26_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        String filePath = "src/main/java/com/ocp/day25_io/data/lotto.txt";
        try(FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr)) {
            
            String data = null;
            while ((data = br.readLine()) != null) { // 逐行讀取   
                System.out.println(data); // 逐行印出
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
