package com.example.hello.controller;

import com.example.hello.model.Greeting;
import com.example.hello.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.UUID;

@RestController
@RequestMapping("greetings")
public class Greetings {
    @Autowired
    private GreetingService greetingService;


    @GetMapping
    public Iterable<Greeting> index() {
        return greetingService.findAll();
    }

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody Greeting greeting) throws URISyntaxException {
        UUID id = greetingService.insertOne(greeting);
        return ResponseEntity.created(new URI("/issues/" + id)).build();
    }
}
