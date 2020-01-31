package com.kvthv.EmoBot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class EmoBotController {
    @Autowired
    public Bot emoBot;
    @GetMapping
    public ResponseEntity<String> DisplayMessage() {
        return ResponseEntity.ok(emoBot.getResponse());
    }
}
