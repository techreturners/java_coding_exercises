package com.techreturners.exercise001;

import java.util.List;
import java.util.function.Predicate;

public class Exercise001 {

    private static String OPERATING_SYSTEM = "Linux";
    private static String LOWER_CASE_REGULAR_EXPRESION= "[a-z]";
    private static String SEPARATOR = ".";

    public String capitalizeWord(String word) {
        String result = word;

        if(word!=null && word.length()>0){
            String firstLetter = getFirstLetterInUpperCase(word);
            result = firstLetter + word.substring(1);
        }
        return result;
    }

    public String generateInitials(String firstName, String lastName) {
        if(firstName==null || lastName==null){
            throw new NullPointerException();
        }
        String firstLetterFromFirstName = getFirstLetterInUpperCase(firstName);
        String firstLetterFromLastName = getFirstLetterInUpperCase(lastName);
        String separator = SEPARATOR;

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

    public int countLinuxUsersCarmen(List<User> users) {
        Predicate<User> isLinuxUser = u->u.getType().equals(OPERATING_SYSTEM);
        return (int) users.parallelStream()
                          .filter(isLinuxUser::test)
                          .count();
    }

    /*
    Regarding:
    "Your code would be a
    bit cleaner if you just used the values
    in your functions instead", so:"

    Please, Ellie, do you mean to use "Linux" and this way, we won't need
    the global variable OPERATING_SYSTEM?

    If you mean that, the problem is that if you decided to for example use
    "linux" in lower case, you need to modify countLinuxUsers
    Then, having a global variable OPERATING_SYSTEM allows you to modify the code
    without modify the method.

    * */
    public int countLinuxUsers(List<User> users) {
        Predicate<User> isLinuxUser = u->u.getType().equals("Linux");
        return (int) users.parallelStream()
                .filter(isLinuxUser::test)
                .count();
    }
}
