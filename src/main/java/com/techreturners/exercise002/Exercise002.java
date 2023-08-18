package com.techreturners.exercise002;

import java.util.Objects;

public class Exercise002 {

    public boolean isFromManchester(Person person) {
        return Objects.equals(person.getCity(), "Manchester");
    }

    public boolean canWatchFilm(/* Person person, int ageLimit*/) {
        // Add your code here
        return false;
    }
    
}
