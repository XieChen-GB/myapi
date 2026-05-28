package com.example.myapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping("/user")
    public User getUser(){
        return new User("谢晨", 57, "IT工程师");
    }

    @GetMapping("/users")
    public List<User> getUsers(){
        List<User> users = new ArrayList<>();
        users.add(new User("谢晨",57,"工程师"));
        users.add(new User("田中", 30, "Java开发者"));
        users.add(new User("山田", 25, "前端工程师"));

        return users;
    }

}