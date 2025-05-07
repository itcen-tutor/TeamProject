package com.example.teamproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class Rate1 {

    @GetMapping("/rate1")
    public @ResponseBody String rate1() {
        return "Hello, rate1!";
    }   

    @GetMapping("/rate2")
    public @ResponseBody String rate2() {
        return "Hello, rate2!";
    }
    
    @GetMapping("/rate3")
    public @ResponseBody String rate3() {
        return "Hello, rate3!";
    }  
}
