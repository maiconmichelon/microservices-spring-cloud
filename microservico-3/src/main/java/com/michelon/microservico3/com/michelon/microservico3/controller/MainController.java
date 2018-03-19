package com.michelon.microservico3.com.michelon.microservico3.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class MainController {

    @GetMapping("/info")
    public ResponseEntity<String> main() {
        return ResponseEntity.ok("Microserviço 3");
    }

}
