package com.danekblom.lexicon.finalprojectrest.model;

import com.danekblom.lexicon.finalprojectrest.utils.BookGenre;
import com.danekblom.lexicon.finalprojectrest.utils.Language;
import com.danekblom.lexicon.finalprojectrest.utils.MediaType;

import javax.persistence.Entity;

@Entity(name = "Book")
public class Book extends Media {

    private String author;
    private BookGenre bookGenre;
    private int numberOfPages;
    private String publisher;

    public Book () {
        // Empty constructor for JPA.
    }

    public Book(int id, String title, int year, MediaType mediaType, Language language, String barCode, String author, BookGenre bookGenre, int numberOfPages, String publisher) {
        super(id, title, year, mediaType, language, barCode);
        this.author = author;
        this.bookGenre = bookGenre;
        this.numberOfPages = numberOfPages;
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BookGenre getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(BookGenre bookGenre) {
        this.bookGenre = bookGenre;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title);
    }

    @Override
    public int getYear() {
        return super.getYear();
    }

    @Override
    public void setYear(int year) {
        super.setYear(year);
    }

    @Override
    public MediaType getMediaType() {
        return super.getMediaType();
    }

    @Override
    public void setMediaType(MediaType mediaType) {
        super.setMediaType(mediaType);
    }

    @Override
    public Language getLanguage() {
        return super.getLanguage();
    }

    @Override
    public void setLanguage(Language language) {
        super.setLanguage(language);
    }

    @Override
    public String getBarCode() {
        return super.getBarCode();
    }

    @Override
    public void setBarCode(String barCode) {
        super.setBarCode(barCode);
    }
}
