package sk.jaroslavbeno.app.biblia.model;

import sk.jaroslavbeno.app.biblia.enums.Zmluva;

import java.util.Arrays;

public class Kniha {
    private String nazov;
    private String skratka;
    private Zmluva zmluva;
    private int poradie;
    private Kapitola[] kapitoly;
    private int pocetKapitol;

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public String getSkratka() {
        return skratka;
    }

    public void setSkratka(String skratka) {
        this.skratka = skratka;
    }

    public Zmluva getZmluva() {
        return zmluva;
    }

    public void setZmluva(Zmluva zmluva) {
        this.zmluva = zmluva;
    }

    public int getPoradie() {
        return poradie;
    }

    public void setPoradie(int poradie) {
        this.poradie = poradie;
    }

    public Kapitola[] getKapitoly() {
        return kapitoly;
    }

    public void setKapitoly(Kapitola[] kapitoly) {
        this.kapitoly = kapitoly;
    }

    public int getPocetKapitol() {
        return pocetKapitol;
    }

    public void setPocetKapitol(int pocetKapitol) {
        this.pocetKapitol = pocetKapitol;
    }

    @Override
    public String toString() {
        return "Kniha{" +
                "nazov='" + nazov + '\'' +
                ", skratka='" + skratka + '\'' +
                ", zmluva=" + zmluva +
                ", poradie=" + poradie +
                ", kapitoly=" + Arrays.toString(kapitoly) +
                ", pocetKapitol=" + pocetKapitol +
                '}';
    }
}

