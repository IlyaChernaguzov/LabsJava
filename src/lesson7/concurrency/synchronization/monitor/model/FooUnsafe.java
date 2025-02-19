package lesson7.concurrency.synchronization.monitor.model;

public class FooUnsafe {
    public void first() {
        System.out.println("first");
    }

    public void second() {
        System.out.println("second");
    }

    public void third() {
        System.out.println("third");
    }
}
