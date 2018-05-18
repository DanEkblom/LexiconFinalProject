package com.danekblom.lexicon.finalprojectrest.controllers;

import com.danekblom.lexicon.finalprojectrest.model.Audio;
import com.danekblom.lexicon.finalprojectrest.services.AudioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/audio")
public class WebAudio {

    @Autowired
    AudioServiceImpl audioService;

    /**
     * GET Method. Returns a static HTML page containing "how to use" instructions
     * @return "audioInfo", HTML/Thymeleaf document
     */
    @GetMapping("")
    public String getAudioRoot() {
        return "audioInfo";
    }

    /**
     * C in CRUD, Step 1
     * GET Method for fetching the "add audio item" form page
     * Mapped to /add
     * @param model Spring class
     * @return "addAudio", HTML/Thymeleaf document
     */
    @GetMapping("/add")
    public String addAudioForm(Model model) {
        model.addAttribute("audioItem", new Audio());
        return "addAudio";
    }

    /**
     * C in CRUD, Step 2
     * POST Method for adding an audioService item via the addAudio.html Thymeleaf template.
     * Mapped to /itemAdded, which is the form action url
     * @param audioItem Audio class item to be added. Validated before added.
     * @param model Spring class
     * @return "addAudio", HTML/Thymeleaf document
     */
    @PostMapping("/itemAdded")
    public String addAudio(@Valid Audio audioItem, Model model) {
        model.addAttribute("audioItem", new Audio());
        model.addAttribute("addedAudioItem", audioService.addAudioItem(audioItem));
        return "addAudio";
    }

    /**
     * R in CRUD.
     * HTTP GET Method for listing all audioService items in the allAudio.html Thymeleaf template
     * Mapped to /all
     * @param model Spring class
     * @return "allAudio", HTML/Thymeleaf document
     */
    @GetMapping("/all")
    public String getAllAudio(Model model) {
        model.addAttribute("audioList", audioService.listAllAudioItems());
        return "allAudio";
    }

}
