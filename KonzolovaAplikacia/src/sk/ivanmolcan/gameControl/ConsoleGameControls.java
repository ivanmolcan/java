package sk.ivanmolcan.gameControl;

import sk.ivanmolcan.gameLogic.Game;
import sk.ivanmolcan.objects.Hero;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConsoleGameControls implements GameControls {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public String putPassword() {
        String password;
        System.out.println("Zadaj heslo: ");
        password = scanner.nextLine().trim();

        Pattern pattern = Pattern.compile("\\w{3,8}");
        Matcher matcher = pattern.matcher(password);
        if(!matcher.matches()){
            System.out.println("Musis zadat heslo o dlzke min3 znaky a max 8 znakov");
            password = putPassword();
        }

        return password;
    }

    @Override
    public String chooseHero() {
        System.out.println("Vyber si hrdinu. Zadaj A pre Warriora, B pre Huntera.");
        String choice = scanner.nextLine();
        if(!choice.equalsIgnoreCase("a") && !choice.equalsIgnoreCase("b")){
            System.out.println("Zadal si zle hrdinu. Zvol A pre Warriora, B pre Huntera.");
            choice = chooseHero();
        }

        return choice;
    }

    @Override
    public int setMoveCount() {
        System.out.println("Na kolko tahov hrame celkovo?");
        int pocetTahov;
        try{
            pocetTahov = scanner.nextInt();
            scanner.nextLine();
        } catch(Exception ex){
            System.out.println("Nepodarilo sa ziskat pocet tahov. Zadal si cislo?");
            pocetTahov = setMoveCount();
        }
        return pocetTahov;
    }

    @Override
    public void printResultOfGame(Game game) {
        this.printPlayerLifes(game.getHrdinaA(), game.getHrdinaB());
        System.out.printf("Hra skoncila. Vyhral hrac %s", game.getWiningPlayer());
        scanner.close();
    }

    @Override
    public String chooseMove(String player) {
        System.out.println("Chces utocit zvola A. Chces sa branit zvol B.");
        String move = scanner.nextLine();
        if(!move.equalsIgnoreCase("A") && !move.equalsIgnoreCase("B")){
            System.out.println("Chyba. Hrac " + player + " chces utocit zvol A. Chces sa branit zvol B.");
            move = scanner.nextLine();
        }
        return null;
    }

    @Override
    public void printPlayerLifes(Hero hrdinaA, Hero hrdinaB) {
        System.out.println("Hrac A ma zivot " + hrdinaA.getLife());
        System.out.println("Hrac B ma zivot " + hrdinaB.getLife());
    }
}
