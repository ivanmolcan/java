package sk.jaroslavbeno.app.biblia.model;

import java.util.Arrays;

public class Kapitola {
    private int cislo;
    private Vers[] verse;
    private int pocetVersov;

    public int getCislo() {
        return cislo;
    }

    public void setCislo(int cislo) {
        this.cislo = cislo;
    }

    public Vers[] getVerse() {
        return verse;
    }

    public void setVerse(Vers[] verse) {
        this.verse = verse;
    }

    public int getPocetVersov() {
        return pocetVersov;
    }

    public void setPocetVersov(int pocetVersov) {
        this.pocetVersov = pocetVersov;
    }

    @Override
    public String toString() {
        return "Kapitola{" +
                "cislo=" + cislo +
                ", verse=" + Arrays.toString(verse) +
                ", pocetVersov=" + pocetVersov +
                '}';
    }
}
