package com.geo.server;

import com.geo.server.dto.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {
    @GetMapping("/person")
    public ResponseEntity<Person> getPerson(){
        Person person = new Person("John Doe", "30");
        return ResponseEntity.ok(person);
    }
}
