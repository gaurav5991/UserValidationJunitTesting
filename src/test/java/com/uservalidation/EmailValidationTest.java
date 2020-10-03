package com.uservalidation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class EmailValidationTest
{
        private String Email;
        private UserValidation userValidation;

        public EmailValidationTest(String Email)
        {
            this.Email  = Email;
        }

    @Before
    public void intialize() {
        userValidation = new UserValidation();
    }

    @Parameterized.Parameters
    public static Collection input()
    {
        return Arrays.asList(new Object[]{ "abc@yahoo.com",
                "abc-100@yahoo.com",
                "abc.100@yahoo.com",
                "abc-100@abc.net",
                "abc111@abc.com",
                "abc.100@abc.com.au",
                "abc@1.com",
                "abc@gmail.com.com",
                "abc+100@gmail.com",
                "abc@.com",
                "abc@123gmail.a",
                "abc123@.com",
                "abc123@.com.com",
                ".abc@abc.com",
                "abc()*@gmail.com",
                "abc@%*.com.com",
                "abc..2002@.gmail.com",
                "abc.@gmail.com",
                "abc@abc@gmail.com",
                "abc@gmail.com.1a",
                "abc@gmail.com.aa.au"});
    }

    @Test
    public void givenEmail_As_variable_shouldReturn_As_per_ParamaterisedTest()
    {
        try {
            userValidation.validateEmail.checkifValid(this.Email);
        }catch (UserValidationException e){
            System.out.println(e.type+" will give message "+e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_EMAIL,e.type);
        }
    }
}
