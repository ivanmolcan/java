package sk.jaroslavbeno.app.biblia;

import sk.jaroslavbeno.app.biblia.enums.Preklad;
import sk.jaroslavbeno.app.biblia.model.Biblia;

public class Main {

    public static void main(String[] args) throws Exception {
        Biblia biblia = Biblia.generujBibliu(Preklad.SEVP);
        System.out.println(biblia);

    }
}
