package com.techreturners.exercise002;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Exercise002Test {

    @Test
    public void checkIsFromManchester() {
        Exercise002 ex002 = new Exercise002();

        Person p1 = new Person("Peter", "Smith", "Manchester", 23);
        Person p2 = new Person("Susan", "Farmer", "Leeds", 23);

        assertEquals(true, ex002.isFromManchester(p1));
        assertEquals(false, ex002.isFromManchester(p2));
    }

    @Test
    public void checkCanWatchFilm() {
        Exercise002 ex002 = new Exercise002();

        Person p1 = new Person("Peter", "Smith", "Manchester", 17);
        Person p2 = new Person("Francis", "Farmer", "Leeds", 18);

        assertEquals(false, ex002.canWatchFilm(p1, 18));
        assertEquals(true, ex002.canWatchFilm(p2, 18));
    }
}
