package com.learning.javalearning.controller;

import com.learning.javalearning.entity.User;
import com.learning.javalearning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public User addUser(@RequestBody User user) {
        return userService.save(user);
    }

    @GetMapping("/list")
    public List<User> getAllUsers(){
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id){
        return userService.findById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id){
        userService.deleteById(id);
        return "删除成功";
    }

    @PutMapping
    public User updateUser(@RequestBody User user){
        return userService.update(user);
    }
}