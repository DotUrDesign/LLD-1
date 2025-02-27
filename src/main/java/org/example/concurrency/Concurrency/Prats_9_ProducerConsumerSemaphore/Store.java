package org.example.concurrency.Concurrency.Prats_9_ProducerConsumerSemaphore;

import java.util.concurrent.ConcurrentLinkedDeque;

public class Store {
    private int maxSize;
    private ConcurrentLinkedDeque<Object> items;
    Store(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ConcurrentLinkedDeque<>();
    }
    public ConcurrentLinkedDeque<Object> getItems() {
        return items;
    }
    public int getMaxSize() {
        return maxSize;
    }
    public void addItem() {
        System.out.println("Producer producing time, current size " + this.items.size());
        this.items.add(new Object());
    }
    public void removeItem() {
        System.out.println("Consumer consuming time, current size " + this.items.size());
        this.items.remove();
    }
}
