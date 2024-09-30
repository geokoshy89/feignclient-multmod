package com.geo.client.feignclient;

import com.geo.client.dto.Person;
import com.geo.client.dto.ResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "exampleClient", url = "http://localhost:8080", fallbackFactory = ServiceClientFactory.class)
public interface Server1Client{
    @GetMapping("/person")
    public ResponseEntity<Person> getPerson ();

    @GetMapping("/person/err")
    public ResponseEntity<ResponseDTO<Person>> getErrPerson ();

}
