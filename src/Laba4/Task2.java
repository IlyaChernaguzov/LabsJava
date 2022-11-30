package Laba4;

public class Task2 {
    public static void intMethod (int x, int y) {

        for (int n = 1; n <= 100; n++) {
            if (n % x == 0) {System.out.println("Делится на " + x + ": " + n);}
            if (n % y == 0 && n % x == 0) {System.out.println("Делится на " + x + " и на " + y + ": " + n);}
            if (n % y == 0) {System.out.println("Делится на " + y + ": " + n);}

        }
    }
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        intMethod(x, y);
    }
}


//Напишите программу, которая выводит числа от 1 до 100, которые делятся на 3, 5 и на то и другое (то есть и на 3 и на 5).
// Пример вывода:
//
//        Делится на 3: ….
//        Делится на 5: ….
//        Делится на 3 и на 5: ….

