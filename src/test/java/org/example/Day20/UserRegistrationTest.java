package org.example.Day20;

import org.example.Day19.UserRegistration;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class UserRegistrationTest {
    UserRegistration user = new UserRegistration();

    @Test
    public void givenValidEmail_ShouldReturnTrue() {

        boolean result = user.validateEmail("abc@yahoo.com");

        Assertions.assertTrue(result);
    }

    @Test
    public void givenInvalidEmail_ShouldReturnFalse() {

        boolean result = user.validateEmail("abc@.com");

        assertFalse(result);
    }
}