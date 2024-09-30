package com.geo.server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class WitsmlConfiguration {

  @Bean
  public Jaxb2Marshaller marshaller() {
    Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
    // this package must match the package in the <generatePackage> specified in
    // pom.xml
    marshaller.setContextPath("com.geo.server.wits");
    return marshaller;
  }

  @Bean
  public WitsmlClient witsmlClient(Jaxb2Marshaller marshaller) {
    WitsmlClient client = new WitsmlClient();
    client.setDefaultUri("http://George:8088/mockWitsmlBinding");
    client.setMarshaller(marshaller);
    client.setUnmarshaller(marshaller);
    return client;
  }

}