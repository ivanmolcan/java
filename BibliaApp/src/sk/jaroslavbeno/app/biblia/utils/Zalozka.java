package sk.jaroslavbeno.app.biblia.utils;

import sk.jaroslavbeno.app.biblia.model.Kapitola;
import sk.jaroslavbeno.app.biblia.model.Kniha;
import sk.jaroslavbeno.app.biblia.model.Vers;

public class Zalozka {
    private Kniha kniha;
    private Kapitola kapitola;
    private Vers vers;

    public Zalozka(Kniha kniha, Kapitola kapitola, Vers vers) {
        this.kniha = kniha;
        this.kapitola = kapitola;
        this.vers = vers;
    }

    public Zalozka(Kniha kniha) {
        this.kniha = kniha;
    }

    public Zalozka(Kapitola kapitola) {
        this.kapitola = kapitola;
    }

    public Zalozka(Vers vers) {
        this.vers = vers;
    }

    public Kniha getKniha() {
        return kniha;
    }

    public Kapitola getKapitola() {
        return kapitola;
    }

    public Vers getVers() {
        return vers;
    }
}
