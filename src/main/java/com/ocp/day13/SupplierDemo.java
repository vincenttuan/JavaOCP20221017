package com.ocp.day13;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        //Supplier 
        /*
        public interface Supplier<T> {
            T get();
        }
        */
        Supplier<String> supplier = () -> {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss E");
                                                      // 2022-11-28 下午 08:59:31 週一
            return sdf.format(new Date());
        };
        
        System.out.println("現在時間: " + supplier.get());
    }
}
