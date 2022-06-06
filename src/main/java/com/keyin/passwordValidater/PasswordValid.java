package com.keyin.passwordValidater;

public class PasswordValid {


    public boolean isValid(String Password) {
        if (Password.length() >= 5 && Password.length() <= 10) {
            return true;

        } else
            return false;
    }

    public boolean isCap(String Password) {
        boolean returnValue = false;
        if (Password.contains("GERALD")) {
            returnValue = true;
        }
        return returnValue;
    }

    public boolean isBlank(String Password) {
            boolean returnValue = false;

        if(Password.contains(" ")){
        returnValue = true;
    }
        return returnValue;
}
}