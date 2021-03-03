package com.techreturners.exercise002;

public class Exercise002 {

    private String MANCHESTER = "Manchester";

    public boolean isFromManchester(Person person) {
        return person.getCity().equals(MANCHESTER);
    }

    public boolean canWatchFilm(Person person, int ageLimit) {
        return person.getAge()>=ageLimit;
    }
    
}
