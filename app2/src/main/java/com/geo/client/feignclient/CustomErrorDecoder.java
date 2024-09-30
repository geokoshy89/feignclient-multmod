package com.geo.client.feignclient;

import feign.Response;
import feign.codec.ErrorDecoder;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

@Component
public class CustomErrorDecoder implements ErrorDecoder {
    private final ErrorDecoder defaultErrorDecoder = new Default();
    @Override
    public Exception decode(String methodKey, Response response) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(response.body().asInputStream(), StandardCharsets.UTF_8))) {
            String body = reader.lines().collect(Collectors.joining("\n"));
            if (body.contains("status")) {
                return new CustomException(response.status(), body);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return defaultErrorDecoder.decode(methodKey, response);
    }
}
