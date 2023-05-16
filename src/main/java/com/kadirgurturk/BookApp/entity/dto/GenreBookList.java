package com.kadirgurturk.BookApp.entity.dto;

import java.time.LocalDate;

public class GenreBookList {

    public String bookName;

    public LocalDate publicDate;

    public String firstName;

    public String middleName;

    public String lastName;

    public GenreBookList(String bookName, LocalDate publicDate, String firstName, String middleName, String lastName) {
        this.bookName = bookName;
        this.publicDate = publicDate;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }
}
