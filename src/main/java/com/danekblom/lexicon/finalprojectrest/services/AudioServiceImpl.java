package com.danekblom.lexicon.finalprojectrest.services;

import com.danekblom.lexicon.finalprojectrest.model.Audio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AudioServiceImpl {

    @Autowired
    private AudioRepository audioRepository;

    public AudioServiceImpl() {
    }

    public Audio addAudioItem(Audio newAudio) {
        return audioRepository.save(newAudio);
    }

    public void updateAudio(Audio audioItemToUpdate) {
        audioRepository.save(audioItemToUpdate);
    }

    public void deleteAudio(Audio audioItemToDelete) {
        audioRepository.delete(audioItemToDelete);
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

    public List<Audio> findByMediaType(String mediaType) {
        return null;
    }

    public List<Audio> findByLanguage(String language) {
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

    public List<Audio> findByArtist(String artist){
        return null;
    }

    public List<Audio> findByRecordLabel(String recordLabel) {
        return null;
    }

    public List<Audio> listAllAudioItems() {
        return audioRepository.findAll();
    }
}
