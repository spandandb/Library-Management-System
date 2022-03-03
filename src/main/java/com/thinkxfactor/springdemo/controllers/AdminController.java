package com.thinkxfactor.springdemo.controllers;

import com.thinkxfactor.springdemo.entity.Admin;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @PostMapping("/addAdmin")
    public String addAdmin(@RequestBody Admin admin) {
        return admin.toString();
    }

    @DeleteMapping("/deleteAdmin/{un}")
    public String deleteAdmin(@PathVariable String un) {
        return "Admin with Username : " + un + "has been removed";
    }

    @PutMapping("/updateAdmin/{un}")
    public String updateAdmin(@PathVariable String un) {
        return "Password Updated for " + un;

    }
}
