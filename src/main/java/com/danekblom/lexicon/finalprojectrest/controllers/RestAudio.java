package com.danekblom.lexicon.finalprojectrest.controllers;

import com.danekblom.lexicon.finalprojectrest.model.Audio;
import com.danekblom.lexicon.finalprojectrest.model.DocumentationResponse;
import com.danekblom.lexicon.finalprojectrest.services.AudioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/rest")
public class RestAudio {

    @Autowired
    AudioServiceImpl audioService;

    private Map<String, String> howToUse = new LinkedHashMap<>();

    @GetMapping()
    public DocumentationResponse instructions() {

        howToUse.put("/audio/all/", "Get full audio item listing");
        howToUse.put("/audio/{id}", "Get audio item by id");
        howToUse.put("/audio/add", "Add an audio item");
        howToUse.put("/audio/edit/{id}", "Edit an audio item by id");
        howToUse.put("/audio/delete/{id}", "Delete an audio item by id");

        return new DocumentationResponse(howToUse);
    }

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

    @RequestMapping("/audio/{id}")
    public Audio getById(@PathVariable("id") Integer id) {
        return audioService.findById(id);
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

    @RequestMapping(value = "/audio/edit/{id}", method = RequestMethod.PUT)
    public Audio editAudio(@PathVariable("id") Integer id) {

        // NOT DONE!
        return audioService.findById(id);
    }
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
