package com.techreturners.exercise001;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Exercise001Test {

    @Test
    public void checkHello() {
        Exercise001 ex001 = new Exercise001();
        assertEquals("Hello", ex001.capitalizeWord("hello"));
        assertEquals("The quick fox", ex001.capitalizeWord("the quick fox"));
        assertEquals("Oh no, bears!!!", ex001.capitalizeWord("oh no, bears!!!"));
        assertEquals("",ex001.capitalizeWord(""));
        assertEquals("!hola", ex001.capitalizeWord("!hola"));
        assertEquals(null, ex001.capitalizeWord(null));
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

    @Test(expected = NullPointerException.class)
    public void checkInitialsThrowException(){
        Exercise001 ex001 = new Exercise001();
        ex001.generateInitials(null, "Evans");
        ex001.generateInitials("Evans", null);
        ex001.generateInitials(null, null);

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
