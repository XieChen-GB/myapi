package com.example.myapi;
public class User {
    private String name;
    private int age;
    private String job;

    public User(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getJob() { return job; }
}