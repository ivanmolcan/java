package sk.jaroslavbeno.nba.season;

import sk.jaroslavbeno.nba.infrastructure.Team;

public class RegularSeason {

    private Game[] games;
    private int year;

    public RegularSeason(int year) {
        this.year = year;
        games = generateGames(year);
    }

    private Game[] generateGames(int year) {
        //todo
        Game[] games = new Game[2460];

        Game game = new Game(Team.BOSTON_CELTICS, Team.BROOKLYN_NETS);
        games[0]=game;

        return games;

    }
}
