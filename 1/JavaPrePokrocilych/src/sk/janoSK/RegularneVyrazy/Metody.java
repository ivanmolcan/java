package sk.janoSK.RegularneVyrazy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Metody {

    public static String skontrolujEmail(String str) {
        //Metóda overí, či je email v správnom formáte. Metóda vráti true ak áno inak false.
        //pattern 1.nie cislo, potom slovo, zavinac, slovo, bodka, slovo
        Pattern p = Pattern.compile("\\D\\w+@\\w+\\.\\w+");
        Matcher m = p.matcher(str);
        if(m.matches()){
            return "Email je v poriadku";
        } else return "Email nevyhovuje";
    }

    public static String skontrolujHeslo(String str) {
        //Ma vstupe metódy bude heslo. Metóda preverí či heslo spĺňa nasledovné kritéria:
        //minimálne 8 znakov
        //musí obsahovať aspoň jedno veľké písmeno
        //musí obsahovať aspoň jedno číslo
        Pattern p1 = Pattern.compile("[0-9]+");
        Pattern p2 = Pattern.compile("[A-Z]+");
        Matcher m1 = p1.matcher(str);
        Matcher m2 = p2.matcher(str);
        if(m1.find() && m2.find() && str.length()>7){
            return "Heslo je v poriadku";
        } else return "Heslo nevyhovuje";
    }

    public static String skontrolujFormatObrazku(String str) {
        //Napíš metódu, ktorá overí, či daný String je obrázok = koncovka je jedna
        // z nasledujúcich: .jpg, .png, .jpeg, .bmp

        String str1 = str.substring(str.lastIndexOf("."),str.length());

        Pattern p1 = Pattern.compile(".jpg");
        Pattern p2 = Pattern.compile(".jpeg");
        Pattern p3 = Pattern.compile(".png");
        Pattern p4 = Pattern.compile(".bmp");
        Matcher m1 = p1.matcher(str1);
        Matcher m2 = p2.matcher(str1);
        Matcher m3 = p3.matcher(str1);
        Matcher m4 = p4.matcher(str1);
        if(m1.matches() || m2.matches() || m3.matches() || m4.matches()){
            return "Súbor je obrázok";
        } else return "Súbor nie je obrázok";
    }

    public static String skontrolujFormatDatumu(String str) {
        //Napíš metódu, ktorá zistí, či daný String má správny tvar dátumu.
        //Uvažuj, že správny tvar je nasledujúci: dd/mm/yyyy. Kde dd je den vo formáte 01 pre prvý deň.

        String str1 = str.substring(0,str.indexOf("/"));
        String str2 = str.substring(str.indexOf("/")+1,str.lastIndexOf("/"));
        String str3 = str.substring(str.lastIndexOf("/")+1,str.length());
        //System.out.println(str1+" "+str2+" "+str3);
        int den = Integer.parseInt(str1);
        int mesiac = Integer.parseInt(str2);
        int rok = Integer.parseInt(str3);
        //System.out.println(den+" "+mesiac+" "+rok);

        Pattern p1 = Pattern.compile("[0-9][0-9]/[0-9][0-9]/[0-9][0-9][0-9][0-9]");
        Matcher m1 = p1.matcher(str);

        if((0<den && den<32) && (mesiac>0 && mesiac<13) && (0<rok) && m1.matches() && str.length()==10){
            return "Dátum je v správnom formáte ";
        } else return "Dátum nie je správny";
    }

    public static void vypisSlovaSVelkymPismenom(String str) {
        //Napíš metódu, ktorá pomocou regulárneho výrazu vypíše na konzolu všetky slová začínajúce na veľké písmeno.
        Pattern p = Pattern.compile("[A-Z]+\\w+\\s");
        Matcher m = p.matcher(str);
        boolean found = false;

        System.out.println("\nSLOVA S VELKYM PISMENOM NA ZACIATKU: ");
        while(m.find()) {
            System.out.println(m.group());
            //System.out.println(m.start());
            //System.out.println(m.end());
            found = true;
        }

        if (!found) System.out.println("Ziadne slovo som nenasiel");
    }

    public static void vypisCisla(String str) {
        // Napíš metódu, ktorá pomocou regulárneho výrazu nájde všetky čísla v texte a vypíše ich na konzolu.
        Pattern p = Pattern.compile("[0-9]+");
        Matcher m = p.matcher(str);
        boolean found = false;

        System.out.println("\nCISLA V TEXTE: ");
        while(m.find()) {
            System.out.println(m.group());
            found = true;
        }

        if (!found) System.out.println("Ziadne slovo som nenasiel");
    }
}
