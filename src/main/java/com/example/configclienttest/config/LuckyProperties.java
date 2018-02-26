package com.example.configclienttest.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by marcin.bracisiewicz
 */
@Configuration
@ConfigurationProperties(prefix = "wordConfig")
public class LuckyProperties {

    private String preamble;
    private String luckyWord;

    public String getLuckyWord() {
        return luckyWord;
    }

    public void setLuckyWord(String luckyWord) {
        this.luckyWord = luckyWord;
    }

    public String getPreamble() {
        return preamble;
    }

    public void setPreamble(String preamble) {
        this.preamble = preamble;
    }
}
