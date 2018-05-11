package com.danekblom.lexicon.finalprojectrest.services;

import com.danekblom.lexicon.finalprojectrest.model.Movie;
import com.danekblom.lexicon.finalprojectrest.utils.AudioFormat;
import com.danekblom.lexicon.finalprojectrest.utils.MovieGenre;
import com.danekblom.lexicon.finalprojectrest.utils.VideoFormat;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface MovieRepository extends MediaRepository<Movie> {
    public List<Movie> findByDirector(String director);

    public List<Movie> findByGenre(MovieGenre genre);

    public int findByLength(int length);

    public List<Movie> findByAudioFormat(AudioFormat audioFormat);

    public List<Movie> findByVideoFormat(VideoFormat videoFormat);

}
