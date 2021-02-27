package sk.jaroslavbeno.nba.infrastructure;

import sk.jaroslavbeno.nba.human.Player;

public class Team {

    public static final Team BOSTON_CELTICS = new Team("Boston Celtics", "Boston");
    public static final Team BROOKLYN_NETS = new Team("Brooklyn Nets", "New York");
    //todo

    private String name;
    private String town;
    Player[] players;

    private Team(String name, String town) {
        this.name = name;
        this.town = town;
        this.players = generatePlayers();
    }

    private Player[] generatePlayers() {
        //todo
        return null;
    }
}
