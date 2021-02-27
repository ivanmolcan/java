package sk.jaroslavbeno.nba.infrastructure;

public class Conference {

    private String name;
    private Division[] divisions;

    public static final Conference WESTERN = new Conference("Western Conference",
            new Division[]{Division.ATLANTIC, Division.SOUTHEAST, Division.CENTRAL});

    public static final Conference EASTERN = new Conference("Eastern Conference",
            new Division[]{Division.NORTHWEST, Division.SOUTHWEST, Division.PACIFIC});

    private Conference(String name, Division[] divisions) {
        this.name = name;
        this.divisions = divisions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Division[] getDivisions() {
        return divisions;
    }

    public void setDivisions(Division[] divisions) {
        this.divisions = divisions;
    }
}
