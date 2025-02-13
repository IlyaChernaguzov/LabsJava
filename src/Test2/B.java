package Test2;

public class B extends A{
private int age;
private String nameB;


    public B(String name, String surname, String email) {
        super(name, surname, email);
        System.out.println("Родительский конструктор переопределенный в наследнике B");
    }

    public B(String name, String surname, String email, int age, String nameB) {
        super(name, surname, email);
        this.age = age;
        this.name = nameB;
        System.out.println("Конструктор наследника B");

    }

    static {
        System.out.println("Статический блок наследника B, из него не могу обратиться ни к полям наследника ни родителя"
                + " , но могу обратиться к статическому полю родителя " + FINAL + ". Только если оно не privat");
        staticMethod();
        System.out.println("В статическом блоке, кроме методов static вызвать не могу");


    }

    {
        System.out.println("Не статическое поле наследника B");
        System.out.println("Могу обратиться к полю родителя " + super.name +
                "(public). Могу обратиться к полю родителя " + super.surname + "(protected). Не могу обратиться к super.email(private)." +
                "Но могу обратиться к полю наследника " + this.nameB+ "(private)");
        super.method();
        this.method();
        super.protectedMethod();
        super.defaultMethod();
        super.publicMethod();
        staticMethod();
        defaultMethod();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNameB() {
        return nameB;
    }

    public void setNameB(String nameB) {
        this.nameB = nameB;
    }

    @Override
    public void method(){
        System.out.println("Метод наследника B");
    }

}
