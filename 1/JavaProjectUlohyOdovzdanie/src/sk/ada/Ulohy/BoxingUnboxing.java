/*
    Napíš si program, ktorý bude obsahovať metódy, ktoré budú na vstupe akceptovať 
    a na výstupe vracať nasledovné typy premenných. 
    Metóda zoberie vstupný parameter pripočíta k nemu číslo 1 a vráti výsledok.
*/

package sk.ada.Ulohy;

public class BoxingUnboxing {
    public static void main(String[] args) {
        
        MetodyBoxingUnboxing metody = new MetodyBoxingUnboxing();
        
        metody.vratInteger(5);
        metody.vratDouble(2.5);
        metody.vratLong(159753852);
        
        Integer inter = 1000;
        metody.vratInt(inter);
        
        Double d = 25.55;
        metody.vratDoub(d);
        
        Long l = 159753L;
        System.out.println(l);
    }
}
