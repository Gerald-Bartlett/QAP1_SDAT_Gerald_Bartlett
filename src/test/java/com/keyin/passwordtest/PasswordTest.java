package com.keyin.passwordtest;

import com.keyin.passwordValidater.PasswordValid;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PasswordTest {

    @Test
    @DisplayName("Test Password Length successful ")
    public void testPasswordLength(){
        PasswordValid passwordValid = new PasswordValid();

        Assertions.assertEquals(true, passwordValid.isValid("Gerald"));
        Assertions.assertFalse(passwordValid.isValid("Bob1"));


    }

    @Test
    @DisplayName("Test Password Is UpperCase successful ")
    public void testPasswordCap() {
        PasswordValid passwordValid = new PasswordValid();
        Assertions.assertEquals(true, passwordValid.isCap("GERALD"));
        Assertions.assertNotEquals(false, passwordValid.isCap("gerald"));
    }

    @Test
    @DisplayName("Test Password Is Blank successful ")
    public void testPasswordIsBlank() {
        PasswordValid passwordValid = new PasswordValid();
        Assertions.assertEquals(true, passwordValid.isBlank(" "));
        Assertions.assertNotEquals(false, passwordValid.isBlank("Hello"));

    }
}



