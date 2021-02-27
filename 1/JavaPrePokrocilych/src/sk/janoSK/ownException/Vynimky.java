package sk.janoSK.ownException;

public class Vynimky {

    public static void skontrolujCloveka(Clovek c) throws NedostatocnaSumaException {
        skontrolujStavUctu(c);
        skontrolujVek(c);
    }

    public static void skontrolujVek(Clovek c) throws NedostatocnyVekException {
        if (c.vek < 18) {
            throw new NedostatocnyVekException ("Osoba nedosiahla dostatocny vek");
        } else System.out.println("Osoba splna pozadovany vek");
    }

    public static void skontrolujStavUctu(Clovek c) throws NedostatocnaSumaException {
        if (c.stavNaUcte <= 0.0) {
            throw new NedostatocnaSumaException ("Osoba nema kredit");
        } else System.out.println("Osoba ma kredit");
    }


}
