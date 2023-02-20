package com.example.profITsoft16_17.exception;

public class PepNotFoundException extends RuntimeException{
    public PepNotFoundException() {
        super();
    }

    public PepNotFoundException(String message) {
        super(message);
    }
}
