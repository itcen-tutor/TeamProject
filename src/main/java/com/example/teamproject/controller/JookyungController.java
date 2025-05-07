package com.example.teamproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class JookyungController {

    @GetMapping("/jookyung")
    public @ResponseBody String jookyung() {
        return "Hello, Jookyung!!";
    }
    
}
