package Test;

import javax.swing.*;

public class ThreadTest extends Thread{
    final StringBuffer sb1 = new StringBuffer();
    final StringBuffer sb2 = new StringBuffer();

    public static void main(String[] args) {
        final ThreadTest h = new ThreadTest();


        new Thread(){
            public void run(){
                synchronized (this){
                    h.sb1.append("Java");
                    h.sb2.append("Thread");
                    System.out.println(h.sb1);
                    System.out.println(h.sb2);
                }
            }
        }.start();

        new Thread(){
            public void run(){
                synchronized (this){
                    h.sb1.append("Multithreading");
                    h.sb2.append("Example");
                    System.out.println(h.sb2);
                    System.out.println(h.sb1);
                }
            }
        }.start();
    }
}
