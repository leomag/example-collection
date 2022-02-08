package ru.isaev;

public class EmoList {
    private final String name;
    private final int age;
    private final String university = "ITMO University";

    public EmoList(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ru.isaev.EmoList{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", university='" + university + '\'' +
                '}';
    }
}
