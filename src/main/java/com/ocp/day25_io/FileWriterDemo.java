package com.ocp.day25_io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.IntStream;

public class FileWriterDemo {
    
    public static void main(String[] args) {
        String filePath = "src/main/java/com/ocp/day25_io/data/lotto.txt";
        try(FileWriter fw = new FileWriter(filePath, true);) { // true 表示保留檔案資料
            IntStream.rangeClosed(1, 50).forEach(i -> {
                try {
                    fw.append(getLotto() + "\n");
                } catch (Exception e) {
                }
            });
            System.out.println("Write OK!");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    
    // 電腦 lotto 539 選號
    public static Set<Integer> getLotto() {
        Set<Integer> lotto = new LinkedHashSet<>();
        Random random = new Random();
        while (lotto.size() < 5) {
            lotto.add(random.nextInt(39) + 1);
        }
        return lotto;
    }
    
    
}
