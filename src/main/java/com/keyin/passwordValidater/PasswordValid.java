package com.keyin.passwordValidater;

public class PasswordValid {


    public boolean isValid(String Password) {
        if (Password.length() >= 5 && Password.length() <= 10) {
            return true;

        } else
        return false;
    }

    public boolean isCap(String Password){
        if(Password.contains("GERALD"));
        return true;
    }

    public boolean isBlank(String Password) {
        if(Password.contains(" "));
        return true;
    }
}
