package Test2;

public class A {
    public String name;
    protected String surname;
    private String email;

    public static final int FINAL = 18;

    static {
        System.out.println("Статический блок родителя A");
        System.out.println("Могу обратиться к статическому полю " + FINAL + ", к нестатическим не могу");
        staticMethod();

    }

    {
        System.out.println("Нестатический блок родителя A");
        staticMethod();
    }


    public A(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        System.out.println("Конструктор родителя A");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

     public void method(){
        System.out.println("Метод родителя A");
    }

    protected void protectedMethod(){
        System.out.println("protected Метод родителя A");
    }

    public void publicMethod(){
        System.out.println("public Метод родителя A");
    }

    void defaultMethod(){
        System.out.println("default Метод родителя A");
    }

    private void privateMethod(){
        System.out.println("private Метод родителя A");
    }

    protected static void staticMethod(){
        System.out.println("static Метод родителя A");
    }

    public static void publicStaticMethod(){
        System.out.println("static Метод родителя A");
    }

}
