package com.geo.client.feignclient;

import com.geo.client.dto.Person;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "exampleClient", url = "http://localhost:8080", fallback = ServerClientFallback.class)
public interface Server1Client{
    @GetMapping("/person")
    public ResponseEntity<Person> getPerson ();

}
