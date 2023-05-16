package com.kadirgurturk.BookApp.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDate;

//create table if not exists book (
     //   book_id bigserial primary key,
    //    book_name varchar(256) not null,
     //   genre_id int not null,
   //     author_id int not null,
    //    public_date date not null,

  //      );


@Entity
@Table(name = "Book")
public class Book {

    @Id
    @Column(name = "book_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int bookId;

    @Column(name = "book_name", nullable = false)
    public String name;

    @Column(name = "public_date")
    public LocalDate publicDate;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id",nullable = false)
    public Author author;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "genre_id",nullable = false)
    public Genre genre;

    public Book() {
    }

    public Book(int bookId, String name, LocalDate publicDate, Author author, Genre genre) {
        this.bookId = bookId;
        this.name = name;
        this.publicDate = publicDate;
        this.author = author;
        this.genre = genre;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getPublicDate() {
        return publicDate;
    }

    public void setPublicDate(LocalDate publicDate) {
        this.publicDate = publicDate;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
