package Laba2;

public class Calculator {
    public static void main(String args[])
    {
        int x = 2;
        int y = 3;
        Sum sum = new Sum();
        Sub sub = new Sub();
        Mult mult = new Mult();
        Div div = new Div();

        System.out.println(sum.sum(x, y));
        System.out.println(sub.sub(x, y));
        System.out.println(mult.mult(x, y));
        System.out.println(div.div(x, y));

    }

    public static class Sum {

        public int sum(int x, int y) {
            return x + y;
        }

        public double sum(double x, double y) {
            return x + y;
        }

        public long sum(long x, long y) {
            return x + y;
        }
    }

    public static class Sub {

        public int sub(int x, int y) {
            return x - y;
        }

        public double sub(double x, double y) {
            return x - y;
        }

        public long sub(long x, long y) {
            return x - y;
        }
    }

    public static class Mult {

        public int mult(int x, int y) {
            return x * y;
        }

        public double mult(double x, double y) {
            return x * y;
        }

        public long mult(long x, long y) {
            return x * y;
        }
    }

    public static class Div {

        public double div(int x, int y) {
            double c = (x * 1.0 / y);
            return c;
        }

        public double div(double x, double y) {
            return x / y;
        }

        public double div(long x, long y) {
            double c = (x * 1.0 / y);
            return c;
        }
    }


}

//    Создать класс Calculator. У него должны быть методы:
//        -	Сумма
//        -	Деление
//        -	Умножение
//        -	Вычитание
//        Все методы должны быть перегружены и работать с тремя типами данных- double, long и int.

