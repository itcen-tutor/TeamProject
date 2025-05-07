package com.example.teamproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class GkdmsController {
    @GetMapping("/gkdms")
    public @ResponseBody String gkdms() {
        return "Hello, gkdms";
    }
    
}
