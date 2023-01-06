package com.ocp.day23_thread;

import java.util.concurrent.Executor;

public class MyExecutor implements Executor {

    @Override
    public void execute(Runnable command) {
        new Thread(command).start();
    }
    
}
