package com.ocp.day22_thread;

import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LottoMain {
    public static void main(String[] args) {
        Lotto lotto = new Lotto();
        FutureTask<Set<Integer>> task = new FutureTask<>(lotto);
        new Thread(task).start();
        System.out.println("搖獎中...");
        try {
            System.out.println("電腦選號: " + task.get());
        } catch (InterruptedException | ExecutionException ex) {
            System.out.println(ex);
        }
    }
}
