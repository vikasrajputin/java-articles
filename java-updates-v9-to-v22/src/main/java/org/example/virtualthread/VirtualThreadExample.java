package org.example.virtualthread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;


/*
*
* Output Explanation:

* Traditional Thread Pool:
* Only 3 threads (pool-1-thread-1, pool-1-thread-2, pool-1-thread-3) are created. The system reuses the same threads to handle 5 orders.
* If you had thousands of tasks, you would need a large thread pool or efficient thread reuse, both of which add complexity.

* Virtual Threads:
* Each task (order) gets its own virtual thread (VirtualThread[#n]), even though only 5 tasks are created. Virtual threads are lightweight, so we don’t need to limit the number of concurrent threads.
* With virtual threads, even thousands or millions of concurrent tasks can be handled efficiently without adding resource overhead.
*
* */
public class VirtualThreadExample {

    public static void main(String[] args) {
        var orders = new ArrayList<String>();

        for(int i=0; i<100; i++){
            orders.add("Orders_"+i);
        }

        // Using traditional thread pool (for comparison)
        processOrdersWithThreadPool(orders);

        // Using virtual threads (Project Loom)
        processOrdersWithVirtualThreads(orders);
    }

    // Traditional thread pool approach
    private static void processOrdersWithThreadPool(List<String> orders) {
        System.out.println("Processing with traditional threads:");
        orders.forEach(o -> new Thread(() -> processOrder(o)).start());
        System.out.println("Processed with traditional threads:");
    }

    // Using virtual threads
    private static void processOrdersWithVirtualThreads(List<String> orders) {
        System.out.println("Processing with virtual threads:");
        orders.forEach(o -> Thread.startVirtualThread(() -> processOrder(o)));
        System.out.println("Processed with virtual threads:");
    }

    private static void processOrder(String order) {
        System.out.println(Thread.currentThread() + " Processing " + order);
        try {
            // Simulate processing time
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            //Thread.currentThread().interrupt();
        }
    }
}
