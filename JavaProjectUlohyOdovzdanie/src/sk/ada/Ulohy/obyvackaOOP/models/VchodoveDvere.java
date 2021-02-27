package sk.ada.Ulohy.obyvackaOOP.models;

import sk.ada.Ulohy.obyvackaOOP.enums.Bezpecnost;
import sk.ada.Ulohy.obyvackaOOP.enums.Farba;
import sk.ada.Ulohy.obyvackaOOP.enums.Material;
import sk.ada.Ulohy.obyvackaOOP.services.Service;

public class VchodoveDvere implements Dvere {

    @Override
    public void vyskusajDvere(Boolean otvorene, int cisloDo10) {
        Service.otvarajZatvarajDvere(otvorene, cisloDo10);
    }

    
    @Override
    public void kupDvere(Farba farba, Material material, Bezpecnost bezpecnost) {
        System.out.println("Vyrabam dvere s farbou " + farba + " a z materialu: " + material);
        System.out.println("...");
        
        System.out.println(bezpecnost + " dvere su doma.");
    }
    
}
