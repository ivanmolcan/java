package sk.ada.Ulohy.obyvackaOOP.models;

import sk.ada.Ulohy.obyvackaOOP.enums.Farba;
import sk.ada.Ulohy.obyvackaOOP.enums.Material;


public class Skrinka extends Skrina {
    
    private Farba farba;
    private Material material;
    private boolean dvierka;
    private int velkost;
    
    //-------------------------------------------------------------------------

    public Skrinka(Farba farba, Material material, int velkost) {
        super(farba, material, velkost);
        this.farba = farba;
        this.material = material;
        this.dvierka = dvierka;
        this.velkost = velkost;
    }

    //-------------------------------------------------------------------------
    @Override
    public void kupNabytok(Material material, Farba farba, int velkost) {
        super.kupNabytok(material, farba, velkost); 
    }

    @Override
    public void getNabytok() {
        super.getNabytok(); 
    }

    @Override
    public void skusNabytok() {
        super.skusNabytok(); 
    }

    @Override
    public Material getMaterial() {
        return super.getMaterial(); 
    }

    @Override
    public Farba getFarba() {
        return super.getFarba(); 
    }
    
}
