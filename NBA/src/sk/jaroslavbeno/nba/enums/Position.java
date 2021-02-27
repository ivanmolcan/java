package sk.jaroslavbeno.nba.enums;

public enum Position {
    PG("point guard"),
    SG("shooting guard"),
    SF("small forward"),
    PF("power forward"),
    C("center");

    private String fullPositionName;

    Position(String fullPositionName) {
        this.fullPositionName = fullPositionName;
    }

    public String getFullPositionName() {
        return fullPositionName;
    }
}
