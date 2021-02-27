package sk.ivan.learn2code.obyvacka;

import sk.ivan.learn2code.obyvacka.enums.Material;

public class KuchLinka extends Obyvacka{

    private Material mat;
    private boolean sporak;
    private boolean rura;
    private boolean umyvacka;

    public KuchLinka(Material mat, boolean sporak, boolean rura, boolean umyvacka) {
        this.mat = mat;
        this.sporak = sporak;
        this.rura = rura;
        this.umyvacka = umyvacka;
    }

    public Material getMat() {
        return mat;
    }

    public boolean isSporak() {
        return sporak;
    }

    public boolean isRura() {
        return rura;
    }

    public boolean isUmyvacka() {
        return umyvacka;
    }

    @Override
    public String toString() {
        return "KuchLinka{" +
                "mat=" + mat +
                ", sporak=" + sporak +
                ", rura=" + rura +
                ", umyvacka=" + umyvacka +
                '}';
    }
}
