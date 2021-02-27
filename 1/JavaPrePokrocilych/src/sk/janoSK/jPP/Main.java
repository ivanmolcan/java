package sk.janoSK.jPP;

import java.rmi.ServerError;

public class Main {
    public static void main(String[] args) {
        System.out.println("5 + 1 = " + Metody.pripocitajJednotku(5));
        System.out.println("6.0 + 1 = " + Metody.pripocitajJednotku(6.0));
        System.out.println("7L + 1 = " + Metody.pripocitajJednotku(7L));
        Integer intII = 9;
        System.out.println("Int 9 + 1 = " + Metody.pripocitajJednotku(intII));
        Double doubleII = intII.doubleValue()+1.0;
        System.out.println("Double 10.0 + 1 = " + Metody.pripocitajJednotku(doubleII));
        Long longII = intII.longValue()+2L;
        System.out.println("Long 11 + 1 = " + Metody.pripocitajJednotku(longII));

        char [] poleZnakov = {'s','m','e','t','i'};
        String mojString = new String (poleZnakov);
        System.out.println(mojString);
        /*
        try {
            System.out.println("Vysledok delenia = " + Metody.vydelTwo(11.5, 0));
        } catch (Exception e) {
            //e.printStackTrace();
            //System.err.println(e.getMessage());
            System.err.println("Vysledok delenia nieje mozne definovat");
        }

        */
        double mojecislo = 15.38;
        System.out.println("Cislo "+mojecislo+" je zaokuhlene na cele nahor: "+Metody.Zaokruhli(mojecislo));
        }
}
