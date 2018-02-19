package com.codecool.kamilpchelka.checkpoint3.models;

public class Publisher extends Person {

    private String id;


    public Publisher(String id) {
        this.id = id;
    }

    public Publisher(String name, String city, String country, String id) {
        super(name, city, country);
        this.id = id;
    }

    public Publisher() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + ", ID: %s", id);
    }
}
