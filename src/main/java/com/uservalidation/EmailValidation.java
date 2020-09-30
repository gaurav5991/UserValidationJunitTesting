package com.uservalidation;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class EmailValidation
{
    public void CheckSampleEmails()
    {
        ArrayList<String> Email = new ArrayList<>();
        Email.add("abc@yahoo.com");
        Email.add("abc-100@yahoo.com");
        Email.add("abc.100@yahoo.com");
        Email.add("abc111@abc.com");
        Email.add("abc-100@abc.net");
        Email.add("abc.100@abc.com.au");
        Email.add("abc@1.com");
        Email.add("abc@gmail.com.com");
        Email.add("abc+100@gmail.com");
        Email.add("abc");
        Email.add("abc@.com.my");
        Email.add("abc123@gmail.a");
        Email.add("abc123@.com");
        Email.add("abc123@.com.com");
        Email.add(".abc@abc.com");
        Email.add("abc()*@gmail.com");
        Email.add("abc@%*.com");
        Email.add("abc..2002@gmail.com");
        Email.add("abc.@gmail.com");
        Email.add("abc@abc@gmail.com");
        Email.add("abc@gmail.com.1a");
        Email.add("abc@gmail.com.aa.au");

        String regex = "[a-zA-Z0-9]+[_+-.]?[a-zA-Z0-9]*[a-zA-Z0-9]@[a-zA-Z0-9]+([.][a-zA-Z]{2,4})([.][a-zA-Z]{2,4})?";

        for(String email : Email)
        {
            if(Pattern.matches(regex, email))
            {
                System.out.println(email+"------------"+Pattern.matches(regex, email));
            }
            if(!Pattern.matches(regex, email))
            {
                System.out.println(email+"------------"+Pattern.matches(regex, email));
            }
        }
    }

    public static void main(String[] args) {
        EmailValidation obj = new EmailValidation();
        obj.CheckSampleEmails();
    }
}
