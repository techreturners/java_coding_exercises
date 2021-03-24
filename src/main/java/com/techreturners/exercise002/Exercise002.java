package com.techreturners.exercise002;

public class Exercise002 {

    private String CITY  = "Manchester";

    public boolean isFromManchester(Person person) {
        return person.getCity().equals(CITY );
    }

    public boolean canWatchFilm(Person person, int ageLimit) {
        return person.getAge()>=ageLimit;
    }
    
}
