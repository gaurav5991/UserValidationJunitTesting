package com.uservalidation;

import java.util.regex.Pattern;

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

    public boolean validateFirstname(String first_name) throws UserValidationException
    {
        isStringEmptyOrNull(first_name);
        boolean result = Pattern.matches(FIRST_NAME_PATTERN, first_name);
        if(result==true){
            return  true;
        }else {
            throw new UserValidationException(UserValidationException.ExceptionType.INVALID_FIRST_NAME, "Enter Valid First Name");
        }
    }

    public boolean validateLastName(String last_name)throws UserValidationException
    {
        isStringEmptyOrNull(last_name);
        boolean result = Pattern.matches(LAST_NAME_PATTERN, last_name);
        if(result==true){
            return  true;
        }else {
            throw new UserValidationException(UserValidationException.ExceptionType.INVALID_LAST_NAME, "Enter Valid Last Name");
        }
    }
    public boolean validateEmail(String Email)throws UserValidationException
    {
        isStringEmptyOrNull(Email);
        boolean result = Pattern.matches(EMAIL_PATTERN, Email);
        if(result==true){
            return  true;
        }else {
            throw new UserValidationException(UserValidationException.ExceptionType.INVALID_EMAIL, "Enter Valid Email");
        }

    }

    public boolean validateMobileNumber(String mobile_number)throws UserValidationException
    {
        isStringEmptyOrNull(mobile_number);
        boolean result = Pattern.matches(MOBILE_NUMBER_PATTERN, mobile_number);
        if(result==true){
            return  true;
        }else {
            throw new UserValidationException(UserValidationException.ExceptionType.INVALID_MOBILE_NUMBER, "Enter Valid Mobile Number");
        }

    }
    public boolean validatePassword(String password) throws UserValidationException
    {
        isStringEmptyOrNull(password);
        boolean result = Pattern.matches(PASSWORD_PATTERN, password);
        if(result==true){
            return  true;
        }else {
            throw new UserValidationException(UserValidationException.ExceptionType.INVALID_PASSWORD, "Enter Valid Password");
        }
    }

}
