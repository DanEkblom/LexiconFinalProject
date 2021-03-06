package com.danekblom.lexicon.finalprojectrest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
@Table(name = "tbl_book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Integer id;

    private String author;

    @NotNull
    private String title;
    private Integer year;


    @Column(name = "pages")
    private Integer numberOfPages;

    private String genre;
    private String language;
    private String publisher;

    @Column(name = "mediatype")
    private String mediaType;

    private String isbn;

    public Book () {
        // Empty constructor for JPA.
    }

    public Book(Integer id, String author, String title, Integer year, Integer numberOfPages, String genre, String language, String publisher, String mediaType, String isbn) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.year = year;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
        this.language = language;
        this.publisher = publisher;
        this.mediaType = mediaType;
        this.isbn = isbn;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id) &&
                Objects.equals(author, book.author) &&
                Objects.equals(title, book.title) &&
                Objects.equals(year, book.year) &&
                Objects.equals(numberOfPages, book.numberOfPages) &&
                Objects.equals(genre, book.genre) &&
                Objects.equals(language, book.language) &&
                Objects.equals(publisher, book.publisher) &&
                Objects.equals(mediaType, book.mediaType) &&
                Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, author, title, year, numberOfPages, genre, language, publisher, mediaType, isbn);
    }
}
