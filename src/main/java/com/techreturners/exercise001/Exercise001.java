package com.techreturners.exercise001;

import java.text.DecimalFormat;
import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {

        return Character.toUpperCase(word.charAt(0))+word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return Character.toUpperCase(firstName.charAt(0))+"."+Character.toUpperCase(lastName.charAt(0));
    }

    public double addVat(double originalPrice, double vatRate) {
        return Double.parseDouble(new DecimalFormat("0.00").format((originalPrice*vatRate)/100 + originalPrice));
    }

    public String reverse(String sentence) {
        return new StringBuilder(sentence).reverse().toString();
    }

    public int countLinuxUsers(List<User> users) {
        int count = 0;
        for (User user : users) {
            //user.getType();

            if (user.getType().equals("Linux") ) {
                count++;
            }

        }
        return count;
    }
}
