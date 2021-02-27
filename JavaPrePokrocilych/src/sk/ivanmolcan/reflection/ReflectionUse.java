package sk.ivanmolcan.reflection;

import sk.ivanmolcan.Osoba;

public class ReflectionUse {

    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = "Jaro".getClass();

        Osoba o = new Osoba("Jaro", "Beno", 30);
        clazz = o.getClass();

        clazz = Osoba.class;
        clazz = String.class;

        clazz = Class.forName("sk.ivanmolcan.Osoba");


    }
}
