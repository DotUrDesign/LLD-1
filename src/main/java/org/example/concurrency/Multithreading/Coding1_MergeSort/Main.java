package org.example.concurrency.Multithreading.Coding1_MergeSort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> l = List.of(7,3,1,2,4,6,17,12);
        ExecutorService executor = Executors.newCachedThreadPool();
        Sorter sorter = new Sorter(l, executor);
        Future<List<Integer>> output = executor.submit(sorter);
        System.out.println(output.get());
        executor.shutdown();
    }
}
