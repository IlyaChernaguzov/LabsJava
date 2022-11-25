package Laba3; //laba3-1

public class Study {
    private String course;
    public Study(String course) {
        this.course = course;
    }

    //TODO

    public String printCourse() {
        return this.course;
    }
}

class JavaProgram {
    public static void main(String[] args) {
        Study study = new Study ("Изучение Java - это просто!");
        System.out.println(study.printCourse());
        //TODO
    }
}

