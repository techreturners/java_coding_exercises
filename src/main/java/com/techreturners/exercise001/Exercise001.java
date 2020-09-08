package com.techreturners.exercise001;

import java.util.List;
import java.lang.Math;


public class Exercise001 {
    public String capitalizeWord(final String word) {
        final String cap = word.substring(0, 1).toUpperCase() + word.substring(1);
        return cap;
    }

    public String generateInitials(final String firstName, final String lastName) {
        final String initials = firstName.substring(0, 1).toUpperCase() + "." + lastName.substring(0, 1).toUpperCase();
        return initials;
    }

    public double addVat(final double originalPrice, final double vatRate) {
        final double finalPrice = originalPrice + originalPrice * vatRate / 100;
        return Math.floor(finalPrice*100)/100;
    }

    public String reverse(final String sentence) {
        char[] tempArray = sentence.toCharArray();
        int left, right = 0;
        right = tempArray.length - 1;

        for(left = 0; left < right; left++, right--){
            char temp = tempArray[left];
            tempArray[left] = tempArray[right];
            tempArray[right] = temp;
        }

        String str = new String(tempArray);
        return str;
    }

    public int countLinuxUsers(final List<User> users) {
        int occurrences = 0;
        
        for(User user : users){
            if(user.getType().equals("Linux")){
                occurrences++;
            }
        }
        return occurrences;
    }
}
