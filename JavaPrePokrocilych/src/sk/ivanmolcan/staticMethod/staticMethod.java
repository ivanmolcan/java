package sk.ivanmolcan.staticMethod;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.*;

public class staticMethod {

    static void rounding(double d){
        System.out.println(round(d));
    }

//    1. úloha: Napíš metódu, ktorá transformuje vstupný text, tak, že všetky písmená budú malým písmenom okrem posledných písmen slov.
    static void uloha1(){
        String text = "Petra bolí noha!";
        char[] charArray = text.toLowerCase().toCharArray();

        for(int i=0; i<charArray.length;i++) {
            if (!Character.isLetter(charArray[i])) {
                charArray[i - 1] = Character.toUpperCase(charArray[i - 1]);
            }
        }
        text = String.valueOf(charArray);
        System.out.println(text);
    }

//    2. úloha: Napíš metódu, ktorá nahradí každé písmeno a za @ na vstupnom texte.
    static void uloha2(){
        String text = "Petra bolí noha!";
        char[] charArray = text.toCharArray();

        for(int i = 0; i<charArray.length; i++){
            if(charArray[i] == 'a'){
                charArray[i] = '@';
            }
        }
        text = String.valueOf(charArray);
        System.out.println(text);
    }

//3. úloha: Napíš metódu, ktorá odreže časť textu za poslednou čiarkou v texte - spolu aj s čiarkou. Napr. text "Jarko sa hrá s pieskom, lopatkou, kladivkom a
// je mu fajn." prerobí na text: "Jarko sa hrá s pieskom, lopatkou"
    static void uloha3(){
        String text = "Jarko sa hrá s pieskom, lopatkou, kladivkom a je mu fajn.";
        System.out.println(text.substring(0,text.lastIndexOf(",")));
    }


//4. úloha: Napíš metódu, ktorá vyreže časť textu medzi prvou a druhou čiarkou a v texte - spolu aj s čiarkami.
//    Napr. text "Jarko sa hrá s pieskom, lopatkou, kladivkom a je mu fajn." prerobí na text: "Jarko sa hrá s pieskom kladivkom a je mu fajn."
    static void uloha4(){
        String text = "Jarko sa hrá s pieskom, lopatkou, kladivkom a je mu fajn.";

        String finalText = text.substring(0, text.indexOf(',')) + text.substring(text.lastIndexOf(',')+1,text.length());
        System.out.println(finalText);
    }


    static void uloha5(){
        String text = "Jarko sa hrá s pieskom, lopatkou, kladivkom a je mu fajn.";
        char[] charArray = text.toCharArray();
        int pocetSlov = 1;
        int pocetMedzier = 0;
        int pocetBodiekCiarok = 0;
        int pocetSlovSvelkymPismenom = 0;

        for(int i=0;i<text.length();i++){
            if(charArray[i] == ' '){
                pocetSlov +=1;
            }
            if(charArray[i] == ' '){
                pocetMedzier +=1;
            }
            if(charArray[i] == ',' || charArray[i] == '.'){
                pocetBodiekCiarok +=1;
            }
            if(Character.isUpperCase(charArray[i])){
                pocetSlovSvelkymPismenom +=1;
            }
        }
        System.out.println("pocet slov: " + pocetSlov +"\n" + "pocet medzier: " + pocetMedzier + "\n" + "pocet bodiek a ciarok: " + pocetBodiekCiarok + "\n" + "pocet slov s velkym pismenom: " + pocetSlovSvelkymPismenom);

    }


    static void uloha6(){
        String text = "Jarko sa hrá s pieskom, lopatkou, kladivkom a je mu fajn.";
        text = text.replaceAll("[.|,]","");
        String[] splitText = text.split(" ");
        for(int i = 0; i< splitText.length;i++){
             char[] charArray = splitText[i].toCharArray();
             for(int j=0; j< charArray.length;j++){
                 if(j%2 == 0){
                     charArray[j] = Character.toUpperCase(charArray[j]);
                 }
             }
             splitText[i] = String.valueOf(charArray);
        }
        String t = Arrays.toString(splitText).replaceAll(",","");
        System.out.println(t);
//        for(String s : splitText){
//            System.out.println(s);
//        }

//        char[] charArray = text.toCharArray();
//        for(int i=0; i<charArray.length;i++){
//
//
//            if(i%2 == 0 && charArray[i] != ' '){
//                charArray[i] = Character.toUpperCase(charArray[i]);
//            }
//        }
//        text = String.valueOf(charArray);
//        System.out.println(text);
    }

    static void uloha7(){
        String name;
        System.out.println("State your name please:");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine().trim();

        char[] charArray = name.toCharArray();
        String finalText = Character.toString(charArray[0]) + ".";

        for(int i=0; i<charArray.length;i++){
            if(!Character.isLetter(charArray[i])){
                finalText += charArray[i+1] + ".";
            }
        }
        System.out.println(finalText.substring(0, finalText.length()-1));
    }

    static void uloha8(){
        String text = "[header]Ac mi[/header] massa ac [code]praesent eget[/code], aliquam egestas suscipit, " +
                "potenti massa, porttitor [link:www.learn2code.sk] gravida quis ac velit facilisi[/link], imperdiet " +
                "massa rhoncus felis arcu. Ut nullam, mauris vitae, ligula quisque est.";
        text = text.replaceAll("\\[", "<").replaceAll("\\]",">").replaceAll("header","h1")
                .replaceAll("link:www.learn2code.sk","a href = \"www.learn2code.sk\"")
                .replaceAll("/link","/a");

        System.out.println(text);
    }


    public static void main(String[] args) {
//        rounding(55.55555555);

//        String text = "Petra bolí noha!";
//        System.out.println(text.length());
//        System.out.println(text.charAt(11));
//        System.out.println("dnes budem studovat javu".substring(11,14));

//        uloha1();
//        uloha2();
//        uloha3();
//        uloha4();
//        uloha5();
//        uloha6();
//        uloha7();
        uloha8();
    }



}
