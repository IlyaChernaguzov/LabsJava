package lesson3.oop.polymorphism;

public class Calculator {

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
            return (x * 1.0 / y);
        }

        public double div(double x, double y) {
            return x / y;
        }

        public double div(long x, long y) {
            return (x * 1.0 / y);
        }
    }
}
