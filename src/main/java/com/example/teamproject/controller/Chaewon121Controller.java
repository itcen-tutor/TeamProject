package com.example.teamproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Chaewon121Controller {

    @GetMapping("/chaewon121")
    public @ResponseBody String itenstud() {
        return "Hello, chaewon121!!";
    }
    
}
