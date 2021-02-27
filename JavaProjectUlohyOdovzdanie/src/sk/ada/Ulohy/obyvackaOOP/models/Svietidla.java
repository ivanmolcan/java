package sk.ada.Ulohy.obyvackaOOP.models;


public abstract class Svietidla {
    private boolean ziarovka;
    int vyska;
    private String farba;
    
    //-------------------------------------------------

    public Svietidla(boolean ziarovka, int vyska, String farba) {
        this.ziarovka = ziarovka;
        this.vyska = vyska;
        this.farba = farba;
    }
       
    //-------------------------------------------------

    boolean isZiarovka() {
        return ziarovka;
    }

    private int getVyska() {
        return vyska;
    }

    private String getFarba() {
        return farba;
    }
        
    //-------------------------------------------------
    public abstract void zapniSvetlo();
    public abstract void zmestiSa();
    
    
}
