package com.kadirgurturk.BookApp.entity;


import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "Genre")
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "genre_id")
    public int genreId;

    @Column(name = "genre_name")
    public String genreName;

    @OneToMany(mappedBy="genre", fetch = FetchType.LAZY)
    public Set<Book> books;

    public Genre(int genreId, String genreName) {
        this.genreId = genreId;
        this.genreName = genreName;
    }

    public Genre() {
    }
}
