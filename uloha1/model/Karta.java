package sk.jaroslavbeno.ulohy.uloha1.model;

import sk.jaroslavbeno.ulohy.uloha1.model.enumerations.TypKarty;

public class Karta {
    private TypKarty typKarty;

    public Karta(TypKarty typKarty) {
        this.typKarty = typKarty;
    }

    public TypKarty getTypKarty() {
        return typKarty;
    }

    @Override
    public String toString() {
        return "Karta{" +
                "typKarty=" + typKarty +
                '}';
    }
}
