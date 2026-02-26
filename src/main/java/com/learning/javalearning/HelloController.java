package com.learning.javalearning.controller;

import com.learning.javalearning.entity.User;
import com.learning.javalearning.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class HelloController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/add")
    public User addUser(@RequestBody User user){
        return userRepository.save(user);
    }
}