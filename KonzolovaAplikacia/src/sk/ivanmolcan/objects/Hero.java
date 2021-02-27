package sk.ivanmolcan.objects;

import sk.ivanmolcan.utils.Utils;

public abstract class Hero {

    private int life;
    private int strength;
    private int speed;
    private boolean isAttackable;

    private int defendCount;

    public Hero(int life, int strength, int speed) {
        this.life = life;
        this.strength = strength;
        this.speed = speed;
        isAttackable = true;
        defendCount = 0;
    }

    protected void attack(Hero hero, int weaponHit){
        isAttackable = true;
        if(hero.isAttackable){
            int hit = Utils.calculateHit(strength, speed) + weaponHit;
            hero.setLife(hero.getLife() - hit);
        }

    }

    protected boolean defend(){
        if(defendCount <= 2){
            isAttackable = false;
            defendCount++;
            return true;
        }
        return false;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getStrength() {
        return strength;
    }

    public int getSpeed() {
        return speed;
    }
}
