package com.uservalidation;

public class UserValidationException extends Exception {
    public ExceptionType type;

    enum ExceptionType{
        ENTERED_EMPTY,ENTERED_NULL,INVALID_FIRST_NAME,INVALID_LAST_NAME,INVALID_EMAIL,INVALID_MOBILE_NUMBER,INVALID_PASSWORD
    }

    public UserValidationException(ExceptionType type,String message) {
        super(message);
        this.type = type;
    }
}