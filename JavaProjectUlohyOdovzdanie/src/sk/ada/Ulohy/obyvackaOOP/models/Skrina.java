package sk.ada.Ulohy.obyvackaOOP.models;

import sk.ada.Ulohy.obyvackaOOP.enums.Farba;
import sk.ada.Ulohy.obyvackaOOP.enums.Material;
import sk.ada.Ulohy.obyvackaOOP.services.Service;

public class Skrina implements Nabytok {
    
    private Farba farba;
    private Material material;
    private boolean dvierka;
    private int velkost;
    
    //-------------------------------------------------------------------------

    public Skrina(Farba farba, Material material, int velkost) {
        this.farba = farba;
        this.material = material;
        this.dvierka = dvierka;
        this.velkost = velkost;
    }
    //-------------------------------------------------------------------------
    public Farba getFarba() {
        return farba;
    }

    public Material getMaterial() {
        return material;
    }

    public boolean isDvierka() {
        return dvierka;
    }
    
    //-------------------------------------------------------------------------
    
    @Override
    public void skusNabytok() {
        System.out.println("Pekny a hodi sa mi...");
    }

    @Override
    public void getNabytok() {
        kupNabytok(material, farba, velkost);
    }

    @Override
     public void kupNabytok(Material material, Farba farba, int velkost) {
        Service.kupujemSkrinu(material, farba, velkost);
    }

   
    
}
