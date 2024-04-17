package org.example.utils.exceptions;

public class ArrayEmptyException extends RuntimeException {
    public ArrayEmptyException() {
        super();
    }
    public ArrayEmptyException(String message) {
        super(message);
    }
}
