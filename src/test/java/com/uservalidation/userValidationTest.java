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
        boolean result = validate.validateEmail("abc-100@yahoo.com");
        Assert.assertTrue(result);
    }
    @Test
    public void givenEmail_starting_with_sp_character_ReturnsFalse()
    {
        UserValidation validate = new UserValidation();
        boolean result = validate.validateEmail(".abc@abc.com");
        Assert.assertFalse(result);
    }
    @Test
    public void givenEmail_having_multiple_tld_ReturnsFalse()
    {
        UserValidation validate = new UserValidation();
        boolean result = validate.validateEmail("abc@gmail.com.aa.au");
        Assert.assertFalse(result);
    }
    @Test
    public void givenEmail_having_digit_in_tld_ReturnsFalse()
    {
        UserValidation validate = new UserValidation();
        boolean result = validate.validateEmail("abc12@gmail.com.1a");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmail_having_double_At_the_Rate_ReturnsFalse()
    {
        UserValidation validate = new UserValidation();
        boolean result = validate.validateEmail("abc45@abc@gmail.com");
        Assert.assertFalse(result);
    }
    @Test
    public void givenEmail_having_double_dots_ReturnsFalse()
    {
        UserValidation validate = new UserValidation();
        boolean result = validate.validateEmail("abc..2002@gmail.com");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmail_having_less_than_2_character_ReturnsFalse()
    {
        UserValidation validate = new UserValidation();
        boolean result = validate.validateEmail("abc.xyz@gmail.c.i");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_if_proper_shouldReturnTrue()
    {
        UserValidation validate = new UserValidation();
        boolean result = validate.validateMobileNumber("91 9876543210");
        Assert.assertTrue(result);

    }

    @Test
    public void givenMobileNumber_if_Improper_shouldReturnFalse()
    {
        UserValidation validate = new UserValidation();
        boolean result = validate.validateMobileNumber("91 98765432103");
        Assert.assertFalse(result);
    }
    @Test
    public void givenMobileNumber_if_space_not_There_After_Country_Code_shouldReturnFalse()
    {
        UserValidation validate = new UserValidation();
        boolean result = validate.validateMobileNumber("9198765432103");
        Assert.assertFalse(result);
    }
    @Test
    public void givenMobileNumber_if_countryCode_of_min_2_digit_shouldReturnTrue()
    {
        UserValidation validate = new UserValidation();
        boolean result = validate.validateMobileNumber("9 9876543210");
        Assert.assertFalse(result);
    }
    @Test
    public void givenPassword_if_proper_shouldReturnTrue()
    {
        UserValidation validate = new UserValidation();
        boolean result = validate.validatePassword("G@urav1234.,433'[]");
        Assert.assertTrue(result);
    }
    @Test
    public void givenPassword_if_Improper_shouldReturnFalse()
    {
        UserValidation validate = new UserValidation();
        boolean result = validate.validatePassword("Gaur@v1");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_with_AtLeast_1_UpperCase_shouldReturnTrue()
    {
        UserValidation validate = new UserValidation();
        boolean result = validate.validatePassword("Bridgelabz@1");
        Assert.assertTrue(result);
    }
    @Test
    public void givenPassword_with_No_UpperCase_shouldReturnFalse()
    {
        UserValidation validate = new UserValidation();
        boolean result = validate.validatePassword("bridgelabz");
        Assert.assertFalse(result);
    }
    @Test
    public void givenPassword_with_Atleast_1_Numeral_shouldReturnTrue()
    {
        UserValidation validate = new UserValidation();
        boolean result = validate.validatePassword("Gaurav@1234");
        Assert.assertTrue(result);
    }
    @Test
    public void givenPassword_without_Numeral_shouldReturnFalse()
    {
        UserValidation validate = new UserValidation();
        boolean result = validate.validatePassword("BRIDGElabz");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_with_Exactly_1_Sp_char_shouldReturnTrue()
    {
        UserValidation validate = new UserValidation();
        boolean result = validate.validatePassword("Gaurav@1234");
        Assert.assertTrue(result);
    }
    @Test
    public void givenPassword_more_than_1_special_char_shouldReturnFalse()
    {
        UserValidation validate = new UserValidation();
        boolean result = validate.validatePassword("BRID@#$labz");
        Assert.assertFalse(result);
    }
}
