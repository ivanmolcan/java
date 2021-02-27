package sk.jaroslavbeno.ulohy.uloha1.vynimky;

public class NeparnyPocetPamati extends Exception {
    public NeparnyPocetPamati() {
        super("Do PC chceš vložiť neparny počet pamati ak je viac ako 1 pamat.");
    }
}
