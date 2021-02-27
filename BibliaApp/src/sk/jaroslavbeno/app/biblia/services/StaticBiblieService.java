package sk.jaroslavbeno.app.biblia.services;

import sk.jaroslavbeno.app.biblia.enums.Preklad;
import sk.jaroslavbeno.app.biblia.enums.Zmluva;
import sk.jaroslavbeno.app.biblia.model.Kapitola;
import sk.jaroslavbeno.app.biblia.model.Kniha;

public class StaticBiblieService implements BiblieService {
    @Override
    public Kniha getKnihaInfo(Preklad preklad, int order) {
        Kniha kniha = new Kniha();
        kniha.setZmluva(Zmluva.STARA);
        kniha.setSkratka("1M");
        kniha.setNazov("1. kniha Mojžišova");
        kniha.setPoradie(order);
        kniha.setPocetKapitol(50);
        return kniha;
    }

    @Override
    public int getPocetVersov(Kniha kniha, int cisloKapitoly) {
        return 24;
    }

    @Override
    public String getTextVersu(Kniha kniha, Kapitola kapitola, int cisloVersa) {
        return "Lebo tak Boh miloval svet, že svojho jednorodeného Syna dal, " +
                "aby nezahynul, ale večný život mal každý, kto verí v Neho.";
    }
}
