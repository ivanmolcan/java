package sk.janoSK.RegularneVyrazy;

public class Main {

    public static void main(String[] args) {
        // 1.úloha
        System.out.println(Metody.skontrolujEmail("me3k@le.sk"));
        // 2.úloha
        System.out.println(Metody.skontrolujHeslo("anti-19Gen"));
        // 3.úloha
        System.out.println(Metody.skontrolujFormatObrazku("preview01.jpeg"));
        // 4.úloha
        System.out.println(Metody.skontrolujFormatDatumu("01/12/2015"));
        // 5.úloha
        Metody.vypisSlovaSVelkymPismenom("Google LLC je spoločnosť so sídlom v Kalifornii v USA[4] od októbra 2015 vlastnená holdingovou materskou spoločnosťou Alphabet. Google založili 27. septembra 1998 študenti Larry Page a Sergej Brin.");
        // 6.úloha
        Metody.vypisCisla("Google LLC je spoločnosť so sídlom v Kalifornii v USA[4] od októbra 2015 vlastnená holdingovou materskou spoločnosťou Alphabet. Google založili 27. septembra 1998 študenti Larry Page a Sergej Brin.");
    }
}
