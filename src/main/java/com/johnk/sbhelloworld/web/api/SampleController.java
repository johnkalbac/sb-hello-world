package com.johnk.sbhelloworld.web.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Value("${message}")
    private String message;

    @GetMapping(path = "/ping")
    public ResponseEntity ping() {
        return ResponseEntity.ok().body("pong!");
    }

    @GetMapping(path = "/hello")
    public ResponseEntity helloWorld() {
        return ResponseEntity.ok().body(message);
    }

}
