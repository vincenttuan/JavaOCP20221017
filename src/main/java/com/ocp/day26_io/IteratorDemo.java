package com.ocp.day26_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/main/java/com/ocp/day25_io/data/log.txt");
        // 1. BufferedReader + FileReader
        System.out.println("1. BufferedReader + FileReader:");
        try(BufferedReader br = new BufferedReader(new FileReader(path.toString()))) {
            br.lines().forEach(System.out::println);
        } catch(IOException e) {
            e.printStackTrace();
        }
        // 2. Files.newBufferedReader
        System.out.println("2. Files.newBufferedReader:");
        try(BufferedReader br = Files.newBufferedReader(path)) {
            br.lines().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 3. Files.readAllLines() (List 集合)
        System.out.println("3. Files.readAllLines()");
        List<String> list = Files.readAllLines(path);
        list.stream().forEach(System.out::println);
        // 4. Files.lines() (Stream 串流)
        System.out.println("4. Files.lines()");
        Files.lines(path).forEach(System.out::println);
    }
}
