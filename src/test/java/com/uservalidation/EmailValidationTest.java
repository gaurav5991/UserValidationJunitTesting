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
        private String validateEmail;
        private boolean ExpectedResult;
        private EmailValidation emailValidation;

        public EmailValidationTest(String validateEmail,boolean ExpectedResult)
        {
            super();
            this.validateEmail = validateEmail;
            this.ExpectedResult = ExpectedResult;
        }

    @Before
    public void intialize() {
        emailValidation = new EmailValidation();
    }

    @Parameterized.Parameters
    public static Collection input()
    {
        return Arrays.asList(new Object[][]{{ "abc@yahoo.com", true },
                                            {"abc-100@yahoo.com", true },
                                            { "abc.100@yahoo.com", true },
                                            { "abc-100@abc.net", true },
                                            {"abc111@abc.com", true},
                                            { "abc.100@abc.com.au",true },
                                            { "abc@1.com", true },
                                            { "abc@gmail.com.com", true },
                                            { "abc+100@gmail.com", true },
                                            { "abc@.com", false },
                                            { "abc@123gmail.a", false },
                                            { "abc123@.com", false },
                                            { "abc123@.com.com", false },
                                            { ".abc@abc.com", false },
                                            { "abc()*@gmail.com", false },
                                            { "abc@%*.com.com", false },
                                            { "abc..2002@.gmail.com", false },
                                            { "abc.@gmail.com", false },
                                            { "abc@abc@gmail.com", false },
                                            { "abc@gmail.com.1a", false },
                                            { "abc@gmail.com.aa.au", false },});
    }

    @Test
    public void givenEmail_As_variable_shouldReturn_As_per_ParamaterisedTest()
    {
        System.out.println(validateEmail + " "+ExpectedResult);
        Assert.assertEquals(ExpectedResult,emailValidation.EmailValidate(validateEmail));
    }
}
