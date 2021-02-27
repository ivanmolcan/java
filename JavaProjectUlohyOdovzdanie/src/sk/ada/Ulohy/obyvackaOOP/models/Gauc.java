package sk.ada.Ulohy.obyvackaOOP.models;

import sk.ada.Ulohy.obyvackaOOP.enums.Farba;
import sk.ada.Ulohy.obyvackaOOP.enums.Material;
import sk.ada.Ulohy.obyvackaOOP.services.Service;


public class Gauc implements Nabytok {

    private Material material;
    private Farba farba;
    private int velkost;
    //-----------------------------------------------------------

    public Gauc(Material material, Farba farba, int velkost) {
        this.material = material;
        this.farba = farba;
        this.velkost = velkost;
    }
    
    //-----------------------------------------------------------
    public Material getMaterial() {
        return material;
    }

    public Farba getFarba() {
        return farba;
    }

    public int getVelkost() {
        return velkost;
    }
    
    public void getNabytok(){
        kupNabytok(material, farba, velkost);
    }
    //-----------------------------------------------------------
    

    @Override
    public void kupNabytok(Material material, Farba farba, int velkost) {
        Service.kupujemNabytok(material, farba, velkost);
    }

    @Override
    public void skusNabytok() {
        Service.skusamNabytok(this.velkost);
    }
    
    
    
    
    
}
