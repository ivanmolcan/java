package sk.jaroslavbeno.ulohy.uloha1.vynimky;

public class NedostatokMiestaPrePamatoveModuly extends Exception {
    public NedostatokMiestaPrePamatoveModuly() {
        super("Do PC chceš vložiť viac pamatových modulov ako je povolené.");
    }
}
