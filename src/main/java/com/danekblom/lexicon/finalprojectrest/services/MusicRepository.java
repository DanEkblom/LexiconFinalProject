package com.danekblom.lexicon.finalprojectrest.services;

import com.danekblom.lexicon.finalprojectrest.model.Music;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface MusicRepository extends MediaRepository<Music> {
    public List<Music> findByArtist(String artist);

    public List<Music> findByRecordLabel(String recordLabel);
}
