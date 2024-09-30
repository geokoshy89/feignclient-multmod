package com.geo.server;

import com.geo.server.dto.Error;
import com.geo.server.dto.Person;
import com.geo.server.dto.ResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @GetMapping("/person")
    public ResponseEntity<Person> getPerson(){
        Person person = new Person("John Doe", "30");
        return ResponseEntity.ok(person);
    }
    @GetMapping("/person/err")
    public ResponseEntity<ResponseDTO<Person>> getErrPerson(){
        Person person = new Person("John Doe", "30");
        ResponseDTO errorResponse = ResponseDTO.builder()
                .errors(List.of(Error
                        .builder()
                                .status("Err-12434")
                                .message("Not a valid request")
                        .build()))
                .status("Failure")
                .build();
        return ResponseEntity.badRequest().body(errorResponse);
    }

}
