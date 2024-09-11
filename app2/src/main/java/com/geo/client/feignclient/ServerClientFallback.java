package com.geo.client.feignclient;

import com.geo.client.dto.Person;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
@CircuitBreaker(name = "cb")
public class ServerClientFallback implements Server1Client {

    @Override
    public ResponseEntity<Person> getPerson() {
        return ResponseEntity.status(404).body(new Person("dummy", "dummy"));
    }
}
