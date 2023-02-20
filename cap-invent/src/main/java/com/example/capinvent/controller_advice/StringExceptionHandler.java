package com.example.capinvent.controller_advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StringExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<StringErrorResponse> handlerException(StringNotFoundException ex){

        StringErrorResponse response = new StringErrorResponse();
        response.setStatus(HttpStatus.I_AM_A_TEAPOT);
        response.setMessage(ex.getMessage());
        response.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(response, HttpStatus.BANDWIDTH_LIMIT_EXCEEDED);
    }

}
