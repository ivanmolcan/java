package sk.jaroslavbeno.ulohy.uloha1.utils;

import sk.jaroslavbeno.ulohy.uloha1.model.Pamat;
import sk.jaroslavbeno.ulohy.uloha1.model.Pc;
import sk.jaroslavbeno.ulohy.uloha1.vynimky.NedostatokMiestaPrePamatoveModuly;
import sk.jaroslavbeno.ulohy.uloha1.vynimky.NeparnyPocetPamati;
import sk.jaroslavbeno.ulohy.uloha1.vynimky.PamateNieSuRovnake;

public class PcUtils {
    public static void overMoznostVlozenia(Pc pc, Pamat[] pamate) throws NedostatokMiestaPrePamatoveModuly, NeparnyPocetPamati, PamateNieSuRovnake {
        int pocetPamati = pamate.length;
        if(pc.getPocetPamati() < pocetPamati){
            throw new NedostatokMiestaPrePamatoveModuly();
        }

        if(pocetPamati > 1){
            if(pocetPamati % 2 != 0){
                throw new NeparnyPocetPamati();
            }
        }

        String velkostPamate = null;
        for (Pamat pamat : pamate){
            if(velkostPamate == null){
                velkostPamate = pamat.getVelkost();
            }else{
                if(!velkostPamate.equals(pamat.getVelkost())){
                    throw new PamateNieSuRovnake();
                }
            }
        }
    }

}
