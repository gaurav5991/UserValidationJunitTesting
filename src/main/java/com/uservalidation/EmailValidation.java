package com.uservalidation;

import java.util.ArrayList;
import java.util.regex.Pattern;


public class EmailValidation
{
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9]+[_+-.]?[a-zA-Z0-9]*[a-zA-Z0-9]@[a-zA-Z0-9]+([.][a-zA-Z]{2,4})([.][a-zA-Z]{2,4})?$";

    public boolean EmailValidate(String email)
    {
        return Pattern.matches(EMAIL_PATTERN, email);
    }
}
