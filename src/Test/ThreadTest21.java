package Test;

public class ThreadTest21 extends Thread {
    public static void main(String[] args) {
        ThreadTest21 t = new ThreadTest21();
        t.run();
    }

    public void run (){
        for (int i = 1; i < 3; i++){
            System.out.println(i + " ..");
        }
    }
}
