package sk.jaroslavbeno.ulohy.uloha1;

import sk.jaroslavbeno.ulohy.uloha1.model.Karta;
import sk.jaroslavbeno.ulohy.uloha1.model.Pamat;
import sk.jaroslavbeno.ulohy.uloha1.model.Pc;
import sk.jaroslavbeno.ulohy.uloha1.model.Procesor;
import sk.jaroslavbeno.ulohy.uloha1.model.enumerations.TypKarty;
import sk.jaroslavbeno.ulohy.uloha1.vynimky.NedostatokMiestaPrePamatoveModuly;
import sk.jaroslavbeno.ulohy.uloha1.vynimky.NeparnyPocetPamati;
import sk.jaroslavbeno.ulohy.uloha1.vynimky.PamateNieSuRovnake;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Pc pc = new Pc(2);

        Pamat pamat = new Pamat("1024Mb", "3.5GHz");
        Pamat pamat2 = new Pamat("1024Mb", "3.5GHz");

        Procesor procesor = new Procesor("Intel", "3.5GHz");
        Karta karta = new Karta(TypKarty.GRAFICKA);
        Karta sietova = new Karta(TypKarty.SIETOVA);
        Karta zvukova = new Karta(TypKarty.ZVUKOVA);

        try {
            pc.vlozPamate(pamat,pamat2);
            pc.vlozProcesor(procesor);
            pc.vlozKartu(karta);
            pc.vlozKartu(sietova);
            pc.vlozKartu(zvukova);
        } catch (NedostatokMiestaPrePamatoveModuly nedostatokMiestaPrePamatoveModuly) {
            nedostatokMiestaPrePamatoveModuly.printStackTrace();
        } catch (NeparnyPocetPamati neparnyPocetPamati) {
            neparnyPocetPamati.printStackTrace();
        } catch (PamateNieSuRovnake pamateNieSuRovnake) {
            pamateNieSuRovnake.printStackTrace();
        }




        System.out.println(pc);

    }
}
