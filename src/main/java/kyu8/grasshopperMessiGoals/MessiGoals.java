package kyu8.grasshopperMessiGoals;

public class MessiGoals {
    public static void main( String[] args ) {

        messiScore();
    }

    public static int laLigaGoals = 43;
    public static int championsLeagueGoals = 10;
    public static int copaDelReyGoals = 5;

    public static int messiScore() {

        int totalGoals = (laLigaGoals + championsLeagueGoals + copaDelReyGoals);
        return totalGoals;
    }
}