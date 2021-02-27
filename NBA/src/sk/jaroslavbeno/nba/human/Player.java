package sk.jaroslavbeno.nba.human;

import sk.jaroslavbeno.nba.enums.Position;
import sk.jaroslavbeno.nba.infrastructure.Team;
import sk.jaroslavbeno.nba.utils.Height;
import sk.jaroslavbeno.nba.utils.Stats;
import sk.jaroslavbeno.nba.utils.Weight;


public class Player extends Person {
    private boolean isDrafted;

    private Position position;
    private Team team;

    private Height height;
    private Weight weight;

    private Stats stats;
}
