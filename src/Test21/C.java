package Test21;

import Test2.B;

public class C extends B {
    private String nameC;
    public C(String name, String surname, String email) {
        super(name, surname, email);
        System.out.println("Конструктор родителя A переопределенный в наследнике C");
    }

    public C(String name, String surname, String email, int age, String nameB) {
        super(name, surname, email, age, nameB);
        System.out.println("Конструктор родителя B переопределенный в наследнике C");
    }

    public C(String name, String surname, String email, String nameC) {
        super(name, surname, email);
        this.nameC = nameC;
        System.out.println("Конструктор наследника C, нет полей из предка В");
    }

    static {
        System.out.println("Статический блок наследника C из другого пакета. Статическое поля родителя из другого пакета видны только protected и public " + FINAL + ". Модификатор по умолчанию не видит его");
        staticMethod();
    }

    {
        System.out.println("Не статический блок С. Поля родителя public " + super.name + ", поля родителя protected " + super.surname);
        super.method();
        this.method();
        super.protectedMethod();
        super.publicMethod();
        staticMethod();
    }

    @Override
     public void method (){
        System.out.println("Метод наследника C");
    }
}
