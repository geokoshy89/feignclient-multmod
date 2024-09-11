package com.geo.client;

import com.geo.client.dto.Person;
import com.geo.client.feignclient.Server1Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private Server1Client server1Client;
    @GetMapping("/client/person")
    public ResponseEntity<Person> getPerson(){
        return server1Client.getPerson();
    }

    @GetMapping("/client/person2/{id}")
    public ResponseEntity<Person> getPerson(@PathVariable String id){
        if(id.equals("0")){
            throw new RuntimeException();
        }
        return server1Client.getPerson();
    }
}
