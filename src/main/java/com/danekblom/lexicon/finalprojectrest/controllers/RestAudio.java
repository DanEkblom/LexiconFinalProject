package com.danekblom.lexicon.finalprojectrest.controllers;

import com.danekblom.lexicon.finalprojectrest.model.Audio;
import com.danekblom.lexicon.finalprojectrest.services.AudioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/rest")
public class RestAudio {

    @Autowired
    AudioServiceImpl audioService;

    /**
     * R in CRUD.
     * HTTP GET Method. Returns a list of all Audio items in data source
     * @return List of Audio items
     */
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/audio/all", method = RequestMethod.GET)
    public List<Audio> getAll() {
        if (audioService.listAllAudioItems().isEmpty()) {
            System.out.println("Please add a couple of albums."); // For console logging during development
            return null;
        }
        else {
            return audioService.listAllAudioItems();
        }
    }

    /**
     * C in CRUD. Creates an Audio item and adds it to the data source
     * @param audioItem Audio class item to be added
     * @return Audio class
     */
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(value = "/audio/add", method = RequestMethod.POST)
    public Audio addAudio(@Valid @RequestBody Audio audioItem) {

        return audioService.addAudioItem(audioItem);
    }

    //TODO: Write the PUT (Update) and DELETE methods.

    /*
    @RequestMapping("/addAudio/{var1}/{var2}/{var3}/{var4}/{var5}/{var6}/{var7}/{var8}/{var9}/{var10}/{var11}/{var12}")
    public Audio addAudio(@PathVariable("var1") Integer id,
                          @PathVariable("var2") String title,
                          @PathVariable("var3") Integer year,
                          @PathVariable("var4") String artist,
                          @PathVariable("var5") String recordLabel,
                          @PathVariable("var6") String genre,
                          @PathVariable("var7") Integer length,
                          @PathVariable("var8") Integer numberOfTracks,
                          @PathVariable("var9") String mediaType,
                          @PathVariable("var10") String language,
                          @PathVariable("var11") String audioFormat,
                          @PathVariable("var12") String barCode) {

        return audioService.addAudioItem(new Audio(id, title, year, artist, recordLabel, genre, length, numberOfTracks, mediaType, language, audioFormat, barCode));

        return new Audio(id, title, year, artist, recordLabel, genre, length, numberOfTracks, mediaType, language, audioFormat, barCode));
    }
    */

}
