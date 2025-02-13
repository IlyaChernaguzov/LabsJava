package lesson2.nested;

public class ClassWithNestedClassDemo {

    private class InnerClass {

        private int number;

        public InnerClass(int number) {
            this.number = number;
        }

        public void print() {
            System.out.println("InnerClass" + number);
        }
    }

    void displayInner() {
        InnerClass innerClass = new InnerClass(1);
        innerClass.print();

        InnerClass innerClass2 = new InnerClass(2);
        innerClass2.print();
    }

    public static void main(String[] args) {
        ClassWithNestedClassDemo classDemo = new ClassWithNestedClassDemo();
        classDemo.displayInner();
    }
}
