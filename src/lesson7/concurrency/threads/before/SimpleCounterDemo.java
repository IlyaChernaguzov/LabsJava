package lesson7.concurrency.threads.before;

import lesson7.concurrency.threads.before.worker.SimpleCounterWorker;

public class SimpleCounterDemo {
    public static void main(String[] args) {
        SimpleCounterWorker worker1 = new SimpleCounterWorker("A");
        SimpleCounterWorker worker2 = new SimpleCounterWorker("B");

        worker1.runCounter(15);
        worker2.runCounter(15);
    }
}
