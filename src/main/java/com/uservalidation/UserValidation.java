package com.uservalidation;

import java.util.regex.Pattern;

@FunctionalInterface
interface checkIfValid{
    public boolean checkifValid(String input) throws UserValidationException;
}

public class UserValidation {

    private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[A-Za-z][a-zA-Z]+$";
    private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[A-Za-z][a-zA-Z]+$";
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9]+[_+-.]?[a-zA-Z0-9]*[a-zA-Z0-9]@[a-zA-Z0-9]+([.][a-zA-Z]{2,4})([.][a-zA-Z]{2,4})?$";
    private static final String MOBILE_NUMBER_PATTERN = "^\\d{2,3}\\s\\d{10}$";
    private static final String PASSWORD_PATTERN = "((^(?=.*[A-Z]))(?=.*[0-9])(?=.*[a-z])(?=.*\\W{1}).{8,}$)";


    public void isStringEmptyOrNull(String input) throws UserValidationException{
        try {
            if (input.length()==0){
                throw new UserValidationException(UserValidationException.ExceptionType.ENTERED_EMPTY, "String is Empty");
            }
        }catch (NullPointerException e){
            throw new UserValidationException(UserValidationException.ExceptionType.ENTERED_NULL, "Null is not Allowed");
        }
    }

    public void printWelcomeMessage()
    {
        System.out.println("Welcome to User Validation Program");
    }

    checkIfValid validateFirstname = (first_name) ->{
        isStringEmptyOrNull(first_name);
        boolean result = Pattern.matches(FIRST_NAME_PATTERN,first_name);
        if(result){
            return  true;
        }else {
            throw new UserValidationException(UserValidationException.ExceptionType.INVALID_FIRST_NAME, "Enter Valid First Name");
        }
    };

    checkIfValid validateLastName = (last_Name) ->{
        isStringEmptyOrNull(last_Name);
        boolean result = Pattern.matches(LAST_NAME_PATTERN,last_Name);
        if(result){
            return  true;
        }else {
            throw new UserValidationException(UserValidationException.ExceptionType.INVALID_LAST_NAME, "Enter Valid Last Name");
        }
    };


    checkIfValid validateEmail = (email) ->{
        isStringEmptyOrNull(email);
        boolean result = Pattern.matches(EMAIL_PATTERN,email);
        if(result){
            return  true;
        }else {
            throw new UserValidationException(UserValidationException.ExceptionType.INVALID_EMAIL, "Enter Valid Email");
        }
    };

    checkIfValid validateMobileNumber = (mobile_number) ->{
        isStringEmptyOrNull(mobile_number);
        boolean result = Pattern.matches(MOBILE_NUMBER_PATTERN,mobile_number);
        if(result){
            return  true;
        }else {
            throw new UserValidationException(UserValidationException.ExceptionType.INVALID_MOBILE_NUMBER, "Enter Valid Mobile Number");
        }
    };

    checkIfValid validatePassword = (password) ->{
        isStringEmptyOrNull(password);
        boolean result = Pattern.matches(PASSWORD_PATTERN,password);
        if(result){
            return  true;
        }else {
            throw new UserValidationException(UserValidationException.ExceptionType.INVALID_PASSWORD, "Enter Valid Password");
        }
    };
}
