package org.example.bdd.exception;

public class ApplicationDateFormatException extends RuntimeException {

    public ApplicationDateFormatException(String message, Throwable cause) {
        super(message, cause);
    }

    public ApplicationDateFormatException(String message) {
        super(message);
    }
}
