package com.danekblom.lexicon.finalprojectrest.model;

import com.danekblom.lexicon.finalprojectrest.utils.AudioFormat;
import com.danekblom.lexicon.finalprojectrest.utils.Language;
import com.danekblom.lexicon.finalprojectrest.utils.MediaType;
import com.danekblom.lexicon.finalprojectrest.utils.MovieGenre;
import com.danekblom.lexicon.finalprojectrest.utils.VideoFormat;

import javax.persistence.Entity;

@Entity(name = "Movie")
public class Movie extends Media {

    private String originalTitle;
    private String director;
    private MovieGenre genre;
    private int length;
    private AudioFormat audioFormat;
    private VideoFormat videoFormat;

    public void Movie() {
        // Empty constructor for JPA
    }

    public Movie(int id, String title, int year, String originalTitle, String director, MovieGenre genre, int length, MediaType mediaType, Language language, AudioFormat audioFormat, VideoFormat videoFormat, String barCode) {
        super(id, title, year, mediaType, language, barCode);
        this.originalTitle = originalTitle;
        this.director = director;
        this.genre = genre;
        this.length = length;
        this.audioFormat = audioFormat;
        this.videoFormat = videoFormat;
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

    public MovieGenre getGenre() {
        return genre;
    }

    public void setGenre(MovieGenre genre) {
        this.genre = genre;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public AudioFormat getAudioFormat() {
        return audioFormat;
    }

    public void setAudioFormat(AudioFormat audioFormat) {
        this.audioFormat = audioFormat;
    }

    public VideoFormat getVideoFormat() {
        return videoFormat;
    }

    public void setVideoFormat(VideoFormat videoFormat) {
        this.videoFormat = videoFormat;
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
