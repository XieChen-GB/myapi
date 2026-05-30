package com.example.myapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping("/user")
    public User getUser(){
        return new User("003561","谢晨", 57, "IT工程师");
    }

    @GetMapping("/users")
    public List<User> getUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable String id){
        return userRepository.findById(id).orElse(null);
    }

    @GetMapping("users/search")
    public User searchUser(@RequestParam String name){
        return userRepository.findByName(name).orElse(null);
    }

    @PostMapping("/users")
    public User creatUser(@RequestBody User user){
        return  userRepository.save(user);
    }

}