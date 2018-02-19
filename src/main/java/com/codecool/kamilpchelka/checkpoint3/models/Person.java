package com.codecool.kamilpchelka.checkpoint3.models;

public class Person {

    private String name;
    private String city;
    private String country;

    public Person() {
    }

    public Person(String name, String city, String country) {
        this.name = name;
        this.city = city;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, City: %s, Country: %s", name, city, country);
    }
}
