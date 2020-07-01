package com.orionpax.java.reusables.exceptions.unchecked;

public class RecordExistsException extends RuntimeException {
    public RecordExistsException(String message) {
        super(message);
    }
}