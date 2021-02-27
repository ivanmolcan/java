
package sk.ada.Ulohy.obyvackaOOP.services;

import sk.ada.Ulohy.obyvackaOOP.enums.Farba;
import sk.ada.Ulohy.obyvackaOOP.enums.Material;


public class Service {

    private static int cislo;
    //-------------------------------------------------------------------------
     private static void nahodneCislo(int cisloDo10){
        int nahodeCislo = Math.round((int) (Math.random() * 10));
        
        if (nahodeCislo > 10){
            nahodneCislo(cisloDo10);
        }     
        
         if (nahodeCislo == cisloDo10){
             System.out.println("Hup... nieco s nimi nie je v poriadku.");
             System.out.println(nahodeCislo);
         }
    }
    
    //-------------------------------------------------------------------------
     public static void otvarajZatvarajDvere(Boolean otvorene, int cisloDo10){
         if (otvorene){
            System.out.println("Zatvaram ich.");
        } else {
            System.out.println("Otvaram dvere.");
        }
        
         Service.nahodneCislo(cisloDo10);
     }
     
    //-------------------------------------------------------------------------
     public static void kupujemNabytok(Material material, Farba farba, int velkost) {
        System.out.println("Kupujem sedacku z materialu " + material.toString().toLowerCase() +
                " farba " + farba.toString().toLowerCase() + " s pocetom sedakov " + velkost);
    }
     
     public static void kupujemSkrinu(Material material, Farba farba, int velkost) {
        System.out.println("Kupujem skrinu z materialu " + material.toString().toLowerCase() +
                " farba " + farba.toString().toLowerCase() + " s poctom policiek " + velkost);
        
    }
      //-------------------------------------------------------------------------

    public static void skusamNabytok(int velkost) {
        System.out.println("Sadam si na gauc...");
        
        
        if (velkost > 1) {
        nahodneCislo2(velkost);
            System.out.println("Konkretne na sedadlo c. " + getCislo());
        } else {
            System.out.println("Sedim na gauci");
        }
        
    }
     
    //-------------------------------------------------------------------------
    private static int nahodneCislo2(int velkost){
        cislo = Math.round((int) (Math.random() * 10));
        
        if (cislo >= velkost || cislo <= 0) {
            nahodneCislo2(velkost);
        }
        
               
        return cislo;         
    }
    //-------------------------------------------------------------------------

    private static int getCislo() {
        return cislo;
    }
    
    
}

