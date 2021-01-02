package com.company;

interface Man {
    int hands = 2;
}

interface Human {
    int feet = 0;

    public int walk();
}

public class Person implements Human, Man {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int walk() {
        return 0;
    }
}