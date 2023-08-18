package com.techreturners.exercise002;

public class Person {
    private String firstName;
    private String lastName;
    private String city;
    private int age;
    public Person (String firstName, String lastName, String city, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.age = age;

    }

    public String getCity(){
        return this.city;
    }

}
