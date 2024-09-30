package com.geo.server.controller;

import com.geo.server.config.WitsmlClient;
import com.geo.server.wits.GetFromStoreResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SoapController {
    @Autowired
    private WitsmlClient soapClient;
    @GetMapping(path = "/ws", produces = MediaType.APPLICATION_XML_VALUE)
    public GetFromStoreResponse makeSoapRequest(){
        GetFromStoreResponse soapResponse = soapClient.getFromStore();
        return soapResponse;
    }
}
