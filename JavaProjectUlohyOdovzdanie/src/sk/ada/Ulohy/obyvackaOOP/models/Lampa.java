package sk.ada.Ulohy.obyvackaOOP.models;


public class Lampa extends Svietidla {

    public Lampa(boolean ziarovka, int vyska, String farba) {
        super(ziarovka, vyska, farba);
    }
    
    //----------------------------------------------------
    @Override
    public void zapniSvetlo() {
        if (super.isZiarovka()){
            System.out.println("Zapinam svetlo");
        } else {
            System.out.println("Nemam ziarovku");
        }
    }

    @Override
    public void zmestiSa() {
        if (super.vyska <= 260){
            System.out.println("Lampa sa na vysku pokojne zmesti");
        } else {
            System.out.println("Ejha! Toto na vysku nedame...");
        }
    }
    
}
