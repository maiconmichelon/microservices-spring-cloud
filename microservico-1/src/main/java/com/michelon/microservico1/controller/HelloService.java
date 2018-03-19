package com.michelon.microservico1.controller;

import com.michelon.microservico1.clients.Data;
import com.michelon.microservico1.clients.WorldClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloService {

    @Autowired
    private WorldClient worldClient;

    @GetMapping("/info")
    public ResponseEntity<String> info() {
        return ResponseEntity.ok("Microserviço 1");
    }

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello !");
    }

    @GetMapping("/hello-world")
    public ResponseEntity<String> helloWorld() {
        Data data = worldClient.getData().getBody();
        return ResponseEntity.ok("Hello " + data.getInfo());
    }

}
