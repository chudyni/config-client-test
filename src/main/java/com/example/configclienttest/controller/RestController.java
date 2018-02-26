package com.example.configclienttest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by marcin.bracisiewicz
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {


    @Value("${lucky-word}")
    private String luckyWord;

    @GetMapping("/lucky-word")
    public String showLuckyWord(){
        return "Word form Spring Cloud Server Config: " + this.luckyWord;
    }
}
