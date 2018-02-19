package com.codecool.kamilpchelka.checkpoint3.models;

public class Author extends Person {
    private int id;
    private String surname;
    private int birthYear;

    public Author(String name, String city, String country) {
        super(name, city, country);
    }


    public Author() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + ", ID: %d", id);
    }
}
