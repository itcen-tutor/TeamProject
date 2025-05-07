package com.example.teamproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// 한솔 컨트롤러 추가 250507 이동진
@Controller
public class HansolController {

    @GetMapping("/hansol")
    public @ResponseBody String hansol() {
        return "Hello, Hansol!!";
    }
    
}
