package com.ocp.day26_io;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FilesStreamCopy {
    public static void main(String[] args) throws IOException {
        // SAKURA_KI
        String url = "http://img.touxiangwu.com/uploads/allimg/2021082516/c22fn0qzosm.jpg";
        URI uri = URI.create(url);
        Path dest = Paths.get("src/main/java/com/ocp/day26_io/SAKURA_KI.png");
        Files.copy(uri.toURL().openStream(), dest, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("COPY Image OK!");
    }
}
