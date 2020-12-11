package com.algorithms.fibonacci;

import java.util.concurrent.RecursiveTask;

public class FibonacciRecursiveTask extends RecursiveTask<Integer> {

    final int n;

    FibonacciRecursiveTask(int n) {
        this.n = n;
    }

    public Integer compute() {
        if (n <= 1) return n;
        final FibonacciRecursiveTask f1 = new FibonacciRecursiveTask(n - 1);
        f1.fork();

        final FibonacciRecursiveTask f2 = new FibonacciRecursiveTask(n - 2);
        return f2.compute() + f1.join();
    }

}