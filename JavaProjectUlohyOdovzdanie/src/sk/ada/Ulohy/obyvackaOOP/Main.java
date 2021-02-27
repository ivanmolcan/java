package sk.ada.Ulohy.obyvackaOOP;

import sk.ada.Ulohy.obyvackaOOP.enums.Bezpecnost;
import sk.ada.Ulohy.obyvackaOOP.enums.Farba;
import sk.ada.Ulohy.obyvackaOOP.enums.Material;
import sk.ada.Ulohy.obyvackaOOP.models.Dvere;
import sk.ada.Ulohy.obyvackaOOP.models.DvereObyvacka;
import sk.ada.Ulohy.obyvackaOOP.models.Gauc;
import sk.ada.Ulohy.obyvackaOOP.models.Lampa;
import sk.ada.Ulohy.obyvackaOOP.models.Nabytok;
import sk.ada.Ulohy.obyvackaOOP.models.Skrina;
import sk.ada.Ulohy.obyvackaOOP.models.Skrinka;
import sk.ada.Ulohy.obyvackaOOP.models.Svietidla;
import sk.ada.Ulohy.obyvackaOOP.models.VchodoveDvere;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dvere dvere = new DvereObyvacka();
        dvere.kupDvere(Farba.CIERNA, Material.DREVO, Bezpecnost.JEDNODUCHE);
        dvere.vyskusajDvere(Boolean.FALSE, 8);
        
        Dvere dvere2 = new VchodoveDvere();
        dvere2.kupDvere(Farba.BIELA, Material.DREVO, Bezpecnost.BEZPECNOSTNE);
        
        System.out.println("");
        Nabytok gauc = new Gauc(Material.KOZA, Farba.BLEDOHNEDA, 5);
        Nabytok gauc2 = new Gauc(Material.KOZA, Farba.BLEDOHNEDA, 1);
        gauc.getNabytok();
        gauc2.getNabytok();
        gauc.skusNabytok();
        gauc2.skusNabytok();
        
        System.out.println("");
        Nabytok skrina = new Skrina (Farba.BIELA,Material.DREVO,12);
        skrina.getNabytok();
        skrina.skusNabytok();
        
        System.out.println("");
        Nabytok skrinka = new Skrinka(Farba.CIERNA, Material.SKLO, 1);
        skrinka.getNabytok();
        skrinka.skusNabytok();
        
        System.out.println("");
        Svietidla lampa = new Lampa(Boolean.FALSE, 15, "tepla");
        Svietidla lampa2 = new Lampa(Boolean.TRUE, 261, "tepla");
        lampa.zapniSvetlo();
        lampa.zmestiSa();
        
        lampa2.zapniSvetlo();
        lampa2.zmestiSa();
        
        
    }
    
}
