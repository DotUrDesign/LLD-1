package org.example.concurrency.Concurrency.Prats_6_AdderSubtractorLock;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value v = new Value();
        Lock lock = new ReentrantLock();
        Adder x1 = new Adder(v, lock);
        Subtractor x2 = new Subtractor(v, lock);

        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<Void> futureAdder = executor.submit(x1);
        Future<Void> futureSubtractor = executor.submit(x2);

        futureAdder.get();
        futureSubtractor.get();

        System.out.println("Value : " + v.value);
        executor.shutdown();
    }


}
