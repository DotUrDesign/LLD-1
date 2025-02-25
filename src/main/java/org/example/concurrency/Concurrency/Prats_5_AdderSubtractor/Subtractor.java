package org.example.concurrency.Concurrency.Prats_5_AdderSubtractor;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {
    private Value v;
    public Subtractor(Value v) {
        this.v = v;
    }

    @Override
    public Void call() throws Exception {
        for(int i=1;i<=1000;i++) {
            this.v.value -= i;
        }
        return null;
    }
}
