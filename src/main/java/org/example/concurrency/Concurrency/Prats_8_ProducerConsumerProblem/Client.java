package org.example.concurrency.Concurrency.Prats_8_ProducerConsumerProblem;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
    WRONG PROCESS as ...
 */

public class Client {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        Store st = new Store(5);

        for(int i=0;i<8;i++) {
            executor.execute(new Producer(st));
        }

        for(int j=0;j<20;j++) {
            executor.execute(new Consumer(st));
        }

        executor.shutdown();
    }
}
