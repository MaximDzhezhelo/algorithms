package com.algorithms.fibonacci;

public class Runner {

    public static void main(String[] args) {
        final FibonacciRecursiveTask task = new FibonacciRecursiveTask(25);
        final Integer compute = task.compute();
        System.out.println(compute);
    }

}
