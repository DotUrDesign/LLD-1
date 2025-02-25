package org.example.concurrency.Concurrency.Prats_5_AdderSubtractor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value v = new Value();
        Adder x1 = new Adder(v);
        Subtractor x2 = new Subtractor(v);

        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<Void> futureAdder = executor.submit(x1);
        Future<Void> futureSubtractor = executor.submit(x2);

        // blocking...
        futureAdder.get();
        futureSubtractor.get();

        System.out.println("Value : " + v.value);
        executor.shutdown();
    }
}
