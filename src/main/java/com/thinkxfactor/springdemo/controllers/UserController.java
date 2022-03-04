package com.thinkxfactor.springdemo.controllers;

import java.util.List;

import com.thinkxfactor.springdemo.entity.User;
import com.thinkxfactor.springdemo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    // int count = 0;

    // @GetMapping("/")
    // public String error() {
    // return "ERROR from User Controller";
    // }

    // @GetMapping("/counter")
    // public String count() {
    // count = count + 1;
    // return "The counter value is : " + count;
    // }

    // @GetMapping("/hello")
    // public String sayHello() {
    // return "This is a new server running!!";

    // }

    // @GetMapping("/hello2")
    // public Map<String, String> sayHello2() {
    // Map<String, String> respMap = new HashMap<>();
    // respMap.put("name", "raj");
    // respMap.put("age", "25");
    // respMap.put("dept", "CSE");
    // return respMap;

    // }

    @Autowired
    UserRepository userRepository;

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @DeleteMapping("/deleteUser/{uid}")
    public void deleteUser(@PathVariable Long uid) {
        userRepository.deleteById(uid);
    }

    @PutMapping("/updateUser")
    public User updateUser(@RequestBody User User) {
        return userRepository.save(User);

    }

    @GetMapping("/getAllUser")
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @GetMapping("getUser/{uid}")
    public User getUser(@PathVariable Long uid) {
        return userRepository.findById(uid).get();
    }
}
