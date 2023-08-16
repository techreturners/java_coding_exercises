package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        // Add your code here
        String s = word.substring(0, 1).toUpperCase() + word.substring(1);
        return s;
    }

    public String generateInitials(String firstName, String lastName) {
        return firstName.charAt(0) + "." + lastName.charAt(0);
    }

    public double addVat(double originalPrice, double vatRate) {
        // Add your code here
        double newPrice = originalPrice * (1.0 + vatRate / 100.0);
        int    roundedPrice100 = (int)Math.round(newPrice*100);
        double roundedPrice = roundedPrice100 / 100.0;
        return roundedPrice;
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
