package com.kadirgurturk.BookApp.controller;

import com.kadirgurturk.BookApp.entity.Author;
import com.kadirgurturk.BookApp.entity.Book;
import com.kadirgurturk.BookApp.repository.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/bookapp/authors")
public class AuthorController {

    private AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @GetMapping("/{id}")
    public Optional<Author> findById(@PathVariable("id") int id) {
        return authorRepository.findById(id);
    }


}
