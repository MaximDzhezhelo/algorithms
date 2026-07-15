package com.algorithms.task.quieue;

import java.util.UUID;

public class Producer extends Thread {

    private final CustomBlockingQueue<String> queue;

    public Producer(CustomBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                String item = UUID.randomUUID().toString();
                System.out.println("Producer try to put " + item);
                queue.put(item);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Thread interrupted, shutting down...");
        }
    }
}
