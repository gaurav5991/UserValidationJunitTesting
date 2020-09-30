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
    @Test
    public void givenLastName_When_ProperShouldReturnTrue()
    {
        UserValidation validate = new UserValidation();
        boolean result = validate.validateLastName("Sharma");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_When_Short_ShouldReturnFalse()
    {
        UserValidation validate = new UserValidation();
        boolean result = validate.validateFirstname("Sh");
        Assert.assertFalse(result);
    }
    @Test
    public void givenLastName_have_special_Character_ShouldReturnFalse()
    {
        UserValidation validate = new UserValidation();
        boolean result = validate.validateFirstname("w@LC@ME");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmail_if_valid_shouldReturnTrue()
    {
        UserValidation validate = new UserValidation();
        boolean result = validate.validateEmail("abc@yahoo.com");
        System.out.println(result);
        Assert.assertTrue(result);
    }
    @Test
    public void givenEmail_starting_with_sp_character_ReturnsFalse()
    {
        UserValidation validate = new UserValidation();
        boolean result = validate.validateEmail(".abc@abc.com");
        System.out.println(result);
        Assert.assertFalse(result);
    }
    @Test
    public void givenEmail_having_multiple_tld_ReturnsFalse()
    {
        UserValidation validate = new UserValidation();
        boolean result = validate.validateEmail("abc@gmail.com.aa.au");
        System.out.println(result);
        Assert.assertFalse(result);
    }
    @Test
    public void givenEmail_having_digit_in_tld_ReturnsFalse()
    {
        UserValidation validate = new UserValidation();
        boolean result = validate.validateEmail("abc12@gmail.com.1a");
        System.out.println(result);
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmail_having_double_At_the_Rate_ReturnsFalse()
    {
        UserValidation validate = new UserValidation();
        boolean result = validate.validateEmail("abc45@abc@gmail.com");
        System.out.println(result);
        Assert.assertFalse(result);
    }
    @Test
    public void givenEmail_having_double_dots_ReturnsFalse()
    {
        UserValidation validate = new UserValidation();
        boolean result = validate.validateEmail("abc..2002@gmail.com");
        System.out.println(result);
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmail_having_less_than_2_character_ReturnsFalse()
    {
        UserValidation validate = new UserValidation();
        boolean result = validate.validateEmail("abc.xyz@gmail.co.in");
        System.out.println(result);
        Assert.assertFalse(result);
    }

}
