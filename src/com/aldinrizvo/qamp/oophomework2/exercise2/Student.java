package com.aldinrizvo.qamp.oophomework2.exercise2;

public class Student {
    private final String name;
    private final int age;

    public Student(String name) {
        this(name, 15);
    }

    public Student(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.age;
    }
}
