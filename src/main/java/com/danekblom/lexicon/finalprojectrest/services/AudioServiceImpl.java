package com.danekblom.lexicon.finalprojectrest.services;

import com.danekblom.lexicon.finalprojectrest.model.Audio;
import com.danekblom.lexicon.finalprojectrest.model.Music;
import com.danekblom.lexicon.finalprojectrest.utils.Language;
import com.danekblom.lexicon.finalprojectrest.utils.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Component
public class AudioServiceImpl {

    @Autowired
    private AudioRepository audioRepository;

    public AudioServiceImpl() {
    }

    public Audio addAudioItem(Audio newAudio) {
        return audioRepository.save(newAudio);
    }

    public void updateAudio(Audio audioToUpdate) {
        audioRepository.save(audioToUpdate);
    }

    public void deleteAudio(Audio audioToDelete) {
        audioRepository.delete(audioToDelete);
    }

    public List<Audio> findByTitle(String title) {
        List<Audio> titleResults = new ArrayList<>();

        for (Audio audioItem : audioRepository.findAll()) {
            if (audioItem.getTitle().equals(title)) {
                titleResults.add(audioItem);
            }
        }

        return titleResults;
    }

    public List<Audio> findByYear(int year) {
        List<Audio> yearResults = new ArrayList<>();

        for (Audio audioItem : audioRepository.findAll()) {
            if (audioItem.getYear() == year) {
                yearResults.add(audioItem);
            }
        }

        return yearResults;
    }

    public List<Audio> findByMediaType(MediaType mediaType) {
        return null;
    }

    public List<Audio> findByLanguage(Language language) {
        return null;
    }

    public Audio findByBarCode(String barCode) {
        for (Audio audioItem : audioRepository.findAll())
        {
            if (audioItem.getBarCode().equals(barCode))
            {
                return audioItem;
            }
        }
        return null;
    }

    public List<Music> findByArtist(String artist){
        return null;
    }

    public List<Music> findByRecordLabel(String recordLabel) {
        return null;
    }

    public List<Audio> listAllAudioItems() {
        return audioRepository.findAll();
    }
}
