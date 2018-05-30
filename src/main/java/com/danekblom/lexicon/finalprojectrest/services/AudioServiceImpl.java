package com.danekblom.lexicon.finalprojectrest.services;

import com.danekblom.lexicon.finalprojectrest.data.AudioRepository;
import com.danekblom.lexicon.finalprojectrest.exceptions.ResourceNotFoundException;
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


    // _C_RUD
    public Audio addAudioItem(Audio newAudio) {

        return audioRepository.save(newAudio);
    }

    // C_R_UD
    public List<Audio> listAllAudioItems() {

        return audioRepository.findAll();
    }

    public Audio findById(Integer id) {

        // Apress "Beg. Spring Boot 2 Appl." version
        return audioRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No post found with id: " + id));
        // Andreas version:
        //    return audioRepository.findById(id).get();

        // My first version:
        /*for (Audio foundAudioItem : audioRepository.findAll())
        {
            if (foundAudioItem.getId() == id) {
                return foundAudioItem;
            }
            else {
                errorResponse();
            }
        }*/

        /*
        if (!audioRepository.existsById(id)) {
            new DocumentationResponse("Item Not Found.");
        }
        */

        //return null;
    }

    public Audio updateAudioItem(Audio audioItemToUpdate) {

        audioRepository.findById(audioItemToUpdate.getId()).orElseThrow(() -> new ResourceNotFoundException("No post found with id: " + audioItemToUpdate.getId()));

        return audioRepository.save(audioItemToUpdate);
    }

    /*
    public void deleteAudioItem(Audio audioItemToDelete) {

        if (audioRepository.findAll().contains(audioItemToDelete)) {
            audioRepository.delete(audioItemToDelete);
        }

        //return audioRepository.deleteById(audioItemToDelete);
    }
    */

    public void deleteById(Integer id) {

        audioRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No post found with id: " + id));
        audioRepository.deleteById(id);
    }

    public List<Audio> findByArtist(String artist){

        return audioRepository.findByArtistIgnoreCaseContaining(artist);
    }

    public List<Audio> findByTitleIgnoreCaseContaining(String title) {

        return audioRepository.findByTitleIgnoreCaseContaining(title);
        /*
        List<Audio> titleResults = new ArrayList<>();

        for (Audio audioItem : audioRepository.findAll()) {
            if (audioItem.getTitle().equals(title)) {
                titleResults.add(audioItem);
            }
        }

        return titleResults;
        */
    }

    public List<Audio> findByYear(Integer year) {

        return audioRepository.findByYear(year);

        /*
        List<Audio> yearResults = new ArrayList<>();

        for (Audio audioItem : audioRepository.findAll()) {
            if (audioItem.getYear() == year) {
                yearResults.add(audioItem);
            }
        }

        return yearResults;
        */
    }

    public List<Audio> findByMediaType(String mediaType) {
        return audioRepository.findByMediaType(mediaType);
    }

    public List<Audio> findByGenre(String genre) {
        return audioRepository.findByGenre(genre);
    }

    public List<Audio> findByLanguage(String language) {
        return audioRepository.findByLanguage(language);
    }

    public Audio findByBarCode(String barCode) {

        return audioRepository.findByBarCode(barCode);
        /*
        for (Audio audioItem : audioRepository.findAll())
        {
            if (audioItem.getBarCode().equals(barCode))
            {
                return audioItem;
            }
        }
        return null;
        */
    }

    public List<Audio> findByRecordLabel(String recordLabel) {
        return audioRepository.findByRecordLabel(recordLabel);
    }
}
