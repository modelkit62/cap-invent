package com.example.capinvent.controller_advice;

import org.springframework.http.HttpStatus;

public class StringErrorResponse {

    private HttpStatus status;
    private String message;
    private long timeStamp;

    public StringErrorResponse() {
    }

    public StringErrorResponse(HttpStatus status, String message, long timeStamp) {
        this.status = status;
        this.message = message;
        this.timeStamp = timeStamp;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
