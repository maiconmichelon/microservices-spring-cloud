package com.michelon.microservico2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorldService {

    @RequestMapping("/info")
    public ResponseEntity<String> info() {
        return ResponseEntity.ok("Microservice 2");
    }

    @RequestMapping("/world")
    public ResponseEntity<Data> data() {
        Data data = new Data();
        data.setInfo("World");
        return ResponseEntity.ok(data);
    }

}
