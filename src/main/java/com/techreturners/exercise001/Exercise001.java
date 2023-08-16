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
        String words[] = sentence.split(" ");
        String result = "";

        int wordCount = words.length;

        for (int i=wordCount-1; i>=0; i--) {
            String reversed = "";
            String aWord = " " + words[i];  // Add space so that words are
                                            // separated in result

            for (int j=0; j<aWord.length(); j++) {
                reversed = aWord.charAt(j) + reversed;
            }
            result = result + reversed;
            System.out.println(i);
        }
        result = result.substring(0, result.length()-1); // Strip off final space
        return result;
    }

    public int countLinuxUsers(List<User> users) {
        // Add your code here
        return 0;
    }
}
