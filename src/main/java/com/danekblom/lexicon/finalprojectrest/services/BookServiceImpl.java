package com.danekblom.lexicon.finalprojectrest.services;

import com.danekblom.lexicon.finalprojectrest.model.Book;
import com.danekblom.lexicon.finalprojectrest.model.Media;
import com.danekblom.lexicon.finalprojectrest.utils.BookGenre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Component
public class BookServiceImpl {

    @Autowired
    private BookRepository bookRepository;

    // Create, Update, Delete operations on Book object in repository

    public void createNewBook(Book newBook) {
        try {
            bookRepository.save(newBook);
        }
        catch (Exception e) {
            System.out.println("Could not create the book:");
            e.printStackTrace();
        }
    }

    public void updateBook(Book book) {
        try {
            bookRepository.save(book);
        }
        catch (Exception e){
            System.out.println("Could not update \"" + book.getTitle() + "\":");
            e.printStackTrace();
        }
    }

    public void deleteBook(Book book) {
        try {
            bookRepository.delete(book);
        }
        catch (Exception e) {
            System.out.println("Could not delete \"" + book.getTitle() + "\":");
            e.printStackTrace();
        }
    }

    // Read operations on Book object(s) in repository

    public List<Media> getAllBooks() {
        return bookRepository.findAll();
    }

    public List<Media> findByAuthor(String author) {

        List<Media> authorResults = new ArrayList<>();
        //List<Media> allBooks = bookRepository.findAll();

        for (Media book : bookRepository.findAll()) {
            //if (book.get) {
            //    authorResults.add(book);
            //}
        }

        return authorResults;
    }

    public List<Book> findByBookGenre(BookGenre bookGenre) {
        List<Book> genreResults = new ArrayList<>();

        /*
        for (Book book : bookRepository) {
            if (book.getBookGenre().equals(bookGenre)) {
                genreResults.add(book);
            }
        }
        */

        return genreResults;
    }

    public List<Book> findByPublisher(String publisher) {
        List<Book> publisherResults = new ArrayList<>();

        /*
        for (Book book : bookRepository.findAll()) {
            if (book.getPublisher().equals(publisher)) {
                publisherResults.add(book);
            }
        }
        */

        return publisherResults;
    }

}
