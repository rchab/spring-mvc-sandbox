package com.springapp.mvc.entity;

public class Person {
    private String firstName;
    private String surname;

    public Person() {
    }

    public Person(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    @Override
    public String toString() {
        return "Name " + firstName + ", Surname " + surname;
    }
}
