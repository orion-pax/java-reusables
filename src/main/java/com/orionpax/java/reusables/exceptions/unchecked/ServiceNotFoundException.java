package com.orionpax.java.reusables.exceptions.unchecked;

public class ServiceNotFoundException extends RuntimeException {

    public ServiceNotFoundException(String message) {
        super(message);
    }
}
