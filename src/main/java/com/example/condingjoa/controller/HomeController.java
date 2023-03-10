package com.example.condingjoa.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@RequestMapping("/")
@Controller
public class HomeController {

    @GetMapping("/")
    public String mainPage(){
        log.info("mainPage called......");
        return "home";
    }
}
