package com.thinkxfactor.springdemo.controllers;

import com.thinkxfactor.springdemo.entity.Student;
import com.thinkxfactor.springdemo.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/getById/{id}")
    public Student getById(@PathVariable("id") Long id) {
        return studentRepository.findById(id).get();
    }

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student) {
        studentRepository.save(student);
        return student;
    }

    @PostMapping("/updateStudent/{id}")
    public Student updateStudent(@RequestBody Student student) {
        studentRepository.save(student);
        return student;
    }

    @GetMapping("/getAll")
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @GetMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        studentRepository.deleteById(id);
    }
}
