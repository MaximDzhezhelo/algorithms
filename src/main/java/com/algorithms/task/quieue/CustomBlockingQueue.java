package com.algorithms.task.quieue;

public interface CustomBlockingQueue<T> {

    void put(T item) throws InterruptedException;
    T take() throws InterruptedException;
    int size();

}
