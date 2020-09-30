package com.uservalidation;

import org.junit.BeforeClass;

public class userValidationTest {

    @BeforeClass
    public static void beforeClass() throws Exception {
        UserValidation validate = new UserValidation();
        validate.printWelcomeMessage();

    }
}
