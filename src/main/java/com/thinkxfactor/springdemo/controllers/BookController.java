package com.thinkxfactor.springdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.thinkxfactor.springdemo.entity.Book;
import com.thinkxfactor.springdemo.repository.BookRepository;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @GetMapping("/getByBId/{bid}")
    public Book getByBId(@PathVariable Long bid) {
        return bookRepository.findById(bid).get();
    }

    @PostMapping("/addBook")
    public Book addBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @GetMapping("/getAll")
    public List<Book> getBookList() {
        return bookRepository.findAll();
    }

    @PutMapping("/updateBook")
    public Book updateBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @DeleteMapping("/deleteById/{bid}")
    public void deleteById(@PathVariable("bid") Long bid) {
        bookRepository.deleteById(bid);
    }

}