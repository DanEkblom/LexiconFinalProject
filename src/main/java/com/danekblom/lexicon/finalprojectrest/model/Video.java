package com.danekblom.lexicon.finalprojectrest.model;

import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Component("Video")
@Entity
@Table(name = "tblVideo")
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Integer id;

    @NotNull
    private String title;
    private Integer year;

    @Column(name = "originaltitle")
    private String originalTitle;

    private String director;
    private String genre;
    private Integer length;

    @Column(name = "mediatype")
    private String mediaType;
    private String language;

    @Column(name = "audioformat")
    private String audioFormat;

    @Column(name = "videoformat")
    private String videoFormat;

    @Column(name = "barcode")
    private String barCode;

    public void Video() {
        // Empty constructor for JPA
    }

    public Video(Integer id, String title, Integer year, String originalTitle, String director, String genre, Integer length, String mediaType, String language, String audioFormat, String videoFormat, String barCode) {
        //super(id, title, year, mediaType, language, barCode);
        this.id = id;
        this.title = title;
        this.year = year;
        this.originalTitle = originalTitle;
        this.director = director;
        this.genre = genre;
        this.length = length;
        this.mediaType = mediaType;
        this.language = language;
        this.audioFormat = audioFormat;
        this.videoFormat = videoFormat;
        this.barCode = barCode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getAudioFormat() {
        return audioFormat;
    }

    public void setAudioFormat(String audioFormat) {
        this.audioFormat = audioFormat;
    }

    public String getVideoFormat() {
        return videoFormat;
    }

    public void setVideoFormat(String videoFormat) {
        this.videoFormat = videoFormat;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }
}
