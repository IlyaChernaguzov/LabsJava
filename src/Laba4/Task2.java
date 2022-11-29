package Laba4;

public class Task2 {
    public static void main(String[] args) {
        int n;
        for (n = 1; n <= 100; n++) {
            if (n % 3 == 0 && n % 5 != 0) {System.out.println("Делится на 3: " + n);}
            if (n % 5 == 0 && n % 3 == 0) {System.out.println("Делится на 3 и на 5: " + n);}
            if (n % 5 == 0 && n % 3 != 0) {System.out.println("Делится на 5: " + n);}

        }
    }
}


//Напишите программу, которая выводит числа от 1 до 100, которые делятся на 3, 5 и на то и другое (то есть и на 3 и на 5).
// Пример вывода:
//
//        Делится на 3: ….
//        Делится на 5: ….
//        Делится на 3 и на 5: ….

