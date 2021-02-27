package sk.jaroslavbeno.ulohy.uloha1.model;

public class Pamat {
    private String velkost;
    private String rychlost;

    public Pamat(String velkost, String rychlost) {
        this.velkost = velkost;
        this.rychlost = rychlost;
    }

    public String getVelkost() {
        return velkost;
    }

    public String getRychlost() {
        return rychlost;
    }

    @Override
    public String toString() {
        return "Pamat{" +
                "velkost='" + velkost + '\'' +
                ", rychlost='" + rychlost + '\'' +
                '}';
    }
}
