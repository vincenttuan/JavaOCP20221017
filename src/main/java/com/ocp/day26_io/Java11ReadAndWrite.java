package com.ocp.day26_io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Java11ReadAndWrite {
    public static void main(String[] args) throws IOException {
        String str = "Hello";
        String fileName = "src/main/java/com/ocp/day26_io/demo.txt";
        Path path = Paths.get(fileName);
        // write
        Files.writeString(Files.createFile(path), str, StandardOpenOption.WRITE);
        System.out.println(str + " written to " + path.toAbsolutePath());
        // read
        String s = Files.readString(path);
        System.out.println("read: " + s);

    }
}
