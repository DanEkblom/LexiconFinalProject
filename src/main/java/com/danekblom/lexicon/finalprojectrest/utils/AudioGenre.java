package com.danekblom.lexicon.finalprojectrest.utils;

public enum AudioGenre {
    AUDIOBOOK("Audio Book"),
    CLASSICAL("Classical"),
    INDUSTRIAL("Industrial Metal"),
    INSTRUMENTAL("Instrumental"),
    METAL("Metal"),
    POP("Pop"),
    ROCK("Rock");

    private final String genreName;

    AudioGenre(String genreName) {
        this.genreName = genreName;
    }

    public String getGenreName() {
        return genreName;
    }

}
