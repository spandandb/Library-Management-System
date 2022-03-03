package com.thinkxfactor.springdemo.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;

import com.thinkxfactor.springdemo.entity.Book;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/book")
public class BookController {
    @GetMapping("/getByISBN/{isbn}")
    public String fetchBook(@PathVariable String isbn) {
        return "Will return Book with rollNo = " + isbn;
    }

    @PostMapping("/addBook")
    public String addBook(@RequestBody Book Book) {
        return Book.toString();
    }

    @GetMapping("/getAll")
    public List<Book> getBookList() {
        List<Book> Books = new ArrayList<Book>();
        return Books;
    }

    @PutMapping("/update/{isbn}")
    public String updateBook(@PathVariable String isbn) {
        return "Updated at isbn :" + isbn;
    }

    @DeleteMapping("/deleteById/{isbn}")
    public String deleteById(@PathVariable("isbn") int isbn) {
        return "Succesfully Deleted : " + isbn;
    }

}