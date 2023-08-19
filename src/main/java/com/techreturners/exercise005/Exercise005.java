package com.techreturners.exercise005;

import java.util.*;

public class Exercise005 {

    public boolean isPangram(String input) {
//            input = input.toLowerCase();
//            List<Character> list = new ArrayList<>();
//        for (int i=0 ; i< input.length(); i++){
//            if (Character.isLetter(input.charAt(i))){
//                list.add(input.charAt(i));
//            }
//        }
//        return list.stream().distinct().count() ==  26;

    return  input.chars().map(Character::toLowerCase).filter(Character::isLetter).distinct().count() ==  26;

    }

}
