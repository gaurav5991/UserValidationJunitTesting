package com.uservalidation;

import java.util.regex.Pattern;

public class UserValidation {

    private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[A-Za-z][a-zA-Z]+$";
    private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[A-Za-z][a-zA-Z]+$";
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9]+[_+-.]?[a-zA-Z0-9]*[a-zA-Z0-9]@[a-zA-Z0-9]+([.][a-zA-Z]{2,4})([.][a-zA-Z]{2,4})?$";
    private static final String MOBILE_NUMBER_PATTERN = "^\\d{2,3}\\s\\d{10}$";
    private static final String PASSWORD_PATTERN = ".{8,}";

    public void printWelcomeMessage()
    {

        System.out.println("Welcome to User Validation Program");
    }

    public boolean validateFirstname(String first_name)
    {

        return Pattern.matches(FIRST_NAME_PATTERN, first_name);
    }

    public boolean validateLastName(String last_name)
    {
        return Pattern.matches(LAST_NAME_PATTERN, last_name);
    }
    public boolean validateEmail(String Email)
    {
        return Pattern.matches(EMAIL_PATTERN, Email);
    }

    public boolean validateMobileNumber(String mobile_number)
    {
        return Pattern.matches(MOBILE_NUMBER_PATTERN, mobile_number);
    }
    public boolean validatePassword(String password)
    {
        return Pattern.matches(PASSWORD_PATTERN, password);
    }
}
