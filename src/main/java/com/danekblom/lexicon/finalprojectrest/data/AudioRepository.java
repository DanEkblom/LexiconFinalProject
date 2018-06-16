package com.danekblom.lexicon.finalprojectrest.data;

import com.danekblom.lexicon.finalprojectrest.model.Audio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AudioRepository extends JpaRepository<Audio, Integer> {

    List<Audio> findByArtistIgnoreCaseContaining(String artist);

    List<Audio> findByTitleIgnoreCaseContaining(String title);

    List<Audio> findByYear(Integer year);

    List<Audio> findByMediaType(String mediaType);

    List<Audio> findByGenre(String genre);

    List<Audio> findByRecordLabel(String recordLabel);

    List<Audio> findByLanguage(String language);

    Audio findByBarCode(String barCode);


}
