/*
    Napíš metódu, ktorej vstupný parameter bude String zložený z dvoch slov – oddelených medzerou.
    Vstup: Jaroslav Beňo

    Na výstupe očakávam jednorozmerné pole znakov, kde znaky budú v nasledovnom poradí:
    Výstup: valsorraJ oňeB

    Teda prvé slovo bude obrátene a za ním bude druhé slovo obrátene. Medzi nimi bude ponechaná čiarka.

    Vstup: Malý medveď
    Výstup: ýlaM ďevdem
*/

package sk.ada.Ulohy;


public class ObraciamGarde {

    
    public static void obratenePrveAObrateneDruhe(String text) {
        
        
        char[] textovePole2 = new char[text.length()];
        char a;

        int c = text.indexOf(' ');
        for (int i = 0; i < text.indexOf(' '); i++) {
            --c;
            a = text.charAt(c);
            textovePole2[i] = a;
        }

        textovePole2[text.indexOf(' ')] = ' ';

        int c2 = text.length();
        int c3 = text.indexOf(' ')+1;

        for (int j = c3; j < text.length(); ++j) {
            --c2;
            a = text.charAt(c2);
            textovePole2[j] = a;
        }

//        System.out.println(textovePole2);
        System.out.println(text + " a opacne: ");
        for (int i = 0; i < textovePole2.length; i++) {
//            System.out.print("[" + i + "] = " + textovePole2[i] + " ");
//            System.out.print(textovePole2[i]);
            System.out.print(textovePole2[i]);
        }
        System.out.println("");
        
        
    }



    private static void vytvorOpacnePoradie(String text) {
        int j = 0;
        char[] textovePole =  new char[text.length()];
        for (int i = text.length()-1; i >= 0; i--) {
            char a = text.charAt(i);
            textovePole[j] = a;
            j++;
        }
        System.out.println(textovePole);
    }

       
}
