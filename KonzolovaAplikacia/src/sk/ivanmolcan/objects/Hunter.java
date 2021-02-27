package sk.ivanmolcan.objects;

import sk.ivanmolcan.utils.Utils;

public class Hunter extends Hero {

    private Weapon weapon;

    public Hunter(int life, int strength, int speed) {
        super(life, strength, speed);
        this.weapon = new Bow(100,50);
    }

    public void attack(Hero hero) {
        int weaponHit = Utils.calculateHit(weapon.getStrength(), weapon.getCritical());
        super.attack(hero, weaponHit);
    }

    public boolean defend() {
        return super.defend();
    }
}
