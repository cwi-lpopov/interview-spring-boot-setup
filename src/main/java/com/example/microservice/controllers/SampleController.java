package com.example.microservice.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SampleController {

    @GetMapping("/sample")
    public ResponseEntity<String> sample() {
        return ResponseEntity.ok("Hello World!");
    }
}
