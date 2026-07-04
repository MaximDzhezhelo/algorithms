package com.algorithms.task;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {

    private volatile int i = 0;

    public int increment() {
        return i++;
    }

}
