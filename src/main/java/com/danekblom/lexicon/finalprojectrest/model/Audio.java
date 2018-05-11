package com.danekblom.lexicon.finalprojectrest.model;

import com.danekblom.lexicon.finalprojectrest.utils.AudioFormat;
import com.danekblom.lexicon.finalprojectrest.utils.Language;
import com.danekblom.lexicon.finalprojectrest.utils.MediaType;
import com.danekblom.lexicon.finalprojectrest.utils.MusicGenre;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity(name = "Audio")
public class Audio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    private String title;
    private int year;
    private MediaType mediaType;
    private Language language;
    private String barCode;

    private String artist;
    private int length;
    private int numberOfTracks;
    private String recordLabel;
    private MusicGenre genre;
    private AudioFormat audioFormat;

    public Audio() {
        // Empty constructor for JPA.
    }

    public Audio(int id, String title, int year, String artist, String recordLabel, MusicGenre genre, int length, int numberOfTracks, MediaType mediaType, Language language, AudioFormat audioFormat, String barCode) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.mediaType = mediaType;
        this.language = language;
        this.barCode = barCode;
        this.artist = artist;
        this.length = length;
        this.numberOfTracks = numberOfTracks;
        this.recordLabel = recordLabel;
        this.genre = genre;
        this.audioFormat = audioFormat;

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

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getNumberOfTracks() {
        return numberOfTracks;
    }

    public void setNumberOfTracks(int numberOfTracks) {
        this.numberOfTracks = numberOfTracks;
    }

    public String getRecordLabel() {
        return recordLabel;
    }

    public void setRecordLabel(String recordLabel) {
        this.recordLabel = recordLabel;
    }

}

