package com.ocp.day25_io;

import java.io.FileReader;
import java.io.IOException;

public class FileReadeDemo {
    public static void main(String[] args) {
        String filePath = "src/main/java/com/ocp/day25_io/data/lotto.txt";
        try(FileReader fr = new FileReader(filePath)) {
            char[] buffer = new char[1];
            StringBuilder sb = new StringBuilder();
            while (fr.read(buffer) != -1) {                
                //System.out.print(buffer[0]);
                if(buffer[0] == '\n' || buffer[0] == '[') {
                    continue;
                }
                if(buffer[0] == ']') {
                    sb.append(", ");
                    continue;
                }
                sb.append(buffer);
            }
            System.out.println(sb);
            
        } catch (IOException e) {
        }
    }
}
