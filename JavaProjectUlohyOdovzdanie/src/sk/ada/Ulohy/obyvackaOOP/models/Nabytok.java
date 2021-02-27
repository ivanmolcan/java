package sk.ada.Ulohy.obyvackaOOP.models;

import sk.ada.Ulohy.obyvackaOOP.enums.Farba;
import sk.ada.Ulohy.obyvackaOOP.enums.Material;


public interface Nabytok {
    
    void kupNabytok(Material material, Farba farba, int velkost);
    void skusNabytok();

    public void getNabytok();
    
}
