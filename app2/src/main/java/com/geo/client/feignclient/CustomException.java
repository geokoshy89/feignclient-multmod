package com.geo.client.feignclient;

public class CustomException extends RuntimeException{
    private int status;
    private  String body;

    public CustomException(int status, String body) {
        this.status = status;
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
