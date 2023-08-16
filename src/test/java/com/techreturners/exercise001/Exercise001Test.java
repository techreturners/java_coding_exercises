package com.techreturners.exercise001;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;


public class Exercise001Test {

    @Test
    public void checkHello() {
        Exercise001 ex001 = new Exercise001();
        assertEquals("Hello", ex001.capitalizeWord("hello"));
        assertEquals("The quick fox", ex001.capitalizeWord("the quick fox"));
        assertEquals("Oh no, bears!!!", ex001.capitalizeWord("oh no, bears!!!"));
    }

    @Test
    public void checkHelloAlreadyUppercase() {
        Exercise001 ex001 = new Exercise001();
        assertEquals("Hello", ex001.capitalizeWord("Hello"));
    }

    @Test
    public void checkInitials() {
        Exercise001 ex001 = new Exercise001();
        assertEquals("F.B", ex001.generateInitials("Frederic", "Bonneville"));
        assertEquals("K.M", ex001.generateInitials("Karl", "Marx"));
        assertEquals("L.H", ex001.generateInitials("Lewis", "Hamilton"));
    }

    @Test
    public void checkAddVat() {
        Exercise001 ex001 = new Exercise001();
        assertEquals(120, ex001.addVat(100, 20), 0.0);
        assertEquals(47, ex001.addVat(40, 17.5), 0.0);
        assertEquals(39.36, ex001.addVat(33.5, 17.5), 0.0);
        assertEquals(25, ex001.addVat(25, 0), 0.0);
    }

    @Test
    public void checkSentenceReverse() {
        Exercise001 ex001 = new Exercise001();
        assertEquals("oof", ex001.reverse("foo"));
        assertEquals("?siht od ot tnaw neve uoy dluow yhw", ex001.reverse("why would you even want to do this?"));
    }

    @Test
    public void checkLinuxUsers() {
        Exercise001 ex001 = new Exercise001();
        User u1 = new User("Heather", "Windows 10", "Windows");
        User u2 = new User("Paul", "Windows 95", "Windows");
        User u3 = new User("Sheila", "CentOS 7", "Linux");
        User u4 = new User("Pedro", "Ubuntu 18.04", "Linux");


        List<User> users = new ArrayList<User>();
        users.add(u1);
        users.add(u2);
        assertEquals(0, ex001.countLinuxUsers(users));

        users = new ArrayList<User>();
        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
        assertEquals(2, ex001.countLinuxUsers(users));
    }

}
