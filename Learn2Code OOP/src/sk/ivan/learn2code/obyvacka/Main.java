package sk.ivan.learn2code.obyvacka;

import sk.ivan.learn2code.obyvacka.enums.Material;

public class Main {

    public static void main(String[] args) {

        Dvere dvere = new Dvere(Material.DREVO, "vlavo");
        Okno okno = new Okno(Material.DREVO, "vpravo");
        KuchLinka linka = new KuchLinka(Material.MRAMOR, true, true, false);
        Obyvacka obyv = new Obyvacka();
        obyv.assembleLivingRoom(dvere, okno, linka);
    }

}
