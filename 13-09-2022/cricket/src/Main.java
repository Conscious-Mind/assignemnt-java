import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        gameStart();
    }

    private static void gameStart() {
        System.out.println("Game Started");
        System.out.println("Game Loading");
//        System.out.println("Game Menu");
//        Team india = new Team("India");
        GameVariables gameVariables = new GameVariables(10);
        System.out.println("Matching India and Australia to a 10 Over One-Day Match.");

//        Creating Indian Team
        ArrayList<String> playersIndia = new ArrayList<String>(Arrays.asList(
                "Dinesh Karthik", "Yuzvendra Chahal", "Deepak Chahar", "Virat Kohli",
                "Rohit Sharma", "Lokesh Rahul", "Suryakumar Yadav", "Hardik Pandya",
                "Bhuvneshwar Kumar", "Mohammed Shami", "Ravichandran Ashwin"
        ));
        Team india = new Team("India", makePlayers(playersIndia));

//        Creating Australian Team
        ArrayList<String> playersAustralia = new ArrayList<String>(Arrays.asList(
                "Aaron Finch", "Ashton Agar", "Steven Smith", "Kane Richardson",
                "David Warner", "Glenn Maxwell", "Mitchell Marsh", "Pat Cummins",
                "Mitchell Starc", "Tim David", "Josh Hazlewood"
        ));
        Team australia = new Team("Australia", makePlayers(playersAustralia));

//        System.out.println(australia.teamList.get(0).playerName);

        flipToss(india, australia);

        //        Printing score
        mainScoreCard(india, australia);

        GameLogic gameLogic = new GameLogic(india, australia, gameVariables);

        gameLogic.startInnings();




//        System.out.println("Starting Match between India and Australia");
//        System.out.println("Toss");
//        System.out.println("Team 1 Choose Batting");
//        System.out.println("print Main Score Card");
//        System.out.println("print batting team");
//        System.out.println("print bowling team");
//        System.out.println("Innings 1 Started");
//        System.out.println("Team 1 is batting until every one out or overs exhausted");
//        System.out.println("print score card");
//        System.out.println("Innings 2 Started");
//        System.out.println("Team 2 will chase team 1 score until they win or everyone out or overs exhausted");
//        System.out.println("print winner");
//        System.out.println("score card");
    }

    public static ArrayList<Player> makePlayers(ArrayList<String> playersNameList) {
        ArrayList<Player> players = new ArrayList<Player>();

        for (String playerName : playersNameList) {
            players.add(new Player(playerName));
        }

        return players;
    }

    public static void mainScoreCard(Team battingTeam, Team bowlingTeam) {
        System.out.printf("Team %s Innings (10 overs Maximum)         %-5s  %-5s  %-5s  %-5s  %5s \n",
                battingTeam.teamName, "Runs", "Balls", "4s", "6s", "SR");
        ArrayList<Player> tempBattingTeamList = battingTeam.teamList;
        for (int i = 0; i < battingTeam.teamList.size(); i++) {
            Player tempPlayer = tempBattingTeamList.get(i);
            System.out.printf("%3d.  %-40s %-5s  %-5s  %-5s  %-5s  %5.2f \n",
                    i+1, tempPlayer.playerName, tempPlayer.runs, tempPlayer.numberOfBallsFaced,
                    tempPlayer.foursScored, tempPlayer.sixesScored,
                    (double)(tempPlayer.runs / tempPlayer.numberOfBallsFaced) * 100);
        }
        System.out.printf("      %-40s %-5s \n", "Extras", battingTeam.extrasRun);
        System.out.printf("      %-40s %-3s-%s (%s Overs)  Run Rate:%5.2f \n", "TOTAL",
                battingTeam.totalRuns, battingTeam.totalWickets, "10", battingTeam.runRate() );

        System.out.println();

        System.out.printf("Team %s Innings (10 overs Maximum)     %-5s  %-5s  %-5s  %-5s  %5s \n",
                bowlingTeam.teamName, "Overs", "Maiden", "Runs", "Wickets", "Economy");
        ArrayList<Player> tempBowlingTeamList = bowlingTeam.teamList;
        int indexNumber = 1;
        for (int i = 0; i < battingTeam.teamList.size(); i++) {
            Player tempPlayer = tempBowlingTeamList.get(i);
            if (tempPlayer.isBowler) {
                System.out.printf("%3d.  %-40s %-5s  %-5s   %-5s    %-5s  %5.2f \n",
                        indexNumber, tempPlayer.playerName, tempPlayer.oversBowled, tempPlayer.maidenOver,
                        tempPlayer.bowlerRunsOffered, tempPlayer.wicketTaken,
                        tempPlayer.economy());
                indexNumber++;
            }

        }
//        System.out.printf("      %-40s %-5s \n", "Extras", battingTeam.extrasRun);
        System.out.printf("      %-40s %-3s-%s (%s Overs)  \n", "TOTAL",
                battingTeam.totalRuns, battingTeam.totalWickets, "10");
    }

    public static void flipToss(Team teamA, Team teamB) {
        String whoWonToss = "";
        String chooseWhat = "Bowling";
        if (getRandomNumber(1) == 0) {
            teamA.isTossWon = true;
            whoWonToss = teamA.teamName;
            if (getRandomNumber(1) == 0) {
                teamA.isChooseBatting = true;
                chooseWhat = "Batting";
            }

        } else {
            teamB.isTossWon = true;
            whoWonToss = teamB.teamName;
            if (getRandomNumber(1) == 0) {
                teamB.isChooseBatting = true;
                chooseWhat = "Batting";
            }
        }

        System.out.printf("%s Won the Toss and Choose %s \n", whoWonToss, chooseWhat);
    }

    public static Integer getRandomNumber(Integer bounds) {
        return (int) (Math.random() * (bounds + 1));
    }

}