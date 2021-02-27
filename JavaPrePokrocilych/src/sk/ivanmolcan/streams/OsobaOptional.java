package sk.ivanmolcan.streams;

import java.util.Optional;

public class OsobaOptional implements Comparable<OsobaOptional> {
    private String firstName;
    private Optional<String> lastName;
    private int age;

    public OsobaOptional(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = Optional.ofNullable(lastName);
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public Optional<String> getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(OsobaOptional o) {
        int porovnaniePriezviska = o.getLastName().orElse("").compareTo(this.getLastName().orElse(""));
        return porovnaniePriezviska !=0 ? porovnaniePriezviska: o.getFirstName().compareTo(this.getFirstName());
    }
}
