package com.example.teamproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class TwocoldController {

    @GetMapping("/Twocold")
    public @ResponseBody String Twocold() {
        return "Hello, Twocold!!";
    }
    
}
