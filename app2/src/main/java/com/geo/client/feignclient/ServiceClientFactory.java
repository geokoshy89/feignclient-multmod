package com.geo.client.feignclient;

import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class ServiceClientFactory implements FallbackFactory<ServerClientFallback> {
    @Override
    public ServerClientFallback create(Throwable cause) {
        return new ServerClientFallback(cause);
    }
}
