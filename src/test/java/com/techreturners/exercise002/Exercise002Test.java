package com.techreturners.exercise002;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise002Test {

    private Exercise002 ex002;

    @BeforeEach
    void setUp(){
        ex002 = new Exercise002();
    }

    @DisplayName("Check is from Manchester")
    @ParameterizedTest
    @CsvSource({"Peter,Smith,Manchester,23,true",
                "Susan,Farmer,Leeds,23,false"})
    public void checkIsFromManchester(String firstName, String lastName, String city, int age, boolean result) {

        var p = new Person(firstName, lastName, city, age);
        assertEquals(result, ex002.isFromManchester(p));

    }

    @DisplayName("Check can watch the film")
    @ParameterizedTest
    @CsvSource({"18,Peter,Smith,Manchester,17,false",
                "18,Francis,Farmer,Leeds,19,true"})
    public void checkCanWatchFilm(int ageLimit,String firstName, String lastName, String city, int age, boolean result) {
        var p = new Person(firstName, lastName, city, age);
        assertEquals(result, ex002.canWatchFilm(p, ageLimit));
    }
}
