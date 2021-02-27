package sk.janoSK.ZnakyARetazce;

public class Metody {

    public static String poslednePismenoSlovaJeVelke(String str){
        /*
            Napíš metódu, ktorá transformuje vstupný text, tak, že všetky písmená budú malým písmenom
            okrem posledných písmen slov.
         */
        String str1 = str.toLowerCase();
        String str2 = "";
        for (int i=1; i<str1.length(); i++){
            //System.out.println(str1.charAt(i));
            if (str1.substring(i,i+1).isBlank()){
                str2 = str2 + str1.substring(i-1,i).toUpperCase();
            } else {
                str2 = str2 + str1.substring(i-1,i);
            }
            if (i==str1.length()-1){
                str2 = str2 + str1.substring(i,i+1).toUpperCase();
            }
        }
        return str2;
    }

    public static String aZaVinac(String str){
        /*
            Napíš metódu, ktorá nahradí každé písmeno a za @ na vstupnom texte.
         */
        String str1 = "";
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)=='a'){
                str1 = str1 + "@";
            } else {
                str1 = str1 + str.charAt(i);
            }
        }
        return str1;
    }

    public static String poCiarku(String str){
        /*
            Napíš metódu, ktorá odreže časť textu za poslednou čiarkou v texte - spolu aj s čiarkou.
         */
        String str1 = str.substring(0,str.lastIndexOf(","));
        return str1;
    }

    public static String bezVyrezu(String str){
        /*
            Napíš metódu, ktorá vyreže časť textu medzi prvou a druhou čiarkou a v texte - spolu aj s čiarkami.
         */
        return str.substring(0,str.indexOf(",")) + str.substring(str.lastIndexOf(",")+1,str.length()-1);
    }

    public static void statisTika(String str){
        /*
            Napíš metódu, ktorá na vstupe zoberie dlhší text.
            Metóda rozoberie daný text a spraví z neho štatistiky.
            Metóda vypíše nasledovné informácie o texte:
             počet slov
             počet znakov
             počet prázdnych znakov
             počet čiaročiek(,) a bodiek (.)
             počet slov začínajúcich na veľké písmeno
         */
        int pSlov = 0;
        int pZnakov = 0;
        int pZnakovPrazdnych = 0;
        int pCiarok = 0;
        int pBodiek = 0;
        int pSlovSvelkymPismenom = 0;
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)==' '){
                pZnakovPrazdnych++;
            } else {
                pZnakov++;
                if(str.charAt(i)==',') pCiarok++;
                if(str.charAt(i)=='.') pBodiek++;
                if(str.substring(i,i+1).toUpperCase().equals(str.substring(i,i+1))) {
                    if(str.charAt(i)!=',') {
                        if(str.charAt(i)!='.') pSlovSvelkymPismenom++;
                    }
                }

            }
        }
        pSlov = pZnakovPrazdnych;
        System.out.println("----------------\nSTATISTIKA");
        System.out.println("Pocet slov: "+pSlov+", Pocet znakov: "+pZnakov+", Pocet prazdnych znakov: "+pZnakovPrazdnych);
        System.out.println("Pocet ciarok: "+pCiarok+", Pocet bodiek: "+pBodiek+", Slova s velkym pismenom: "+pSlovSvelkymPismenom);
    }

    public static String druheVelke(String str){
        /*
            Napíš metódu, ktorá na vstupe zoberie text.
            Tento text prerobí tak, že odstráni čiarky a bodky a každé druhé písmeno dá ako uppercase - teda ako veľké písmeno.
         */
        String str1 = "";
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)!='.' && str.charAt(i)!=','){
                if (i%2==0){
                    str1 = str1 + str.substring(i,i+1).toUpperCase();
                } else str1 = str1 + str.charAt(i);

            }
        }
        return str1;

    }

    public static String iniCialy(String str){
        /*
            Metóda vypíše iniciálky daného mena s bodkami - bodka nebude za posledným písmenom iniciálok
         */
        String str1 = "" + str.charAt(0) + ".";
        for (int i=1; i<str.length()-1; i++){
            if (str.charAt(i)==' '){
                    str1 = str1 + str.substring(i+1,i+2).toUpperCase() + ".";
            }
        }
        String str2 = str1.substring(0,str1.length()-1);
        return str2;
    }

    public static String transformujTagy(String str){
        /*
            Napíš metódu, ktorá spracuje text napísaný nižšie - text obsahuje špeciálne značky, ktoré predstavujú HTML tagy
            - to sú značky v kóde, ktoré sa používajú na písanie web stránok.
            Tento text stransformuj tak, že špeciálne značky nahradíš HTML značkami.
            [code] -> <code>
            [/code] -> </code>
            [header] -> <;h1>
            [/header] -> </h1>
            [link:www.learn2code.sk] -> < a href = "www.learn2code.sk">
            [/link] -> </a>
         */
        String str1 = str;
        str1 = str1.replace("[code]","<code>");
        str1 = str1.replace("[/code]","</code>");
        str1 = str1.replace("[header]","<;h1>");
        str1 = str1.replace("[/header]","</h1>");
        str1 = str1.replace("[link:www.learn2code.sk]","< a href = \"www.learn2code.sk\">");
        str1 = str1.replace("[/link]","</a>");
        return str1;
    }

}
