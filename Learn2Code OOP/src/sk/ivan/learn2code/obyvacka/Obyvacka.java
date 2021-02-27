package sk.ivan.learn2code.obyvacka;

public class Obyvacka implements CinnostiVObyvacke{
    private Dvere dvere;
    private KuchLinka linka;
    private Okno okno;

    @Override
    public String otvor(String direction) {
        return null;
    }

    public void assembleLivingRoom(Dvere dvere, Okno okno, KuchLinka linka){
        System.out.println("Tato obyvacka obsahuje (" + dvere + ") (" + okno + ") (" + linka + ")" );
        System.out.println(dvere.otvor(dvere.getDirection()));
        System.out.println(okno.otvor(okno.getDirection()));
    }
}
