package com.ocp.day18_exception;

import com.google.gson.Gson;
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
            //System.out.println(jsonStr);
            Gson gson = new Gson();
            BadRice[] badRices = gson.fromJson(jsonStr, BadRice[].class);
            System.out.printf("資料總筆數: %d\n", badRices.length);
            String keyword = "冠軍";
            System.out.printf("品名關鍵字: %s 的資料下:\n", keyword);
            for(BadRice badRice : badRices) {
                if(badRice.品名.contains(keyword)) {
                    System.out.printf("品名: %s Title: %s 不合格原因: %s\n", badRice.品名, badRice.Title, badRice.不合格原因);
                }
            }
            
            
        } catch (IOException e) { // 因為 MalformedURLException | IOException 有繼承關係所以只要寫 IOException 即可
            System.out.println(e);
        }
    }
    
    
}
