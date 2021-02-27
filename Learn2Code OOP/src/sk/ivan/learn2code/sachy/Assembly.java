package sk.ivan.learn2code.sachy;

import sk.ivan.learn2code.sachy.figurines.*;

public class Assembly {
    Sachovnica chessboard;
    Veza veza;
    Dama dama;
    Kral kral;
    Pesiak pesiak;
    Strelec strelec;
    Kon kon;

    public Assembly(Sachovnica chessboard, Veza veza, Dama dama, Kral kral, Pesiak pesiak, Strelec strelec, Kon kon) {
        this.chessboard = chessboard;
        this.veza = veza;
        this.dama = dama;
        this.kral = kral;
        this.pesiak = pesiak;
        this.strelec = strelec;
        this.kon = kon;
    }

    public Sachovnica getChessboard() {
        return chessboard;
    }

    public Veza getVeza() {
        return veza;
    }

    public Dama getDama() {
        return dama;
    }

    public Kral getKral() {
        return kral;
    }

    public Pesiak getPesiak() {
        return pesiak;
    }

    public Strelec getStrelec() {
        return strelec;
    }

    public Kon getKon() {
        return kon;
    }

    @Override
    public String toString() {
        return "Assembly{" +
                "chessboard=" + chessboard +
                ", veza=" + veza +
                ", dama=" + dama +
                ", kral=" + kral +
                ", pesiak=" + pesiak +
                ", strelec=" + strelec +
                ", kon=" + kon +
                '}';
    }
}
