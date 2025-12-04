package com.vilin.dp.creation.singleton;

public class EnumPerson {


    public static void main(String[] args) {
        Person p1 = Person.INSTANCE;
        Person p2 = Person.INSTANCE;

        System.out.println(p1 == p2);
    }
}

enum Person {
    INSTANCE;

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
