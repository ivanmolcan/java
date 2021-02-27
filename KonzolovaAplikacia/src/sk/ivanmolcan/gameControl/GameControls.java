package sk.ivanmolcan.gameControl;

import sk.ivanmolcan.gameLogic.Game;
import sk.ivanmolcan.objects.Hero;

public interface GameControls {

    String putPassword();
    String chooseHero();
    int setMoveCount();
    void printResultOfGame(Game game);
    String chooseMove(String player);

    void printPlayerLifes(Hero hrdinaA, Hero hrdinaB);
}
