package com.thinkxfactor.springdemo.controllers;

import java.util.List;

import com.thinkxfactor.springdemo.entity.Admin;
import com.thinkxfactor.springdemo.repository.AdminRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    AdminRepository adminRepository;

    @PostMapping("/addAdmin")
    public Admin addAdmin(@RequestBody Admin admin) {
        return adminRepository.save(admin);
    }

    @DeleteMapping("/deleteAdmin/{un}")
    public void deleteAdmin(@PathVariable long un) {
        adminRepository.deleteById(un);
    }

    @PutMapping("/updateAdmin")
    public Admin updateAdmin(@RequestBody Admin admin) {
        return adminRepository.save(admin);

    }

    @GetMapping("/getAllAdmin")
    public List<Admin> getAllAdmin() {
        return adminRepository.findAll();
    }

    @GetMapping("getAdmin/{uid}")
    public Admin getAdmin(@PathVariable long uid) {
        return adminRepository.findById(uid).get();
    }
}
