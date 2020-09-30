package com.uservalidation;

import java.util.regex.Pattern;

public class UserValidation {

    private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[A-Za-z][a-zA-Z]+$";
    private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[A-Za-z][a-zA-Z]+$";

    public void printWelcomeMessage()
    {
        System.out.println("Welcome to User Validation Program");
    }

    public boolean validateFirstname(String first_name)
    {
        return Pattern.matches(FIRST_NAME_PATTERN, first_name);
    }

    public boolean validateLastName(String last_name) {

        return Pattern.matches(LAST_NAME_PATTERN, last_name);
    }
}
