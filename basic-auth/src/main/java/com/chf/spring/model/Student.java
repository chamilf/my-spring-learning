package com.chf.spring.model;

public class Student {

    private final int id;
    private final String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Student(int id, String name) {


        this.id = id;
        this.name = name;
    }
}
