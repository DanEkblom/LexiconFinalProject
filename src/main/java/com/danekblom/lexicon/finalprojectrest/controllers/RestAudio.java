package com.danekblom.lexicon.finalprojectrest.controllers;

import com.danekblom.lexicon.finalprojectrest.model.Audio;
import com.danekblom.lexicon.finalprojectrest.services.AudioServiceImpl;
import com.danekblom.lexicon.finalprojectrest.utils.AudioFormat;
import com.danekblom.lexicon.finalprojectrest.utils.Language;
import com.danekblom.lexicon.finalprojectrest.utils.MediaType;
import com.danekblom.lexicon.finalprojectrest.utils.MusicGenre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class RestAudio {

    @Autowired
    AudioServiceImpl audio;

    @RequestMapping("/allAudio")
    public List<Audio> getAll() {
        if (audio.getAllMusic().isEmpty()) {
            System.out.println("Please add a couple of albums."); // For console logging
            return null;
        }
        else {
            return audio.getAllMusic();
        }
    }

    @RequestMapping("/addAudio/{var1}/{var2}/{var3}/{var4}/{var5}/{var6}/{var7}/{var8}/{var9}/{var10}/{var11}/{var12}")
    public void addAudio(@PathVariable("var1") int id,
                          @PathVariable("var2") String title,
                          @PathVariable("var3") int year,
                          @PathVariable("var4") String artist,
                          @PathVariable("var5") String recordLabel,
                          @PathVariable("var6") MusicGenre genre,
                          @PathVariable("var7") int length,
                          @PathVariable("var8") int numberOfTracks,
                          @PathVariable("var9") MediaType mediaType,
                          @PathVariable("var10") Language language,
                          @PathVariable("var11") AudioFormat audioFormat,
                          @PathVariable("var12") String barCode) {

        //Audio newAudioItem = new Audio(1, "The Division Bell", 1999, "Pink Floyd", "EMI", MusicGenre.ROCK, 90, 12, MediaType.CD, Language.ENGLISH, AudioFormat.STEREO, "1-234-5678-9");
        //Audio newAudioItem = new Audio(id, title, year, artist, recordLabel, genre, length, numberOfTracks, mediaType, language, audioFormat, barCode);

        audio.addAudio(new Audio(id, title, year, artist, recordLabel, genre, length, numberOfTracks, mediaType, language, audioFormat, barCode));
    }

}
