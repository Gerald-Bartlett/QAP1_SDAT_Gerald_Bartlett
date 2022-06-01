package com.keyin.passwordtest;

import com.keyin.passwordValidater.PasswordValid;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PasswordTest {

    @Test
    @DisplayName("Test Password Length successful ")
    public void TestPasswordLength(){
        PasswordValid passwordValid = new PasswordValid();

        Assertions.assertEquals(true, passwordValid.isValid("Gerald"));
        Assertions.assertEquals(false, passwordValid.isValid("Bob1"));


    }

    @Test
    @DisplayName("Test Password Is UpperCase successful ")
    public void TestPasswordCap() {
        PasswordValid passwordValid = new PasswordValid();
        Assertions.assertEquals(true, passwordValid.isCap("GERALD"));
        Assertions.assertNotEquals(false, passwordValid.isCap("gerald"));
    }

    @Test
    @DisplayName("Test Password Is Blank successful ")
    public void TestPasswordIsBlank() {
        PasswordValid passwordValid = new PasswordValid();
        Assertions.assertEquals(true, passwordValid.isBlank(" "));
        Assertions.assertNotEquals(false, passwordValid.isBlank("Hello"));

    }
}



