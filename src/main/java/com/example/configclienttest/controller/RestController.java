package com.example.configclienttest.controller;

import com.example.configclienttest.config.LuckyProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by marcin.bracisiewicz
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private LuckyProperties properties;

    @GetMapping("/lucky-word")
    public String showLuckyWord() {
        return String.format("%s: %s", this.properties.getPreamble(),this.properties.getLuckyWord());
    }
}
