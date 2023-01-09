package com.ocp.day24_thread;

// fork-join

import java.util.concurrent.RecursiveTask;

public class SumTask extends RecursiveTask<Integer>{
    // 門檻值
    private final static int THRESHOLD = 3;
    // 任務陣列
    int[] array;
    // 起迄位置
    int start, end;
    // 注入任務陣列與起迄位置
    public SumTask(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }
    // 負責拆分與計算
    @Override
    protected Integer compute() {
        // 1. 判斷是否在門檻值內, 若在就直接計算
        if(end - start <= THRESHOLD) {
            int sum = 0;
            for(int i=start;i<end;i++) {
                sum += this.array[i];
            }
            return sum; // 將結果回傳
        }
        
        // 2. 反之任務過大需一分為二
        int middle = (end - start) / 2;
        System.out.printf("split %d~%d ==> %d~%d, %d~%d\n", start, end, start, middle, middle, end);
        // 3. 拆分任務(fork)
        SumTask sumTask1 = new SumTask(array, start, middle);
        SumTask sumTask2 = new SumTask(array, middle, end);
        // 4. 並行計算
        invokeAll(sumTask1, sumTask2);
        // 5. 得到結果(join)
        int subResult1 = sumTask1.join();
        int subResult2 = sumTask2.join();
        // 6. 匯總結果
        int result = subResult1 + subResult2;
        System.out.printf("result=%d, subResult1=%d, subResult2=%d\n", result, subResult1, subResult2);
        return result;
    }
    
}
