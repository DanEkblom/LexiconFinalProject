package com.danekblom.lexicon.finalprojectrest.data;

import com.danekblom.lexicon.finalprojectrest.model.Video;
import com.danekblom.lexicon.finalprojectrest.utils.AudioFormat;
import com.danekblom.lexicon.finalprojectrest.utils.MovieGenre;
import com.danekblom.lexicon.finalprojectrest.utils.VideoFormat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VideoRepository extends JpaRepository<Video, Integer> {

    // TODO: Implement these!
    /*
    List<Video> findByDirector(String director);

    List<Video> findByGenre(MovieGenre genre);

    Integer findByLength(int length);

    List<Video> findByAudioFormat(AudioFormat audioFormat);

    List<Video> findByVideoFormat(VideoFormat videoFormat);
    */
}
