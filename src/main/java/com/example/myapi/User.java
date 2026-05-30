package com.example.myapi;
import jakarta.persistence.*;

@Entity
@Table(name = "users")

public class User {

    @Id
    private String userId;

    private String name;
    private int age;
    private String job;

    public User(){}

    public User(String userId, String name, int age, String job) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getUserId() { return userId; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getJob() { return job; }
}