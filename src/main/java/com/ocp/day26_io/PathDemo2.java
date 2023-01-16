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
        // 路徑切換
        Path path3 = Paths.get("home");
        Path path4 = Paths.get("home/sally/bar");
        Path path3_to_path4 = path3.relativize(path4);
        Path path4_to_path3 = path4.relativize(path3);
        System.out.println(path3_to_path4);
        System.out.println(path4_to_path3);
        // 比較頭尾
        Path path5 = Paths.get("C:/temp/company/finance/salary.txt");
        Path root = Paths.get("C:/temp");
        Path file = Paths.get("salary.txt");
        System.out.println(path5.startsWith(root)); // 起始是否是 root (C:/temp)
        System.out.println(path5.endsWith(file)); // 結尾是否是 file (salary.txt)
        
        
        
    }
}
