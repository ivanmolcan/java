package sk.jaroslavbeno.nba.infrastructure;

public class Division {

    public static final Division ATLANTIC = new Division("Atlantic",
            new Team[]{
                    Team.BOSTON_CELTICS,
                    Team.BROOKLYN_NETS
            });

    public static final Division PACIFIC = new Division("Pacific", null);
    public static final Division CENTRAL = new Division("Central", null);
    public static final Division SOUTHEAST = new Division("Southeast", null);
    public static final Division NORTHWEST = new Division("Northwest", null);
    public static final Division SOUTHWEST = new Division("Southwest", null);

    private String name;
    private Team[] teams;

    private Division(String name, Team[] teams) {
        this.name = name;
        this.teams = teams;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team[] getTeams() {
        return teams;
    }

    public void setTeams(Team[] teams) {
        this.teams = teams;
    }
}
