package sk.janoSK.jPP;

import static java.lang.Math.*;

public class Metody {

    static Integer pripocitajJednotku(int cislo){
        cislo += 1;
        return cislo;
    }

    static Double pripocitajJednotku(double cislo){
        cislo += 1.0;
        return cislo;
    }

    static Long pripocitajJednotku(long cislo){
        cislo += 1L;
        return cislo;
    }

    static int pripocitajJednotku(Integer cislo){
        return cislo.intValue() + 1;
    }

    static double pripocitajJednotku(Double cislo){
        return cislo.doubleValue() + 1.0;
    }

    static long pripocitajJednotku(Long cislo){
        return cislo.longValue() + 1L;
    }

    static double vydelTwo(double a, double b) throws Exception {
        if (b==0) throw new Exception("Nieje mozne delit 0");
        return a/b;
    }

    static double Zaokruhli (double cislo){
        return ceil(cislo);
    }
}
