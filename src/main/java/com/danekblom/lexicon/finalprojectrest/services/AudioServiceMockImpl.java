package com.danekblom.lexicon.finalprojectrest.services;

import com.danekblom.lexicon.finalprojectrest.model.Audio;
import com.danekblom.lexicon.finalprojectrest.model.Music;
import com.danekblom.lexicon.finalprojectrest.utils.AudioFormat;
import com.danekblom.lexicon.finalprojectrest.utils.Language;
import com.danekblom.lexicon.finalprojectrest.utils.MediaType;
import com.danekblom.lexicon.finalprojectrest.utils.MusicGenre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class AudioServiceMockImpl {

    @Autowired
    private AudioRepository audioRepository;

    public AudioServiceMockImpl() {
        Audio audioItem = new Audio(1, "The Division Bell", 1999, "Pink Floyd", "EMI", MusicGenre.ROCK, 90, 12, MediaType.CD, Language.ENGLISH, AudioFormat.STEREO, "1-234-5678-9");
        audioRepository.save(audioItem);
    }

    public void addAudio(Audio newAudio) {
        audioRepository.save(newAudio);
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
            if (audioItem.getBarCode() == barCode)
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

    public List<Audio> findAll() {
        return audioRepository.findAll();
    }
}

