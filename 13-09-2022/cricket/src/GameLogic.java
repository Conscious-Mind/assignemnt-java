import java.util.ArrayList;

public class GameLogic {
    Team battingTeam;
    Team bowlingTeam;
    GameVariables gameVariables;
    ArrayList<Integer> scoredInOver = new ArrayList<Integer>();
    Integer lastOver = 0;
    Integer lastBallInOver = 0;
    Integer currentRun = 0;

    public GameLogic(Team battingTeam, Team bowlingTeam, GameVariables gameVariables) {
        this.battingTeam = battingTeam;
        this.bowlingTeam = bowlingTeam;
        this.gameVariables = gameVariables;
    }

    public void startInnings() {
        for (int overs = 0; overs < gameVariables.totalOvers; overs++) {
            System.out.printf("Playing over %s:  %d  -  %d  \n", overs+1, battingTeam.totalRuns, battingTeam.totalWickets);
            for (int balls = 0; balls < gameVariables.ballsInOver; balls++) {
                currentRun = getRandomRuns();
                if (currentRun == 7) {
                    System.out.println("Wicket");
                } else {
                    System.out.println(currentRun);
                    battingTeam.totalRuns += currentRun;
                }
            }

        }
    }

    public int getRandomRuns() {
        Integer randomRuns = getRandomNumber(64);
        if (randomRuns >= 0 && randomRuns < 18)
            return 0;
        else if (randomRuns >= 18 && randomRuns < 32)
            return 1;
        else if (randomRuns >=32 && randomRuns < 42)
            return 2;
        else if (randomRuns >= 42 && randomRuns < 46)
            return 3;
        else if (randomRuns >= 46 && randomRuns < 50)
            return 7;
        else if (randomRuns >= 50 && randomRuns < 58)
            return 4;
        else if (randomRuns >= 58 && randomRuns < 64)
            return 6;
        return 0;
    }

    public Integer getRandomNumber(Integer bounds) {
        return (int) (Math.random() * (bounds));
    }


}
