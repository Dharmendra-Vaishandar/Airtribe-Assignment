package com.airtribe.studentmanagement.util;

public class InputValidator {
    public static boolean isValidName(String name) {
        return name != null && name.matches("[A-Za-z ]+");
    }
}
