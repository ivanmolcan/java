/*
    Napíš si metódu, ktorá na vstupe bude prijímať premennú typu Number. 
    Potom si túto metódu zavolaj dvakrát a vlož do nej raz int a raz Double. 
    Vo vnútri metódy vynásob toto číslo 10timi a vypíš na konzolu. 
    Naučíš sa ako pracovať s rôznymi typmi údajov. 
    Úloha je kus náročnejšia. Možno budeš potrebovať pretypovanie a instanceof.
*/

package sk.ada.Ulohy;


public class Number {
    public static void main(String[] args) {
        
        String c1 = "11";
        String c2 = "14.941";
        callNumber(c1);
        callNumber(c2);
        
        c1 = "115";
        c2 = "78.998";
        callNumber(c1);
        callNumber(c2);
        
        c1 = "1595";
        c2 = "1.7965";
        callNumber(c1);
        callNumber(c2);
    }

    private static void callNumber(String c) {
                
        if (c.contains(".")){
            double d = Double.parseDouble(c) * 10;
            System.out.println(d);
        } else {
            int i = Integer.parseInt(c) * 10;
            System.out.println(i);
        }
         
    }
    
    
    
}
