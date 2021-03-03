package com.techreturners.exercise001;

import java.text.DecimalFormat;
import java.util.List;
import java.util.function.Predicate;

public class Exercise001 {
    public String capitalizeWord(String word) {
        // Add your code here
        String result = word;

        if(word!=null && word.length()>0){
            String firstLetter = word.substring(0,1);
            if(firstLetter.matches("[a-z]")){
                firstLetter = firstLetter.toUpperCase();
                result = firstLetter + word.substring(1);     
            }

        }
        return result;
    }

    public String generateInitials(String firstName, String lastName) {
        // Add your code here
        if(firstName==null || lastName==null){
            throw new NullPointerException();
        }
        String firstLetterFromFirstName = getFirstLetterInUpperCase(firstName);
        String firstLetterFromLastName = getFirstLetterInUpperCase(lastName);
        String SEPARATOR = ".";

        return (firstLetterFromFirstName + 
                SEPARATOR +
                firstLetterFromLastName);
        
    }

    private String getFirstLetterInUpperCase(String word){
        
        if(word.length()>0){
            String firstLetter = word.substring(0, 1);
            if(firstLetter.matches("[a-z]")){
                return firstLetter.toUpperCase();
            }
            return firstLetter;
        }
        return word;

    }

    public double addVat(double originalPrice, double vatRate) { 
        double toAdd = (originalPrice/100.00)*vatRate;
        double priceWithTwoDecimal = Math.floor((originalPrice + toAdd)*100)/100; 
        return priceWithTwoDecimal;
    }

    public String reverse(String sentence) {
        StringBuilder provisionalSentence = new StringBuilder(sentence);
        return provisionalSentence.reverse().toString();
    }

    public int countLinuxUsers(List<User> users) {
        Predicate<User> isLinuxUser = u->u.getType().equals("Linux");
        return (int) users.parallelStream()
                          .filter(isLinuxUser::test)
                          .count();
    }
}
