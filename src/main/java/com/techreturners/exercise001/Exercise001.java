package com.techreturners.exercise001;

import java.util.List;
import java.util.function.Predicate;

public class Exercise001 {

    private static String OPERATING_SYSTEM = "Linux";
    private static String LOWER_CASE_REGULAR_EXPRESION= "[a-z]";
    private static String SEPARATOR = ".";

    public String capitalizeWord(String originialWord) {
        if(originialWord!=null && originialWord.length()>0){
            String firstLetter = originialWord.substring(0, 1);
            if(firstLetter.matches(LOWER_CASE_REGULAR_EXPRESION)){
                String capitalizedWord = firstLetter.toUpperCase() + originialWord.substring(1);
                return capitalizedWord;
            }
            return originialWord;
        }
        return originialWord;
    }

    public String generateInitials(String firstName, String lastName) {
        if(firstName==null || lastName==null){
            throw new NullPointerException();
        }
        String firstLetterFromFirstName = capitalizeWord(firstName).substring(0,1);
        String firstLetterFromLastName = capitalizeWord(lastName).substring(0,1);
        String separator = SEPARATOR;

        return (firstLetterFromFirstName + 
                separator +
                firstLetterFromLastName);
        
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

    public int countLinuxUsersCarmen(List<User> users) {
        Predicate<User> isLinuxUser = u->u.getType().equals(OPERATING_SYSTEM);
        return (int) users.parallelStream()
                          .filter(isLinuxUser::test)
                          .count();
    }

    public int countLinuxUsers(List<User> users) {
        Predicate<User> isLinuxUser = u->u.getType().equals("Linux");
        return (int) users.parallelStream()
                .filter(isLinuxUser::test)
                .count();
    }
}
