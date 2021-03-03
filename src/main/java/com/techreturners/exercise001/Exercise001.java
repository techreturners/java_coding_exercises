package com.techreturners.exercise001;

import java.util.List;
import java.util.function.Predicate;

public class Exercise001 {

    private static String LINUX = "Linux";
    private static String LOWER_CASE_REGULAR_EXPRESION= "[a-z]";
    private static String DOT = ".";

    public String capitalizeWord(String word) {
        String result = word;

        if(word!=null && word.length()>0){
            String firstLetter = word.substring(0,1);
            if(firstLetter.matches(LOWER_CASE_REGULAR_EXPRESION)){
                firstLetter = firstLetter.toUpperCase();
                result = firstLetter + word.substring(1);     
            }

        }
        return result;
    }

    public String generateInitials(String firstName, String lastName) {
        if(firstName==null || lastName==null){
            throw new NullPointerException();
        }
        String firstLetterFromFirstName = getFirstLetterInUpperCase(firstName);
        String firstLetterFromLastName = getFirstLetterInUpperCase(lastName);
        String separator = DOT;

        return (firstLetterFromFirstName + 
                separator +
                firstLetterFromLastName);
        
    }

    private String getFirstLetterInUpperCase(String word){
        if(word.length()>0){
            String firstLetter = word.substring(0, 1);
            if(firstLetter.matches(LOWER_CASE_REGULAR_EXPRESION)){
                return firstLetter.toUpperCase();
            }
            return firstLetter;
        }
        return word;

    }

    public double addVat(double originalPrice, double vatRate) { 
        double toAdd = (originalPrice/100.00)*vatRate;
        double priceWithVat = (originalPrice + toAdd);
        return getDoubleWithTwoDecimals(priceWithVat);
    }

    private double getDoubleWithTwoDecimals(double number){
        return  Math.floor(number*100)/100;
    }

    public String reverse(String sentence) {
        StringBuilder provisionalSentence = new StringBuilder(sentence);
        return provisionalSentence.reverse().toString();
    }

    public int countLinuxUsers(List<User> users) {
        Predicate<User> isLinuxUser = u->u.getType().equals(LINUX);
        return (int) users.parallelStream()
                          .filter(isLinuxUser::test)
                          .count();
    }
}
