package com.example.capinvent.controller_advice;

public class StringNotFoundException extends RuntimeException {

    public StringNotFoundException() {
    }

    public StringNotFoundException(String message) {
        super(message);
    }

    public StringNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

}
