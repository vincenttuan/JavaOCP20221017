package com.ocp.day24_thread;

// 連續取得 5 個幸運數字

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class InvokeAllDemo {
    
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newCachedThreadPool();
        Collection<Callable<Integer>> list = new ArrayList<>();
        list.add(new Lucky());
        list.add(new Lucky());
        list.add(new Lucky());
        list.add(new Lucky());
        list.add(new Lucky());
        
        List<Future<Integer>> results = service.invokeAll(list);
        for(Future future : results) {
            System.out.println(future.get());
        }
        System.out.println("------------------------");
        Integer result = service.invokeAny(list);
        System.out.println(result);
        service.shutdown();
        
    }
    
}
