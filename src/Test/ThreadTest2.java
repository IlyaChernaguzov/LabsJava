package Test;

public class ThreadTest2 extends Thread{
    public void run(){
        for (int i = 0; i < 3; i++){
            System.out.println("A");
            System.out.println("B");
        }
    }
}

class ThreadTest3 extends Thread{
    public void run(){
        for (int i = 0; i < 3; i++){
            System.out.println("C");
            System.out.println("D");
        }
    }

    public static void main(String[] args) {
        ThreadTest2 t1 = new ThreadTest2();
        ThreadTest3 t2 = new ThreadTest3();
        t1.start();
        t2.start();
    }
}
