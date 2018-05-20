package com.danekblom.lexicon.finalprojectrest.model;

import com.danekblom.lexicon.finalprojectrest.utils.Language;
import com.danekblom.lexicon.finalprojectrest.utils.MediaType;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

/* Inheritance in Spring
 * http://blog.netgloo.com/2014/12/18/handling-entities-inheritance-with-spring-data-jpa/
 */
//@Entity
@MappedSuperclass
public abstract class Media {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Integer id;

    @NotNull
    private String title;
    private Integer year;
    private MediaType mediaType;
    private Language language;
    private String barCode;

    public Media() {}

    public Media(int id, String title, int year, MediaType mediaType, Language language, String barCode) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.mediaType = mediaType;
        this.language = language;
        this.barCode = barCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public MediaType getMediaType() {
        return mediaType;
    }

    public void setMediaType(MediaType mediaType) {
        this.mediaType = mediaType;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }
}
