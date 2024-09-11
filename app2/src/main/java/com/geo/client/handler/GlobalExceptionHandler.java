package com.geo.client.handler;

import com.geo.client.Controller;
import com.geo.client.handler.ErrorDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice(assignableTypes = {Controller.class})
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handleGlobalException(Exception ex, WebRequest request) {
        String path = request.getDescription(false);
        ErrorDetails errorDetails;

        if (path.contains("/client/person2")) {
            errorDetails = new ErrorDetails(new Date(), "Specific error message for /specific-path", path);
            return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
        } else {
            errorDetails = new ErrorDetails(new Date(), ex.getMessage(), path);
            return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
