package com.uservalidation;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class userValidationTest {

    @BeforeClass
    public static void beforeClass() {
        UserValidation validate = new UserValidation();
        validate.printWelcomeMessage();

    }

    @Test
    public void givenFirstName_When_ProperShouldReturnTrue()
    {
        UserValidation validate = new UserValidation();
        boolean result = validate.validateFirstname("Gaurav");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_When_Short_ShouldReturnFalse()
    {
        UserValidation validate = new UserValidation();
        boolean result = validate.validateFirstname("Ga");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_have_special_Character_ShouldReturnFalse()
    {
        UserValidation validate = new UserValidation();
        boolean result = validate.validateFirstname("G@urav");
        Assert.assertFalse(result);
    }
}
