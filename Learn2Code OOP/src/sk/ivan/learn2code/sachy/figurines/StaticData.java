package sk.ivan.learn2code.sachy.figurines;

import sk.ivan.learn2code.sachy.enums.Color;

public class StaticData {

    public Veza veza = new Veza(Color.BLACK,2);
    public Dama dama = new Dama(Color.BLACK, 1);
    public Kral kral = new Kral(Color.BLACK, 1);
    public Pesiak pesiak = new Pesiak(Color.BLACK, 8);
    public Strelec strelec = new Strelec(Color.BLACK, 2);
    public Kon kon = new Kon(Color.BLACK, 2);
    public Sachovnica chessboard = new Sachovnica("Drevo", 40,40,2,false);

    public Veza veza2 = new Veza(Color.WHITE,2);
    public Dama dama2 = new Dama(Color.WHITE, 1);
    public Kral kral2 = new Kral(Color.WHITE, 1);
    public Pesiak pesiak2 = new Pesiak(Color.WHITE, 8);
    public Strelec strelec2 = new Strelec(Color.WHITE, 2);
    public Kon kon2 = new Kon(Color.WHITE, 2);
    public Sachovnica chessboard2 = new Sachovnica("Mahagon", 40,40,2,true);

}
