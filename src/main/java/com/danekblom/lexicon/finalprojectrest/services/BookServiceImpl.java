package com.danekblom.lexicon.finalprojectrest.services;

import com.danekblom.lexicon.finalprojectrest.model.Book;
import com.danekblom.lexicon.finalprojectrest.utils.BookGenre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl {

    @Autowired
    private BookRepository bookRepository;

    // Create, Update, Delete operations on Book object in repository

    public void createNewBook(Book newBook) {
        try {
            bookRepository.save(newBook);
        }
        catch (Exception e) {
            System.out.println("Could not create the book\"" + newBook.getTitle() + "\": ");
            e.printStackTrace();
        }
    }

    public void updateBook(Book book) {
        try {
            bookRepository.save(book);
        }
        catch (Exception e){
            System.out.println("Could not update \"" + book.getTitle() + "\": ");
            e.printStackTrace();
        }
    }

    public void deleteBook(Book book) {
        try {
            bookRepository.delete(book);
        }
        catch (Exception e) {
            System.out.println("Could not delete \"" + book.getTitle() + "\": ");
            e.printStackTrace();
        }
    }

    // Read operations on Book object(s) in repository

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public List<Book> findByAuthor(String author) {

        List<Book> authorResults = new ArrayList<>();
        List<Book> allBooks = bookRepository.findAll();

        for (Book book : bookRepository.findAll()) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                authorResults.add(book);
            }
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
