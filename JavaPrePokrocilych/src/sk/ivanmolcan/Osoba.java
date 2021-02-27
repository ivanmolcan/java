package sk.ivanmolcan;

import sk.ivanmolcan.anotacie.TargetAnotation;

import java.util.Scanner;

@TargetAnotation
public class Osoba<@TargetAnotation T> implements @TargetAnotation Comparable<Osoba>{

    private @TargetAnotation String firstName;
    private String lastName;
    private int age;

    @TargetAnotation
    public Osoba(@TargetAnotation String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = (@TargetAnotation String) lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public static Osoba consoleName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your First name please:");
        String firstName = scanner.nextLine().trim();

        System.out.println("Type your Last name please:");
        String LastName = scanner.nextLine().trim();
        Osoba osoba = new Osoba(firstName, LastName, 25);
        return osoba;
    }

    public static void main(String[] args) {
        Osoba osoba = consoleName();
        System.out.println("--------------------");
        System.out.println(osoba.getFirstName() + " " + osoba.getLastName());
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
    public int compareTo(Osoba o) {
        int porovnaniePriezviska = o.getLastName().compareTo(this.getLastName());
        return porovnaniePriezviska !=0 ? porovnaniePriezviska: o.getFirstName().compareTo(this.getFirstName());
    }
}
