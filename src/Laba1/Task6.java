package Laba1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        String c;
        if (b%2 != 0) {
            c = "Нечетное";
        }
        else {
            if (b > 100) {
                c = "Выход за пределы диапазона";
            }
            else {
                c = "Четное";
            }
        }
        System.out.println(c);

    }
}
