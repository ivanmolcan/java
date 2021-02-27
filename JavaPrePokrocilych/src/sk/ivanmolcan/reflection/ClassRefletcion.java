package sk.ivanmolcan.reflection;

import sk.ivanmolcan.Osoba;

import java.io.PrintStream;
import java.lang.reflect.*;

public class ClassRefletcion {

    static PrintStream out = System.out;

    public static void main(String[] args) {
        Class<?> c = Osoba.class;
        out.format("Class:%n  %s%n%n", c.getCanonicalName());

        Package p = c.getPackage();
        out.format("Package:%n %s%n%n",
                (p != null ? p.getName() : "--No Package--"));

//        out.format(c.getConstructors());
    }
}
