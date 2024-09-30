package com.geo.server.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Builder
public class ResponseDTO<T> {
    private T data;

    private String status;

    private List<Error> errors;

}
