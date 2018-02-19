package model;

public class Author {

    private int author_id;
    private String name;
    private String surname;
    private String birthYear;
    private String city;
    private String country;

    public Author(
            int author_id,
            String name,
            String surname,
            String birthYear,
            String city,
            String country) {

        this.author_id = author_id;
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.city = city;
        this.country = country;
    }
}
