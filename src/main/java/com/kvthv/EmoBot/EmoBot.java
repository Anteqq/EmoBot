package com.kvthv.EmoBot;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Random;

@Component
public class EmoBot implements Bot{
    //first and last response
    private String welcomeMessage = "Hi I'm emoBot (>_<)";
    private String goodbyeMessage = "I miss you already... (; - ;) ";
    //responses array
    private List<String> responses;
    //random number
    private Random random = new Random();

    public EmoBot() {
    }

    @Override
    public String getResponse() {
        if (responses != null) {
            //create random number from the size of a responses array
            int index = random.nextInt(responses.size());
            //return random response
            return responses.get(index);
        } else return "Failed getting response";
    }

    @Override
    public String sendMessage(String message) {
        return null;
    }

    @Override
    public List<String> loadLibrary() {
        try {
            //read text lines from .txt file to String List
            responses = Files.readAllLines(Path.of("EmoBotLibrary.txt"));
            return responses;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @PostConstruct
    public void startup() {
        responses = loadLibrary();
        System.out.println(welcomeMessage);
    }

    @PreDestroy
    public void shutdown() {
        System.out.println(goodbyeMessage);
    }
}
