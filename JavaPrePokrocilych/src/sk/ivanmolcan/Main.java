package sk.ivanmolcan;

import sk.ivanmolcan.regex.RegularExpressions;
import sk.ivanmolcan.zoo.Pes;

public class Main {

    static void putNumber(Number i){
        if(i instanceof Integer){
            System.out.println("Cislo Integer je: " + (int)i*10);
        }
        if(i instanceof Double) {
            System.out.println("Cislo je double: " + (double)i*10);
        }
    }

    static void modulo(){
        for(int i=0; i<10; i++){
            int d = i%8;
            System.out.println("Karta hracovi " + d + " karta cislo " + i);
        }
    }

    public static void main(String[] args) {
//        Pes pes1 = new Pes("Rexo", 4);
//        sk.ivanmolcan.zviera.Pes pes2 = new sk.ivanmolcan.zviera.Pes("Dunco", 4);

//        System.out.println(Integer.MIN_VALUE);

//        putNumber(5);
//        System.out.println();
//        putNumber(2.5544);

        System.out.println();
//        modulo();

        System.out.println(Math.abs(-196));
        System.out.println(Math.min(43, 5));
        System.out.println((int)(Math.random() * 11));
        System.out.println(Math.PI);

    }

}
