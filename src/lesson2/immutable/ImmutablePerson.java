package lesson2.immutable;

import java.util.ArrayList;
import java.util.List;

public final class ImmutablePerson {
    private final String name;
    private Integer age;
    private List<String> preferFilms = new ArrayList<>();

    public ImmutablePerson(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public ImmutablePerson(String name, Integer age, List<String> preferFilms) {
        this.name = name;
        this.age = age;
        this.preferFilms = List.copyOf(preferFilms);
//        this.preferFilms = preferFilms;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public List<String> getPreferFilms() {
        return List.copyOf(preferFilms);
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void addFilm(String film) {
        preferFilms.add(film);
    }

    @Override
    public String toString() {
        return "ImmutablePerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", preferFilms=" + preferFilms +
                '}';
    }
}
