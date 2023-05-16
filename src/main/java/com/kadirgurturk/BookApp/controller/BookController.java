package com.kadirgurturk.BookApp.controller;

import com.kadirgurturk.BookApp.entity.Book;
import com.kadirgurturk.BookApp.repository.BookRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("api/bookapp/books")
public class BookController {

    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("find/id")
    public Optional<Book> findById(@RequestParam("id") int id)
    {
        return bookRepository.findById(id);
    }
}
