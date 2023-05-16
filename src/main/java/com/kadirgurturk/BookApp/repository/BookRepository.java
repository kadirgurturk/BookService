package com.kadirgurturk.BookApp.repository;

import com.kadirgurturk.BookApp.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {



}
