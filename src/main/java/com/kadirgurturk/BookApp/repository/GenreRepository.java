package com.kadirgurturk.BookApp.repository;

import com.kadirgurturk.BookApp.entity.Genre;
import com.kadirgurturk.BookApp.entity.dto.GenreBookList;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends CrudRepository<Genre, Integer> {


    @Query("select new com.kadirgurturk.BookApp.entity.dto.GenreBookList(b.name, b.publicDate, a.firstName, a.middleName, a.lastName)" +
            "from Author a join Book b on a = b.author join b.genre g where g.genreName = :g")
    public Iterable<GenreBookList> findGenreBookList(@Param("g") String genre);
}
