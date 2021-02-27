package uloha1.model;

import sk.jaroslavbeno.ulohy.uloha1.services.Konfigurovatelny;
import sk.jaroslavbeno.ulohy.uloha1.utils.PcUtils;
import sk.jaroslavbeno.ulohy.uloha1.vynimky.NedostatokMiestaPrePamatoveModuly;
import sk.jaroslavbeno.ulohy.uloha1.vynimky.NeparnyPocetPamati;
import sk.jaroslavbeno.ulohy.uloha1.vynimky.PamateNieSuRovnake;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pc implements Konfigurovatelny {
    private List<Pamat> pamate = new ArrayList<Pamat>();
    private Procesor procesor;
    private List<Karta> karty = new ArrayList<Karta>();

    private int pocetPamati;

    public Pc(int pocetPamati) {
        this.pocetPamati = pocetPamati;
    }

    public List<Pamat> getPamate() {
        return pamate;
    }

    private void setPamate(List<Pamat> pamate) {
        this.pamate = pamate;
    }

    public Procesor getProcesor() {
        return procesor;
    }

    private void setProcesor(Procesor procesor) {
        this.procesor = procesor;
    }

    public List<Karta> getKarty() {
        return karty;
    }

    private void setKarty(List<Karta> karty) {
        this.karty = karty;
    }

    public int getPocetPamati() {
        return pocetPamati;
    }

    @Override
    public String toString() {
        return "Pc{" +
                "pamate=" + pamate +
                ", procesor=" + procesor +
                ", karty=" + karty +
                ", pocetPamati=" + pocetPamati +
                '}';
    }

    @Override
    public void vlozPamate(Pamat... pamate)
            throws NedostatokMiestaPrePamatoveModuly, NeparnyPocetPamati, PamateNieSuRovnake {
        PcUtils.overMoznostVlozenia(this, pamate);
        this.setPamate(Arrays.asList(pamate));
    }


    @Override
    public void vlozPamat(Pamat pamat) {

        // ak v pc jedna pamat tak povol vlozit druhu pamat
        // over ci maju rovnake velkosti

        this.getPamate().add(pamat);
    }

    @Override
    public void vlozProcesor(Procesor procesor) {
        this.setProcesor(procesor);
    }

    @Override
    public void vlozKartu(Karta karta) {
        this.getKarty().add(karta);
    }

}
