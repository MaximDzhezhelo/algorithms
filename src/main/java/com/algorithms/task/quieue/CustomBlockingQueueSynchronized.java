package com.algorithms.task.quieue;

import java.util.ArrayDeque;
import java.util.Queue;

public class CustomBlockingQueueSynchronized<T> implements CustomBlockingQueue<T> {

    private final Queue<T> collection;
    private final int capacity;

    public CustomBlockingQueueSynchronized(int capacity) {
        this.capacity = capacity;
        this.collection = new ArrayDeque<>(capacity);
    }

    @Override
    public synchronized void put(T item) throws InterruptedException {
        while (collection.size() >= capacity) {
            wait();
        }
        collection.add(item);
        notifyAll();
    }

    @Override
    public synchronized T take() throws InterruptedException {
        while (collection.isEmpty()) {
            wait();
        }
        T item = collection.remove();
        notifyAll();

        return item;
    }

    @Override
    public synchronized int size() {
        return collection.size();
    }

}
