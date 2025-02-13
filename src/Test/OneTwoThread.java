package Test;

public class OneTwoThread extends Thread{
    public static void main(String[] args) {
        OneTwoThread t = new OneTwoThread();
        t.start();
        System.out.println("one. ");
        t.start();
        System.out.println("two ");
    }

    public void run(){
        System.out.println("Thread ");
    }
}
