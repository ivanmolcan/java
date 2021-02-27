package sk.ivanmolcan.gameLogic;

import sk.ivanmolcan.gameControl.ConsoleGameControls;
import sk.ivanmolcan.objects.Hero;
import sk.ivanmolcan.objects.Hunter;
import sk.ivanmolcan.objects.Warrior;

public class Game {
    private ConsoleGameControls gameControl;
    private int moveCount;
    private String winingPlayer;
    private Hero hrdinaA;
    private Hero hrdinaB;

    public Game() {
        this.gameControl = new ConsoleGameControls();
        this.moveCount = gameControl.setMoveCount();
        String ha = gameControl.chooseHero();
        String hb = gameControl.chooseHero();
        this.hrdinaA = ha.equalsIgnoreCase("a")
                ? getWarrior()
                : getHunter();
        this.hrdinaB = hb.equalsIgnoreCase("b")
                ? getHunter()
                : getWarrior();
    }

    private Hunter getHunter() {
        return new Hunter(10000, 70, 20);
    }

    private Warrior getWarrior() {
        return new Warrior(10000, 100, 5);
    }

    public String getWiningPlayer() {
        return winingPlayer;
    }

    public void gameStart(){
        Hero[] heroes = new Hero[2];
        heroes[0] = hrdinaA instanceof Warrior ? (Warrior) hrdinaA : (Hunter) hrdinaA; //cast na warriora alebo huntera
        heroes[1] = hrdinaB instanceof Warrior ? (Warrior) hrdinaB : (Hunter) hrdinaB; //cast na warriora alebo huntera
        for(int i =0; i < moveCount * 2; i++){
            if(heroes[0].getLife() > 0 || heroes[1].getLife() >0){
                int modulo = i%2;
                String move = gameControl.chooseMove(modulo == 0 ? "A" : "B");
                if(move.equalsIgnoreCase("A")){
                    attack(heroes, modulo);
                } else {
                    defend(heroes, modulo);
                }

                gameControl.printPlayerLifes(hrdinaA, hrdinaB);
            } else {
                setWinningPlayer();
                gameControl.printResultOfGame(this);
                break;
            }
        }
        setWinningPlayer();
        gameControl.printResultOfGame(this);
    }

    private void setWinningPlayer() {
        if(hrdinaA.getLife() == hrdinaB.getLife()){
            this.winingPlayer = "Remiza";
        } else if(hrdinaA.getLife() > hrdinaB.getLife()){
            this.winingPlayer = "A";
        } else {
            this.winingPlayer = "B";
        }
    }

    private void defend(Hero[] heroes, int modulo) {
        if(heroes[modulo] instanceof Warrior){
            Warrior warrior = (Warrior) heroes[modulo];
            if(!warrior.defend()){
                warriorAttack(heroes, modulo, warrior);
            }
        } else {
            Hunter hunter = (Hunter) heroes[modulo];
            if(!hunter.defend()){
                hunterAttack(heroes, modulo, hunter);
            }
        }
    }

    private void attack(Hero[] heroes, int modulo) {
        if(heroes[modulo] instanceof Warrior){
            Warrior warrior = (Warrior) heroes[modulo];
            warriorAttack(heroes, modulo, warrior);
        } else {
            Hunter hunter = (Hunter) heroes[modulo];
            hunterAttack(heroes, modulo, hunter);
        }
    }

    private void hunterAttack(Hero[] heroes, int modulo, Hunter hunter) {
        if (modulo == 0) {
            hunter.attack(heroes[1]);
        } else {
            hunter.attack(heroes[0]);
        }
    }

    private void warriorAttack(Hero[] heroes, int modulo, Warrior warrior) {
        if (modulo == 0) {
            warrior.attack(heroes[1]);
        } else {
            warrior.attack(heroes[0]);
        }
    }

    public Hero getHrdinaA() {
        return hrdinaA;
    }

    public Hero getHrdinaB() {
        return hrdinaB;
    }
}
