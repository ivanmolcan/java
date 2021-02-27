package sk.jaroslavbeno.app.biblia.services;

import sk.jaroslavbeno.app.biblia.enums.Preklad;
import sk.jaroslavbeno.app.biblia.model.Kapitola;
import sk.jaroslavbeno.app.biblia.model.Kniha;

public interface BiblieService {
    Kniha getKnihaInfo(Preklad preklad, int order);
    int getPocetVersov(Kniha kniha, int cisloKapitoly);

    String getTextVersu(Kniha kniha, Kapitola kapitola, int i);
}
