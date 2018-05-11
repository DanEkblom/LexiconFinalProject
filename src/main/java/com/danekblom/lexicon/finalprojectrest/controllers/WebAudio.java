package com.danekblom.lexicon.finalprojectrest.controllers;

import com.danekblom.lexicon.finalprojectrest.model.Audio;
import com.danekblom.lexicon.finalprojectrest.services.AudioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class WebAudio {

    @Autowired
    AudioServiceImpl audioService;

    @GetMapping("/allaudio")
    public String getAllAudio(Model model) {
        model.addAttribute("audioList", audioService.getAllMusic());
        return "allAudio";
    }

    @GetMapping("/addaudio")
    public String addAudio(Model model) {
        model.addAttribute("audioItem", new Audio());
        return "addAudio";
    }

    @PostMapping("/addaudio")
    public String getAudio(@Valid Audio audioItem, Model model) {
        model.addAttribute("audioItem", new Audio());
        model.addAttribute("addedAudioItem", audioService.addAudio(audioItem));
        return "addAudio";
    }
}
