package com.kadirgurturk.BookApp.controller;

import com.kadirgurturk.BookApp.entity.Genre;
import com.kadirgurturk.BookApp.entity.dto.GenreBookList;
import com.kadirgurturk.BookApp.repository.GenreRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/books/genre")
public class GenreController {

    private GenreRepository genreRepository;

    public GenreController(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    @GetMapping("genre/")
    public Iterable<GenreBookList> findGenreBookList(@RequestParam("genre") String genre)
    {
        return genreRepository.findGenreBookList(genre);
    }


}
