package lesson7.concurrency.threads.base;

import lesson7.concurrency.threads.base.worker.ThreadCounterWorker;

public class ThreadCounterJoinDemo {
    public static void main(String[] args) {
        ThreadCounterWorker worker1 = new ThreadCounterWorker("A", 15);
        ThreadCounterWorker worker2 = new ThreadCounterWorker("B", 100);

        worker1.start();
        worker2.start();

        try {
            worker1.join();
            worker2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }

        System.out.println("Process is finished!!!");
    }
}
