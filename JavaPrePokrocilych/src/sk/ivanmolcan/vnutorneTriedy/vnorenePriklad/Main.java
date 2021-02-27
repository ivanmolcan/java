package sk.ivanmolcan.vnutorneTriedy.vnorenePriklad;

public class Main {

    public static void main(String[] args) {
        Hrac hrac = new Hrac(10);
        //Nestaticka trieda
        Hrac.SkoreHraca skoreHraca = hrac.new SkoreHraca(8);

        //Staticka trieda
        Hrac.StatistikaHraca statistikaHraca = new Hrac.StatistikaHraca();

    }
}
