package sk.ada.Ulohy.obyvackaOOP.models;

import sk.ada.Ulohy.obyvackaOOP.enums.Bezpecnost;
import sk.ada.Ulohy.obyvackaOOP.enums.Farba;
import sk.ada.Ulohy.obyvackaOOP.enums.Material;

public interface Dvere {
    void vyskusajDvere(Boolean otvorene, int cislo);
    
    void kupDvere(Farba farba, Material material, Bezpecnost bezpecnost);

    
}
