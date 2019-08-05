package com.example.hello.repository;

import com.example.hello.model.Greeting;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface GreetingRepository extends CrudRepository<Greeting, UUID> {
}
