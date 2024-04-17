package org.example.utils.exceptions;

public class NoSuchElementException extends RuntimeException {
    public NoSuchElementException() {
        super();
    }
    public NoSuchElementException(String message) {
        super(message);
    }
}