import java.util.ArrayList;

public class Team {

    String teamName = "";
    Integer totalRuns = 137;
    Integer totalWickets = 4;
    Boolean isAllOut = false;
    Boolean isOverFinished = false;
    Boolean isTossWon = false;
    Boolean isChooseBatting = false;
    Integer extrasRun = 7;
    ArrayList<Player> teamList = new ArrayList<Player>();

    public Team(String teamName, ArrayList<Player> teamPlayers) {
        this.teamName = teamName;
        this.teamList = teamPlayers;
    }

    public double runRate() {
        return (totalRuns / 20.0);
    }
}
