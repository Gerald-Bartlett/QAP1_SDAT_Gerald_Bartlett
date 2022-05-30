package com.keyin.passwordtest;

public class PasswordValid {


    public boolean isValid(String Password) {
        if (Password.length() >= 5 && Password.length() <= 10) {
            return true;

        } else
        return false;
    }

    public boolean isCap(String Password){
        if(Password.contains("G") || Password.isBlank());
        return true;
    }

    public boolean isBlank(String Password) {
        return true;
    }
}
