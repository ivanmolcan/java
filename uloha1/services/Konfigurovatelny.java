package sk.jaroslavbeno.ulohy.uloha1.services;

import sk.jaroslavbeno.ulohy.uloha1.model.Karta;
import sk.jaroslavbeno.ulohy.uloha1.model.Pamat;
import sk.jaroslavbeno.ulohy.uloha1.model.Pc;
import sk.jaroslavbeno.ulohy.uloha1.model.Procesor;
import sk.jaroslavbeno.ulohy.uloha1.vynimky.NedostatokMiestaPrePamatoveModuly;
import sk.jaroslavbeno.ulohy.uloha1.vynimky.NeparnyPocetPamati;
import sk.jaroslavbeno.ulohy.uloha1.vynimky.PamateNieSuRovnake;

public interface Konfigurovatelny {

    void vlozPamate(Pamat... pamate) throws NedostatokMiestaPrePamatoveModuly, NeparnyPocetPamati, PamateNieSuRovnake;
    void vlozPamat(Pamat pamat);
    void vlozProcesor(Procesor procesor);
    void vlozKartu(Karta karta);
}
