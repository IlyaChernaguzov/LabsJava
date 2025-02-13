package lesson2.nested;

public class LocalMethodInnerClassDemo {

    void doSomething() {
        int num = 888;

        class MethodInner {
            public void print() {
                System.out.println("MethodInner " + num);
            }
        }

        MethodInner methodInner = new MethodInner();
        methodInner.print();
    }

    public static void main(String[] args) {
        LocalMethodInnerClassDemo localMethodInnerClassDemo = new LocalMethodInnerClassDemo();
        localMethodInnerClassDemo.doSomething();
    }
}
