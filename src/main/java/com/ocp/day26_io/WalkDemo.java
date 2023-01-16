package com.ocp.day26_io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;
public class WalkDemo {
    static int count = 0;
    public static void main(String[] args) throws IOException{
        Stream<Path> files = Files.walk(Paths.get("src/"));
        files.forEach(subPath -> {
            Path aPath = subPath.toAbsolutePath();
            if(aPath.toString().endsWith(".java")) {
                count++;
                System.out.println(aPath);
                try {
                    System.out.println(Files.readAttributes(aPath, BasicFileAttributes.class).creationTime());
                    System.out.println(Files.readAttributes(aPath, BasicFileAttributes.class).size());
                } catch (Exception e) {
                }
            }
        });
        System.out.println("count: " + count);
    }
}
