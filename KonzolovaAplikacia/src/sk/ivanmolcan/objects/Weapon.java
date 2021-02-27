package sk.ivanmolcan.objects;

public abstract class Weapon {

    private int strength;
    private int critical;

    public Weapon(int strength, int critical) {
        this.strength = strength;
        this.critical = critical;
    }

    public int getStrength() {
        return strength;
    }

    public int getCritical() {
        return critical;
    }
}
