package lesson2.immutable;

import java.util.ArrayList;
import java.util.List;

public class ImmutableDemo {
    public static void main(String[] args) {
        List<String> films = new ArrayList<>();
        films.add("Avatar");

        ImmutablePerson person = new ImmutablePerson("Ivan", 30, films);
        System.out.println(person);

        films.add("Zodiac");
        System.out.println(person);
//
//        List<String> preferFilms = person.getPreferFilms();
//
//        System.out.println(preferFilms);
//        preferFilms.add("Seven");


    }


}
