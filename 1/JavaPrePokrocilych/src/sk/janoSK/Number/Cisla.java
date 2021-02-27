package sk.janoSK.Number;

public class Cisla {

    static void PracaSCislami(Number cislo){
        //if (cislo.intValue())
        if(cislo instanceof Integer) {System.out.println((Integer) cislo*10);}
        if(cislo instanceof Double) {System.out.println((Double) cislo*10);}
    }
}
