package org.example.concurrency.Concurrency.Prats_7_AdderSubtractorSyncLock;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    private Value v;
    public Adder(Value v) {
        this.v = v;
    }

    @Override
    public Void call() throws Exception {
        for(int i=1;i<=1000;i++) {
            synchronized (this.v) {
                this.v.value += i;
            }
        }
        return null;
    }
}
