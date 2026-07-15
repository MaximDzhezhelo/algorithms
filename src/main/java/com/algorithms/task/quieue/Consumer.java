package com.algorithms.task.quieue;

public class Consumer extends Thread {

    private final CustomBlockingQueue<String> queue;

    public Consumer(CustomBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Consumer try to take");
                String item = queue.take();
                System.out.println("Took successfully " + item);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Thread interrupted, shutting down...");
        }
    }
}
