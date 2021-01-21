package com.uccases;

import java.util.regex.Pattern;

public class UserRegistration {

    static final String NAME_PATTERN = "^[A-Z][a-zA-Z]{2,}$";
    static final String EMAIL_PATTERN = "^[0-9a-zA-Z]+([.\\-_+][0-9a-zA-Z]+)*@[a-z0-9A-Z]+.[a-z]{2,4}([.][a-zA-Z]{2,})*$";
    static final String MOBILE_PATTERN = "^91[ ][6-9][0-9]{9}$";
    static final String PASSWORD = "^(?=.[a-z])(?=.[A-Z])(?=.\\\\d)(?=.[@$!%#?&])[A-Za-z\\\\d@#$!%?&]{8,}$";
    public static boolean firstName(String fname) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(fname).matches();
    }


    public static boolean lastName(String lname) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(lname).matches();
    }

    public boolean email(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(email).matches();
    }

    public boolean mobile(String mobile) {
        Pattern pattern = Pattern.compile(MOBILE_PATTERN);
        return pattern.matcher(mobile).matches();
    }

    public boolean password(String password) {
        Pattern pattern = Pattern.compile(PASSWORD);
        return pattern.matcher(password).matches();
    }
}
