package com.tts.giphyAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tts.giphyAPI.model.Request;

@Controller
public class GiphyController {
    @Autowired
    private GiphyService giphyService;
    
    @GetMapping
    public String getIndex(Model model) {
    	model.addAttribute("request", new Request());
        return "index";
    }
    
}