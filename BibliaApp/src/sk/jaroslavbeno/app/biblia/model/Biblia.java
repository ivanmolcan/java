package sk.jaroslavbeno.app.biblia.model;

import sk.jaroslavbeno.app.biblia.enums.Preklad;
import sk.jaroslavbeno.app.biblia.enums.Zmluva;
import sk.jaroslavbeno.app.biblia.services.BibliaGenerator;
import sk.jaroslavbeno.app.biblia.services.BiblieService;
import sk.jaroslavbeno.app.biblia.services.StaticBiblieService;

import java.util.Arrays;

public class Biblia {
    private Preklad preklad;
    private Kniha[] knihy;

    private Biblia() {
    }

    public static Biblia generujBibliu(Preklad preklad) throws Exception {
        Biblia biblia = new Biblia();
        return BibliaGenerator.generujBibliu(biblia, preklad);
    }


    public Preklad getPreklad() {
        return preklad;
    }

    public void setPreklad(Preklad preklad) {
        this.preklad = preklad;
    }

    public Kniha[] getKnihy() {
        return knihy;
    }

    public void setKnihy(Kniha[] knihy) {
        this.knihy = knihy;
    }

    @Override
    public String toString() {
        return "Biblia{" +
                "preklad=" + preklad +
                ", knihy=" + Arrays.toString(knihy) +
                '}';
    }
}
