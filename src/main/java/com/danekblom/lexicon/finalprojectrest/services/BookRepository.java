package com.danekblom.lexicon.finalprojectrest.services;

import com.danekblom.lexicon.finalprojectrest.model.Book;
import com.danekblom.lexicon.finalprojectrest.utils.BookGenre;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface BookRepository extends MediaRepository<Book> {
    public List<Book> findByAuthor(String author);

    public List<Book> findByBookGenre(BookGenre bookGenre);

    public List<Book> findByPublisher(String publisher);
}
