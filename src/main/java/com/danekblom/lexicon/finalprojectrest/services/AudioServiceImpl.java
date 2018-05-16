package com.danekblom.lexicon.finalprojectrest.services;

import com.danekblom.lexicon.finalprojectrest.data.AudioRepository;
import com.danekblom.lexicon.finalprojectrest.model.Audio;
import com.danekblom.lexicon.finalprojectrest.model.DocumentationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AudioServiceImpl {

    @Autowired
    private AudioRepository audioRepository;

    private Map<String, String> error = new HashMap<>();

    public AudioServiceImpl() {
    }

    public Audio addAudioItem(Audio newAudio) {
        return audioRepository.save(newAudio);
    }

    public Audio updateAudioItem(Audio audioItemToUpdate) {
        return audioRepository.save(audioItemToUpdate);
    }

    public void deleteAudioItem(Audio audioItemToDelete) {
        if (audioRepository.findAll().contains(audioItemToDelete)) {
            audioRepository.delete(audioItemToDelete);
        }
        else {
            new DocumentationResponse("Item Not Found.");
        }
    }

    public List<Audio> listAllAudioItems() {

        return audioRepository.findAll();
    }

    public Audio findById(Integer id) {

        for (Audio foundAudioItem : audioRepository.findAll())
        {
            if (foundAudioItem.getId() == id) {
                return foundAudioItem;
            }
        }

        if (!audioRepository.existsById(id)) {
            new DocumentationResponse("Item Not Found.");
        }

        //return audioRepository.findById(id).orElseThrow(() -> new DocumentationResponse("Item Not Found"));

        return null;
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
}
