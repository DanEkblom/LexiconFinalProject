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

    @GetMapping("/add")
    public String addAudio(Model model) {
        model.addAttribute("audioItem", new Audio());
        return "addAudio";
    }

    /**
     * POST Method for creating/adding an audioService item via the addAudio.html Thymeleaf template.
     * Mapped to /add
     * @param audioItem Audio class item to be added. Validated before added.
     * @param model Spring class
     * @return "allAudio", HTML/Thymeleaf document
     */
    @PostMapping("/add")
    public String getAudio(@Valid Audio audioItem, Model model) {
        model.addAttribute("audioItem", new Audio());
        model.addAttribute("addedAudioItem", audioService.addAudioItem(audioItem));
        return "addAudio"; // addedAudio? New page showing the added item.
    }

}
