package com.thinkxfactor.springdemo.controllers;

import java.util.ArrayList;

import com.thinkxfactor.springdemo.entity.Student;

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

    @GetMapping("/getByRoll/{rollNo}")
    public String fetchStudent(@PathVariable("rollNo") int rollNo) {
        return "Will return student with rollNo = " + rollNo;
    }

    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student) {
        return student.toString();
    }

    @GetMapping("/getByList")
    public List<Student> getStudentList() {
        List<Student> students = new ArrayList<Student>();
        return students;
    }

    @GetMapping("/deleteById/{id}")
    public String deleteById(@PathVariable("id") int id) {
        return "Succesfully Deleted : " + id;
    }
}
