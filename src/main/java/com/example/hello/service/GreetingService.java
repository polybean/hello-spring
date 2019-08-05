package com.example.hello.service;

import com.example.hello.model.Greeting;
import com.example.hello.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class GreetingService {
    @Autowired
    private GreetingRepository greetingRepository;

    public UUID insertOne(Greeting greeting) {
        return greetingRepository.save(greeting).getId();
    }

    public Iterable<Greeting> findAll() {
        return greetingRepository.findAll();
    }
 }
