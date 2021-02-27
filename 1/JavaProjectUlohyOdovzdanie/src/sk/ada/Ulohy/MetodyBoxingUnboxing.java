
package sk.ada.Ulohy;

public class MetodyBoxingUnboxing {
    
    /**
     * 1. metóda – vstup: int – výstup: Integer
     * @param cislo 
     */
    public void vratInteger(int cislo){
//        Integer a0 = new Integer(cislo);
        Integer a = cislo;
        System.out.println(a);
    }
    
    /**
     * 2. metóda – vstup: double – výstup: Double
     * @param cislo 
     */
    public void vratDouble (double cislo){
//        Double d0 = new Double(d0);
        Double d = cislo;
        System.out.println(d);
    }
    
    /**
     * 3. metóda – vstup: long – výstup: Long
     * @param cislo 
     */
    public void vratLong(long cislo){
//        Long l0 = new Long(cislo);
        Long l = cislo;
        System.out.println(l);
    }
    
    /**
     * 4. metóda – vstup: Integer – výstup: int
     * @param cislo 
     */
    public void vratInt (Integer cislo){
        int i = cislo;
        System.out.println(i);
    }
    
    /**
     * 5. metóda – vstup: Double – výstup: double
     * @param d 
     */
    public void vratDoub(Double d){
        double d2 = d;
        System.out.println(d2);
    }
    
    /**
     * 5. metóda – vstup: Double – výstup: double
     * @param l 
     */
    public void vratLon(Long l){
        long l1 = l;
        System.out.println(l1);
    }
}
