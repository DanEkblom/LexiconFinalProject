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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/rest")
public class RestAudio {

    @Autowired
    AudioServiceImpl audioService;

    private Map<String, String> howToUse = new HashMap<>();
    private Map<String, String> restCategories = new HashMap<>();

    // URI mappings for info/instructions

    @GetMapping()
    public DocumentationResponse restInstructions() {
        restCategories.put("/audio", "Instructions for Audio");
        restCategories.put("/book", "Instructions for Books");
        restCategories.put("/video", "Instructions for Video");

        return new DocumentationResponse(restCategories);
    }

    @GetMapping("/audio")
    public DocumentationResponse instructions() {

        howToUse.put("/all", "Get full audio item listing");
        howToUse.put("/{id}", "Get audio item by id");
        howToUse.put("/add", "Add an audio item");
        howToUse.put("/edit/{id}", "Edit an audio item by id");
        howToUse.put("/delete/{id}", "Delete an audio item by id");

        return new DocumentationResponse(howToUse);
    }

    // CRUD methods with URI mappings

    /**
     * C in CRUD.
     * HTTP POST Method. Creates an Audio item and adds it to the data source.
     * @param audioItem Audio class item to be added
     * @return Audio class
     */
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(value = "/audio/add", method = RequestMethod.POST)
    public Audio addAudio(@Valid @RequestBody Audio audioItem) {

        return audioService.addAudioItem(audioItem);
    }

    /**
     * R in CRUD.
     * HTTP GET Method. Returns a list of all Audio items in data source.
     * @return List of Audio items
     */
    @RequestMapping(value = "/audio/all", method = RequestMethod.GET)
    public List<Audio> getAll() {

        if (audioService.listAllAudioItems().isEmpty()) {
            new RestError().displayRestErrorMessage();
        }
        else {
            return audioService.listAllAudioItems();
        }
        return null;
    }

    @RequestMapping("/audio/{id}")
    public Audio getById(@PathVariable("id") Integer id) {
        return audioService.findById(id);
    }

    /**
     * U in CRUD.
     * HTTP PUT Method. Updates an Audio item and saves it to the data source.
     * @param id ID of the Audio item to be updated
     * @param updatedAudioItem Audio item containing new info which will be merged into audioItem's info
     * @return Audio class
     */
    @RequestMapping(value = "/audio/edit/{id}", method = RequestMethod.PUT)
    public Audio editAudio(@PathVariable("id") Integer id, @Valid @RequestBody Audio updatedAudioItem) {

        Audio audioItem = audioService.findById(id);

        audioItem.setArtist(updatedAudioItem.getArtist());
        audioItem.setTitle(updatedAudioItem.getTitle());
        audioItem.setYear(updatedAudioItem.getYear());
        audioItem.setNumberOfTracks(updatedAudioItem.getNumberOfTracks());
        audioItem.setLength(updatedAudioItem.getLength());
        audioItem.setGenre(updatedAudioItem.getGenre());
        audioItem.setRecordLabel(updatedAudioItem.getRecordLabel());
        audioItem.setLanguage(updatedAudioItem.getLanguage());
        audioItem.setMediaType(updatedAudioItem.getMediaType());
        audioItem.setAudioFormat(updatedAudioItem.getAudioFormat());
        audioItem.setBarCode(updatedAudioItem.getBarCode());

        return audioService.updateAudioItem(audioItem);
    }

    /**
     * D in CRUD.
     * HTTP DELETE Method. Deletes an Audio item from the data source.
     * @param id ID of the Audio item to be deleted
     */
    @RequestMapping(value = "audio/delete/{id}", method = RequestMethod.DELETE)
    public void deleteAudio(@PathVariable("id") Integer id) {

        audioService.deleteById(id);
        /*
        Audio audioItem = audioService.findById(id);
        audioService.deleteAudioItem(audioItem);
        */
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
