package Test;

public class HelloJavaThread implements Runnable{
    String x, y;

    public void run(){
        for (int i = 0; i < 10; i++)
            synchronized (this){
            x = "Hello";
            y = "Java";
                System.out.println(x + " " + y + " ");
            }
    }

    public static void main(String[] args) {
        HelloJavaThread run = new HelloJavaThread();
        Thread obj1 = new Thread(run);
        Thread obj2 = new Thread(run);
        obj1.start();
        obj2.start();
    }
}
