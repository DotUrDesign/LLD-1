package org.example.concurrency.Concurrency.Prats_8_ProducerConsumerProblem;

public class Producer implements Runnable{
    public Store store;
    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while(true) {
            if (store.getItems().size() < store.getMaxSize()) {
                store.addItem();
            }
        }
    }
}
