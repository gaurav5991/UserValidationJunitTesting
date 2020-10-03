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
    UserValidation validate = new UserValidation();

    @Test
    public void givenFirstName_Null_shouldThrowInvalid_AsMessage()
    {
        try {
            validate.validateFirstname.checkifValid(null);
        }catch (UserValidationException e){
            System.out.println(e.type + " will give message " + e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_NULL, e.type);
        }
    }
    @Test
    public void givenFirstName_Empty_shouldThrowInvalid_AsMessage()
    {
        try {
            validate.validateFirstname.checkifValid("");
        }catch (UserValidationException e){
            System.out.println(e.type + " will give message " + e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }
    @Test
    public void givenLastName_Null_shouldThrowInvalid_AsMessage()
    {
        try {
           validate.validateLastName.checkifValid(null);
        }catch (UserValidationException e){
            System.out.println(e.type + " will give message " + e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_NULL, e.type);
        }
    }
    @Test
    public void givenLastName_Empty_shouldThrowInvalid_AsMessage()
    {
        try {
            validate.validateLastName.checkifValid("");
        }catch (UserValidationException e){
            System.out.println(e.type + " will give message " + e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }
    @Test
    public void givenEmail_Null_shouldThrowInvalid_AsMessage()
    {
        try {
            validate.validateEmail.checkifValid(null);
        }catch (UserValidationException e){
            System.out.println(e.type + " will give message " + e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_NULL, e.type);
        }
    }
    @Test
    public void givenEmail_Empty_shouldThrowInvalid_AsMessage()
    {
        try {
           validate.validateEmail.checkifValid("");
        }catch (UserValidationException e){
            System.out.println(e.type + " will give message " + e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }
    @Test
    public void givenMob_Num_Null_shouldThrowInvalid_AsMessage()
    {
        try {
            validate.validateMobileNumber.checkifValid(null);
        }catch (UserValidationException e){
            System.out.println(e.type + " will give message " + e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_NULL, e.type);
        }
    }
    @Test
    public void givenMob_Num_Empty_shouldThrowInvalid_AsMessage()
    {
        try {
            validate.validateMobileNumber.checkifValid("");
        }catch (UserValidationException e){
            System.out.println(e.type + " will give message " + e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }
    @Test
    public void givenPassword_Null_shouldThrowInvalid_AsMessage()
    {
        try {
            validate.validatePassword.checkifValid(null);
        }catch (UserValidationException e){
            System.out.println(e.type + " will give message " + e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_NULL, e.type);
        }
    }
    @Test
    public void givenPassword_Empty_shouldThrowInvalid_AsMessage()
    {
        try {
            validate.validatePassword.checkifValid("");
        }catch (UserValidationException e){
            System.out.println(e.type + " will give message " + e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }


    @Test
    public void givenMob_Num_When_ProperShouldReturnTrue()
    {
        try {
            validate.validateFirstname.checkifValid("Gaurav");
        }catch (UserValidationException e){
            System.out.println(e.type + " will give message " + e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_FIRST_NAME, e.type);
        }
    }

    @Test
    public void givenFirstName_When_Short_ShouldReturnFalse()
    {
        try {
            validate.validateFirstname.checkifValid("Ga");
        }catch (UserValidationException e){
            System.out.println(e.type + " will give message " + e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_FIRST_NAME, e.type);
        }
    }

    @Test
    public void givenFirstName_have_special_Character_ShouldReturnFalse()
    {
        try {
            validate.validateFirstname.checkifValid("G@urav");
        }catch (UserValidationException e){
            System.out.println(e.type + " will give message " + e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_FIRST_NAME, e.type);
        }
    }
    @Test
    public void givenLastName_When_ProperShouldReturnTrue()
    {
        try {
            validate.validateLastName.checkifValid("Sharma");
        }catch (UserValidationException e){
            System.out.println(e.type + " will give message " + e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_LAST_NAME, e.type);
        }
    }

    @Test
    public void givenLastName_When_Short_ShouldReturnFalse()
    {
        try {
            validate.validateLastName.checkifValid("Sh");
        }catch (UserValidationException e){
            System.out.println(e.type + " will give message " + e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_LAST_NAME, e.type);
        }
    }
    @Test
    public void givenLastName_have_special_Character_ShouldReturnFalse()
    {
        try {
            validate.validateLastName.checkifValid("w@LC@ME");
        }catch (UserValidationException e){
            System.out.println(e.type + " will give message " + e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_LAST_NAME, e.type);
        }
    }

    @Test
    public void givenEmail_if_valid_shouldReturnTrue()
    {
        try {
            validate.validateEmail.checkifValid("abc-100@yahoo.com");
        }catch (UserValidationException e){
            System.out.println(e.type + " will give message " + e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_EMAIL, e.type);
        }
    }
    @Test
    public void givenEmail_starting_with_sp_character_ReturnsFalse()
    {
        try {
            validate.validateEmail.checkifValid(".abc@abc.com");
        }catch (UserValidationException e){
            System.out.println(e.type + " will give message " + e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_EMAIL, e.type);
        }
    }
    @Test
    public void givenEmail_having_multiple_tld_ReturnsFalse()
    {
        try {
            validate.validateEmail.checkifValid("abc@gmail.com.aa.au");
        }catch (UserValidationException e){
            System.out.println(e.type + " will give message " + e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_EMAIL, e.type);
        }
    }
    @Test
    public void givenEmail_having_digit_in_tld_ReturnsFalse()
    {
        try {
            validate.validateEmail.checkifValid("abc12@gmail.com.1a");
        }catch (UserValidationException e){
            System.out.println(e.type + " will give message " + e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_EMAIL, e.type);
        }
    }

    @Test
    public void givenEmail_having_double_At_the_Rate_ReturnsFalse()
    {
        try {
            validate.validateEmail.checkifValid("abc45@abc@gmail.com");
        }catch (UserValidationException e){
            System.out.println(e.type + " will give message " + e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_EMAIL, e.type);
        }
    }
    @Test
    public void givenEmail_having_double_dots_ReturnsFalse()
    {
        try {
            validate.validateEmail.checkifValid("abc..2002@gmail.com");
        }catch (UserValidationException e){
            System.out.println(e.type + " will give message " + e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_EMAIL, e.type);
        }
    }

    @Test
    public void givenEmail_having_less_than_2_character_ReturnsFalse()
    {
        try {
            validate.validateEmail.checkifValid("abc.xyz@gmail.c.i");
        }catch (UserValidationException e){
            System.out.println(e.type + " will give message " + e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_EMAIL, e.type);
        }
    }

    @Test
    public void givenMobileNumber_if_proper_shouldReturnTrue()
    {
        try {
            validate.validateMobileNumber.checkifValid("91 9876543210");
        }catch (UserValidationException e){
            System.out.println(e.type + " will give message " + e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_MOBILE_NUMBER, e.type);
        }
    }

    @Test
    public void givenMobileNumber_if_Improper_shouldReturnFalse()
    {
        try {
            validate.validateMobileNumber.checkifValid("91 98765432103");
        }catch (UserValidationException e){
            System.out.println(e.type + " will give message " + e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_MOBILE_NUMBER, e.type);
        }
    }
    @Test
    public void givenMobileNumber_if_space_not_There_After_Country_Code_shouldReturnFalse()
    {
        try {
            validate.validateMobileNumber.checkifValid("9198765432103");
        }catch (UserValidationException e){
            System.out.println(e.type + " will give message " + e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_MOBILE_NUMBER, e.type);
        }
    }
    @Test
    public void givenMobileNumber_with_Special_characters_shouldReturnFalse()
    {
        try {
            validate.validateMobileNumber.checkifValid("+91 9876543210");
        }catch (UserValidationException e){
            System.out.println(e.type + " will give message " + e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_MOBILE_NUMBER, e.type);
        }
    }
    @Test
    public void givenMobileNumber_if_countryCode_of_min_2_digit_shouldReturnTrue()
    {
        try {
            validate.validateMobileNumber.checkifValid("9 9876543210");
        }catch (UserValidationException e){
            System.out.println(e.type + " will give message " + e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_MOBILE_NUMBER, e.type);
        }
    }
    @Test
    public void givenPassword_if_proper_shouldReturnTrue()
    {
        try {
            validate.validatePassword.checkifValid("G@urav1234.,433'[]");
        }catch (UserValidationException e){
            System.out.println(e.type + " will give message " + e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_PASSWORD, e.type);
        }
    }
    @Test
    public void givenPassword_if_Improper_shouldReturnFalse()
    {
        try {
            validate.validatePassword.checkifValid("Gaur@v1");
        }catch (UserValidationException e){
            System.out.println(e.type + " will give message " + e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_PASSWORD, e.type);
        }
    }

    @Test
    public void givenPassword_with_AtLeast_1_UpperCase_shouldReturnTrue()
    {
        try {
            validate.validatePassword.checkifValid("Bridgelabz@1");
        }catch (UserValidationException e){
            System.out.println(e.type + " will give message " + e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_PASSWORD, e.type);
        }
    }
    @Test
    public void givenPassword_with_No_UpperCase_shouldReturnFalse()
    {
        try {
            validate.validatePassword.checkifValid("bridgelabz");
        }catch (UserValidationException e){
            System.out.println(e.type + " will give message " + e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_PASSWORD, e.type);
        }
    }
    @Test
    public void givenPassword_with_Atleast_1_Numeral_shouldReturnTrue()
    {
        try {
            validate.validatePassword.checkifValid("Gaurav@1234");
        }catch (UserValidationException e){
            System.out.println(e.type + " will give message " + e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_PASSWORD, e.type);
        }
    }
    @Test
    public void givenPassword_without_Numeral_shouldReturnFalse()
    {
        try {
            validate.validatePassword.checkifValid("BRIDGElabz");
        }catch (UserValidationException e){
            System.out.println(e.type + " will give message " + e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_PASSWORD, e.type);
        }
    }

    @Test
    public void givenPassword_with_Exactly_1_Sp_char_shouldReturnTrue()
    {
        try {
            validate.validatePassword.checkifValid("Gaurav@1234");
        }catch (UserValidationException e){
            System.out.println(e.type + " will give message " + e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_PASSWORD, e.type);
        }
    }
    @Test
    public void givenPassword_more_than_1_special_char_shouldReturnFalse()
    {
        try {
            validate.validatePassword.checkifValid("BRID@#$labz");
        }catch (UserValidationException e){
            System.out.println(e.type + " will give message " + e.getMessage());
            Assert.assertEquals(UserValidationException.ExceptionType.INVALID_PASSWORD, e.type);
        }
    }
}
