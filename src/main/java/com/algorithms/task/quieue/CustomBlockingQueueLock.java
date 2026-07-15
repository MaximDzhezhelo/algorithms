package com.algorithms.task.quieue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CustomBlockingQueueLock<T> implements CustomBlockingQueue<T> {

    private final Queue<T> collection;
    private final int capacity;
    private final Lock lock;
    private final Condition notFull;
    private final Condition notEmpty;

    public CustomBlockingQueueLock(int capacity) {
        this.capacity = capacity;
        this.collection = new ArrayDeque<>(capacity);
        this.lock = new ReentrantLock(true);
        this.notFull = lock.newCondition();
        this.notEmpty = lock.newCondition();
    }

    @Override
    public void put(T item) throws InterruptedException {
        lock.lock();
        try {
            while (collection.size() >= capacity) {
                notFull.await();
            }
            collection.add(item);
            notEmpty.signal();
        } finally {
            lock.unlock();
        }
    }

    @Override
    public T take() throws InterruptedException {
        lock.lock();
        try {
            while (collection.isEmpty()) {
                notEmpty.await();
            }
            T item = collection.remove();
            notFull.signal();
            return item;
        } finally {
            lock.unlock();
        }
    }

    @Override
    public int size() {
        lock.lock();
        try {
            return collection.size();
        } finally {
            lock.unlock();
        }
    }

}
