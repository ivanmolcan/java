package sk.ivan.learn2code.override1;

public class Soccer extends Sports {

    @Override
    public String getName() {
        return "Soccer Class";
    }

    @Override
    public void getNumberOfTeamMembers() {
        System.out.println( "Each team has 11 players in " + getName() );
    }
}
