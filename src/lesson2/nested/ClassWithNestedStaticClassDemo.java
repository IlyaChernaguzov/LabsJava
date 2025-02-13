package lesson2.nested;

public class ClassWithNestedStaticClassDemo {
    private String name;

    public ClassWithNestedStaticClassDemo(String name) {
        this.name = name;
    }

    static class NestedClass {
        private String field;

        public NestedClass(String field) {
            this.field = field;
        }

        public void doSomething() {
            System.out.println("NestedClass");
        }
    }

    public static void main(String[] args) {
        ClassWithNestedStaticClassDemo.NestedClass nestedClass = new ClassWithNestedStaticClassDemo.NestedClass("new");
        nestedClass.doSomething();

        ClassWithNestedStaticClassDemo classDemo = new ClassWithNestedStaticClassDemo("class");
    }
}
