package org.example.concurrency.Concurrency.Prats_10_PrintFooBarAlternately_LeetCode;

// Question link : https://leetcode.com/problems/print-foobar-alternately/


import java.util.concurrent.Semaphore;

class FooBar {
    private int n;
    private Semaphore fooSemaphore;
    private Semaphore barSemaphore;

    public FooBar(int n) {
        this.n = n;
        fooSemaphore = new Semaphore(1);
        barSemaphore = new Semaphore(0);
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            fooSemaphore.acquire();
            printFoo.run();
            barSemaphore.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            barSemaphore.acquire();
            printBar.run();
            fooSemaphore.release();
        }
    }
};