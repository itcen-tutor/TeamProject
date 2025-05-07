package com.example.teamproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HanWoolController {
    
    @GetMapping("/hanwool")
    public @ResponseBody String hanwool() {
        return "Hello, Hanwool!!";
    }
    
}
