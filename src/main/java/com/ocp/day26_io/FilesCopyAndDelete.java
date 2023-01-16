package com.ocp.day26_io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FilesCopyAndDelete {
    public static void main(String[] args) throws IOException{
        Path source = Paths.get("src/main/java/com/ocp/day25_io/data/boss.png");
        Path dest = Paths.get("src/main/java/com/ocp/day26_io/boss.png");
        
        Files.copy(source, dest, StandardCopyOption.REPLACE_EXISTING);
        Files.delete(source);
        //Files.deleteIfExists(dest);
        System.out.println("COPY OK!");
        
    }
}
