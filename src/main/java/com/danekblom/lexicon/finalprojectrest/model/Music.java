package com.danekblom.lexicon.finalprojectrest.model;

import com.danekblom.lexicon.finalprojectrest.utils.AudioFormat;
import com.danekblom.lexicon.finalprojectrest.utils.Language;
import com.danekblom.lexicon.finalprojectrest.utils.MediaType;
import com.danekblom.lexicon.finalprojectrest.utils.MusicGenre;

import javax.persistence.Entity;

@Entity(name = "Music")
public class Music extends Media {

    private String artist;
    private int length;
    private int numberOfTracks;
    private String recordLabel;
    private MusicGenre genre;

    public Music(int id, String title, int year, String artist, String recordLabel, MusicGenre genre, int length, int numberOfTracks, MediaType mediaType, Language language, AudioFormat audioFormat, String barCode) {
        super(id, title, year, mediaType, language, barCode);
        this.artist = artist;
        this.length = length;
        this.numberOfTracks = numberOfTracks;
        this.recordLabel = recordLabel;
        this.genre = genre;
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
