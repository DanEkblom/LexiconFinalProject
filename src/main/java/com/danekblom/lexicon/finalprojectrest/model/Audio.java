package com.danekblom.lexicon.finalprojectrest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tblAudio")
public class Audio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String artist;

    @NotNull
    private String title;

    private Integer year;

    @Column(name = "tracks")
    private Integer numberOfTracks;

    private Integer length;
    private String genre;
    private String recordLabel;
    private String language;
    private String mediaType;
    private String audioFormat;
    private String barCode;

    public Audio() {
        // Empty constructor for JPA.
    }

    public Audio(int id, String title, Integer year, String artist, String recordLabel, String genre, Integer length, Integer numberOfTracks, String mediaType, String language, String audioFormat, String barCode) {
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

    public Integer getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Integer getNumberOfTracks() {
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAudioFormat() {
        return audioFormat;
    }

    public void setAudioFormat(String audioFormat) {
        this.audioFormat = audioFormat;
    }
}

