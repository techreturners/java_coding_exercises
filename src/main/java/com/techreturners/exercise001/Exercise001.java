package com.techreturners.exercise001;

import java.util.List;
import java.util.Locale;

public class Exercise001 {
    public String capitalizeWord(String word) {
        String result = word.substring(0, 1).toUpperCase() + word.substring(1);
        return result;
    }

    public String generateInitials(String firstName, String lastName) {
        String firstNameInit = firstName.substring(0, 1);
        String lastNameInit = lastName.substring(0, 1);
        String initials = firstNameInit + "." + lastNameInit;
        return initials;
    }

    public double addVat(double originalPrice, double vatRate) {
        double result = (originalPrice + (originalPrice * vatRate / 100.0d));
        //round to 2 decimal places
        result = (double) Math.round(result * 100.0d) / 100.0d;
        return result;
    }

    public String reverse(String sentence) {
        // Add your code here
        return "";
    }

    public int countLinuxUsers(List<User> users) {
        // Add your code here
        return 0;
    }
}
