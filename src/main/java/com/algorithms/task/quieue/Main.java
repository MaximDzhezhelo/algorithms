package com.algorithms.task.quieue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {

    static void main() throws InterruptedException {
        CustomBlockingQueue<String> queue = new CustomBlockingQueueLock<>(1);

        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        producer.start();
        consumer.start();

        Thread.sleep(1000);

        producer.interrupt();
        consumer.interrupt();

        producer.join();
        consumer.join();

        System.out.println("Finished");

        Queue priorityQueue = new PriorityQueue();
        Queue blockingQueue = new ArrayBlockingQueue(25);

    }

}
