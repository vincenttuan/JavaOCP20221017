package com.ocp.day26_io;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo2 {
    public static void main(String[] args) {
        // 路徑正常化
        String path = "C:/temp/../../home/person.txt";
        System.out.println(Paths.get(path).normalize());
        // 路徑結合
        Path path1 = Paths.get("C:/temp/company/finance/");
        Path path2 = Paths.get("data/salary.txt"); // 若 /data/salary.txt 絕對路徑結合
        path1 = path1.resolve(path2);
        System.out.println(path1);
    }
}
