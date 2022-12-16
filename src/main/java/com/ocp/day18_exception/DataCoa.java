package com.ocp.day18_exception;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class DataCoa {
    public static void main(String[] args) {
        // 市售米抽檢不合格
        String path = "https://data.coa.gov.tw/Service/OpenData/FromM/AgricultureiRiceFailure.aspx";
        try {
            URL url = new URL(path); // 建立 URL 物件
            InputStream in = url.openStream(); // 取得資料串流
            Scanner scanner = new Scanner(in, "UTF-8");
            String jsonStr = scanner.useDelimiter("\\A").next();
            System.out.println(jsonStr);
        } catch (IOException e) { // 因為 MalformedURLException | IOException 有繼承關係所以只要寫 IOException 即可
            System.out.println(e);
        }
        
        
    }
}
