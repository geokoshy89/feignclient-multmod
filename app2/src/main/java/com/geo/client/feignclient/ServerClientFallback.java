package com.geo.client.feignclient;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.geo.client.dto.Person;
import com.geo.client.dto.ResponseDTO;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

public class ServerClientFallback implements Server1Client {
    Logger logger = LoggerFactory.getLogger(ServerClientFallback.class);
    private final Throwable cause;
    public ServerClientFallback(Throwable cause) {
        this.cause = cause;
    }

    @Override
    public ResponseEntity getPerson() {
        if(cause instanceof CustomException){
            return ResponseEntity.status(((CustomException) cause).getStatus()).body(((CustomException) cause).getBody());
        }
        return ResponseEntity.status(404).body(new Person("dummy", "dummy"));
    }

    @Override
    public ResponseEntity<ResponseDTO<Person>> getErrPerson() {
        if (cause instanceof CustomException) {
            try {
                ObjectMapper mapper =new ObjectMapper();
                ResponseDTO<Person> responseDTO = mapper.readValue(((CustomException) cause).getBody(), ResponseDTO.class);
                return ResponseEntity.status(((CustomException) cause).getStatus()).body(responseDTO);
            } catch (JsonProcessingException e) {
                logger.error("Error while parsing the underlying services response json", e);
            }
        }
        return ResponseEntity.status(404).body(ResponseDTO.<Person>builder().status("Failure")
                .data(new Person("dummy", "dummy")).build());
    }
}
