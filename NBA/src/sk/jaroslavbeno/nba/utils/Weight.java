package sk.jaroslavbeno.nba.utils;

public class Weight {
    private int lbs;
    private int kg;

    public Weight(int lbs, int kg) {
        this.lbs = lbs;
        this.kg = kg;
    }

    public int getLbs() {
        return lbs;
    }

    public void setLbs(int lbs) {
        this.lbs = lbs;
    }

    public int getKg() {
        return kg;
    }

    public void setKg(int kg) {
        this.kg = kg;
    }
}
