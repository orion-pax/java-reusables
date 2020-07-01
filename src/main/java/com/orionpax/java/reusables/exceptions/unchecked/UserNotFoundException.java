package com.orionpax.java.reusables.exceptions.unchecked;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(String message) {
        super(message);
    }
}
