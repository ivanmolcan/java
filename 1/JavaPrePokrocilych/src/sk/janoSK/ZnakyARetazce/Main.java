package sk.janoSK.ZnakyARetazce;

public class Main {
    public static void main(String[] args) {
        String mojText = "Ak sa nenaučím Angličtinu bude zle";
        String mojText2 = "Jarko sa hrá s pieskom, lopatkou, kladivkom a je mu fajn.";
        String mojText3 = "Nič ešte nie je rozhodnuté. Uvidíme. Samozrejme, s tímom Alfy sme už o pokračovaní rokovali. Rozhodnúť sa musím ja a ja som sa ešte nerozhodol. Nie je pravda, že by som už niečo podpísal. Nič som nepodpísal minulý mesiac, minulý týždeň a ani dnes. ";
        String mojText4 = "František Ferdinand Veľký";
        String mojText5 = "[header]Ac mi[/header] massa ac [code]praesent eget[/code], aliquam egestas suscipit, potenti massa, porttitor [link:www.learn2code.sk] gravida quis ac velit facilisi[/link], imperdiet massa rhoncus felis arcu. Ut nullam, mauris vitae, ligula quisque est.";


        System.out.println(mojText);
        System.out.println(mojText2);
        System.out.println(mojText3);
        // 1.úloha
        System.out.println("----------------\nPosledne pismeno slova malym: \n"+Metody.poslednePismenoSlovaJeVelke(mojText));
        // 2.úloha
        System.out.println("----------------\na za @: \n"+Metody.aZaVinac(mojText));
        // 3.úloha
        System.out.println("----------------\nPo poslednu ciarku: \n"+Metody.poCiarku(mojText2));
        // 4.úloha
        System.out.println("----------------\nBez vyrezanej casti: \n"+Metody.bezVyrezu(mojText2));
        // 5.úloha
        Metody.statisTika(mojText3);
        // 6.úloha
        System.out.println("----------------\nDruhe velke: \n"+Metody.druheVelke(mojText2));
        // 7.úloha
        System.out.println("----------------\nInicialy: \n"+Metody.iniCialy(mojText4));
        // 8.úloha
        System.out.println("----------------\nTransformacia tagov: \n"+Metody.transformujTagy(mojText5));
    }
}
