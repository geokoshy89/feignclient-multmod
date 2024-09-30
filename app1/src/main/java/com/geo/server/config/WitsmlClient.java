package com.geo.server.config;

import com.geo.server.wits.GetFromStoreRequest;
import com.geo.server.wits.GetFromStoreRequest;
import com.geo.server.wits.GetFromStoreResponse;
import com.geo.server.wits.GetFromStoreResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class WitsmlClient extends WebServiceGatewaySupport {

  private static final Logger log = LoggerFactory.getLogger(WitsmlClient.class);

  public GetFromStoreResponse getFromStore() {

    GetFromStoreRequest request = new GetFromStoreRequest();

    log.info("Requesting location for ");

    GetFromStoreResponse response = (GetFromStoreResponse) getWebServiceTemplate()
        .marshalSendAndReceive("http://George:8088/mockWitsmlBinding", request,
            new SoapActionCallback(
                "http://www.witsml.org/schemas/1series/GetFromStore"));

    return response;
  }

}