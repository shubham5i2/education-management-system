package com.ems.exception;

public class StudentNotFoundException extends RuntimeException {

    public StudentNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
