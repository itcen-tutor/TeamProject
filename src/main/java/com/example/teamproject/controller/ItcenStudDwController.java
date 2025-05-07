package com.example.teamproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ItcenStudDwController {

    @GetMapping("/itcenstuddw")
    public @ResponseBody String itcenstuddw() {
        return new String("Hello, itcenstuddw");
    }
    
}
