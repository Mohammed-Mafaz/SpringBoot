package com.quad.project.uber.uberApp.exception;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(){}

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
