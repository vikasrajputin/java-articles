package org.example.virtualthread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VirtualThreadExecutorServiceExample {
    public static void main(String[] args) throws Exception {

        ExecutorService executorService = Executors.newFixedThreadPool(5);
//      ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor();

        for (int i = 0; i < 10; i++) {
            final int taskId = i;

            executorService.submit(() -> {
                System.out.println("Thread "+ Thread.currentThread()+ ", task no: " + taskId + " starts.");

                // Simulate some work, such as an I/O-bound task
                try {
                    Thread.sleep(1000);  // Virtual thread will be unmounted here
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread " + Thread.currentThread()+ ", task no: " + taskId + " ends.");
            });
        }

        // Shutdown the executor service after the tasks are done
        executorService.shutdown();

        // Wait for a while to let tasks finish
        Thread.sleep(3000);  // Giving enough time for virtual threads to complete
    }
}
