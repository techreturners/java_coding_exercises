package com.techreturners.exercise001;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.Test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.Assert.assertEquals;
import  org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.provider.MethodSource;


public class Exercise001Test {

    private Exercise001 ex001;

    @BeforeEach
    void setUp(){
        ex001 = new Exercise001();

    }

    @DisplayName("Given a string in lower for example, the word 'hello', " +
                 "then, it will capitalize the first letter h to H, and generate the output Hello")
    @ParameterizedTest
    @CsvSource({
                    "Expected, expected",
                    "Hello, hello",
                    "The quick fox, the quick fox",
                    "'Oh no, bears!!!', 'oh no, bears!!!'",
                    "'',''",
                    "!hola,!hola",
                    ","})
    void checkHello(String expected, String input) {
        Assertions.assertEquals(expected, ex001.capitalizeWord(input));
    }


    @DisplayName("Given a string which its first letter is already upper case, for example 'Hello', " +
                 "then, the first letter won't be modified and word would be 'Hello'")
    @ParameterizedTest
    @CsvSource({
                    "Hello,Hello",
                    "'It was upper case', 'It was upper case'"})
    void checkHelloAlreadyUppercase(String expected, String input) {

        Assertions.assertEquals(expected, ex001.capitalizeWord(input));
    }

    @DisplayName("Given two arguments strings, then, it will get a single string with the first letter ")
    @ParameterizedTest
    @CsvSource({
            "Frederic, Bonneville, F.B",
            "Karl, Marx, K.M",
            "Lewis, Hamilton, L.H",
            "lewis, hamilton, L.H"

    })
    void checkInitials(String name, String surname, String resultedInitials) {
        Assertions.assertEquals(resultedInitials, ex001.generateInitials(name, surname));

    }

    @DisplayName("When introducing a null string, then an exception is throw")
    @ParameterizedTest
    @CsvSource({
                ",Evans",
                "Evans,",
                ","})
    void checkInitialsThrowException(String name, String surname){
        Exception exception = Assertions.assertThrows(NullPointerException.class, ()-> ex001.generateInitials(name,surname));
    }


    @DisplayName("Given two numbers type double, being the base price and VAT, " +
                 "then, it will return a number type double that is the final price")
    @ParameterizedTest
    @CsvSource({
                    "120,100,20,0.0",
                    "47, 40, 17.5,0.0",
                    "39.36,33.5,17.5,0.0",
                    "25,25,0,0.0"
    })
    void checkAddVat(double finalPrice, double basePrice, double vat, double delta) {
        Assertions. assertEquals(finalPrice, ex001.addVat(basePrice,vat),delta);
    }


    @DisplayName("Given a sentence, then, it will reverse it")
    @ParameterizedTest
    @CsvSource({
            "oof,foo",
            "?siht od ot tnaw neve uoy dluow yhw,why would you even want to do this?"
    })
    void checkSentenceReverse(String expected, String input) {
        Assertions.assertEquals(expected,ex001.reverse(input) );
    }

    @DisplayName("Given a list of users, it will return how many linux users are in the list")
    @ParameterizedTest
    @MethodSource("generateDataCheckLinuxUsers")
    void testCheckLinuxUsers(List<User> usersList, int numberOfLinuxUsers) {

        assertEquals(numberOfLinuxUsers,ex001.countLinuxUsers(usersList));


    }

    static Stream<Arguments> generateDataCheckLinuxUsers() {

        var u1 = new User("Heather", "Windows 10", "Windows");
        var u2 = new User("Paul", "Windows 95", "Windows");
        var u3 = new User("Sheila", "CentOS 7", "Linux");
        var u4 = new User("Pedro", "Ubuntu 18.04", "Linux");

        return Stream.of(
                Arguments.arguments(Arrays.asList(u1,u2),0),
                Arguments.arguments (Arrays.asList(u1,u2,u3,u4), 2)

        );
    }
}
