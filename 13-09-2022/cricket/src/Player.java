public class Player {
    String playerName = "";
    Integer runs = 10;
    Boolean isCurrentlyPlaying = false;
    Integer numberOfBallsFaced = 3;
    Boolean isStriker = false;
    Integer foursScored = 2;
    Integer sixesScored = 3;

    Boolean isBowler = true;
    Integer ballsBowled = 0;
    Integer maidenOver = 1;
    Integer bowlerRunsOffered = 34;
    Integer wicketTaken = 2;
    Integer oversBowled = 3;


    public Player(String playerName) {
        this.playerName = playerName;
    }

    public float runRate() {
        return (float) (this.runs / this.numberOfBallsFaced) * 100;
    }

    public float economy() {
        return (float) (this.bowlerRunsOffered / this.oversBowled);
    }
}
