package com.techreturners.exercise001;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        String capitalisedLetter = word.substring(0,1).toUpperCase();

        return capitalisedLetter + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return firstName.charAt(0) + "." + lastName.charAt(0);
    }

    public double addVat(double originalPrice, double vatRate) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        double vatPercentage = (vatRate * 10 + 1000) / 1000;
        double finalPrice = originalPrice * vatPercentage;

        return Double.parseDouble(decimalFormat.format(finalPrice));
    }

    public String reverse(String sentence) {
        char[] charArray = sentence.toCharArray();
        StringBuilder reversedSentence = new StringBuilder();

        // Arrays are zero-indexed so as long as index is 0 or greater
        // continue to iterate and append the item at index to the reversedSentence
        // StringBuilder
        for (int i = charArray.length - 1; i >= 0; i--) {
            reversedSentence.append(charArray[i]);
        }

        return reversedSentence.toString();
    }

    public int countLinuxUsers(List<User> users) {
        int userCount = 0;

        for (User user : users) {
            if(user.getType().equalsIgnoreCase("linux")) {
                userCount++;
            }
        }
        return userCount;
    }
}
