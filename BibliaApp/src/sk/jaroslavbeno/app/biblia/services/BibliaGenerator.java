package sk.jaroslavbeno.app.biblia.services;

import sk.jaroslavbeno.app.biblia.enums.Preklad;
import sk.jaroslavbeno.app.biblia.model.Biblia;
import sk.jaroslavbeno.app.biblia.model.Kapitola;
import sk.jaroslavbeno.app.biblia.model.Kniha;
import sk.jaroslavbeno.app.biblia.model.Vers;

public class BibliaGenerator {

    private static BiblieService biblieService = new StaticBiblieService();


    public static Biblia generujBibliu(Biblia biblia, Preklad preklad) throws Exception {
        switch (preklad){
            case SEVP:
                return generujPreklad(biblia, preklad);
            default: throw new Exception("Neznamy preklad");
        }
    }

    private static Biblia generujPreklad(Biblia biblia, Preklad preklad) {
        biblia.setPreklad(preklad);
        biblia.setKnihy(generujKnihy(preklad));
        return biblia;
    }

    private static Kniha[] generujKnihy(Preklad preklad) {
        Kniha[] knihy = new Kniha[66];

        for(int i = 0; i< knihy.length; i++){
            Kniha kniha = biblieService.getKnihaInfo(preklad,i+1);
            kniha.setKapitoly(generujKapitolyPreKnih(preklad, kniha));
            knihy[i] = kniha;
        }
        return knihy;
    }

    private static Kapitola[] generujKapitolyPreKnih(Preklad preklad, Kniha kniha) {
        Kapitola[] kapitoly = new Kapitola[kniha.getPocetKapitol()];
        for(int i = 0; i< kapitoly.length; i++){
            Kapitola kapitola = new Kapitola();
            kapitola.setCislo(i+1);
            kapitola.setPocetVersov(biblieService.getPocetVersov(kniha,i+1));
            kapitola.setVerse(generujVersePreKnihuAKapitolu(preklad,kniha,kapitola));
            kapitoly[i] = kapitola;
        }
        return kapitoly;
    }

    private static Vers[] generujVersePreKnihuAKapitolu(Preklad preklad, Kniha kniha, Kapitola kapitola) {
        int pocetVersov = kapitola.getPocetVersov();
        Vers[] verse = new Vers[pocetVersov];
        for(int i = 0; i< pocetVersov; i++){
            Vers vers = new Vers();
            vers.setCislo(i+1);
            vers.setText(biblieService.getTextVersu(kniha,kapitola,i+1));
            verse[i]=vers;
        }
        return verse;
    }

}
