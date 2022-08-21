package com.nova.skills.controller;

import com.nova.skills.model.Language;
import com.nova.skills.model.Programmer;
import com.nova.skills.service.ProgrammerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collections;
import java.util.List;


@Controller
public class WebController {


    private ProgrammerService programmerService;

    @Autowired
    public WebController(ProgrammerService programmerService) {
        this.programmerService = programmerService;
    }

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("programmers", programmerService.findAll());
        return "index";
    }

    @GetMapping("/create_developer")
    public String developer(){
        return "developer";
    }

    @GetMapping("/create_language")
    public String language(){
        return "language";
    }
}
