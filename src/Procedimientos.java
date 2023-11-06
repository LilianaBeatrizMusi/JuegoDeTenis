public class Procedimientos {
    private int scoreP1;
    private int scoreP2;

    public Procedimientos() {
        this.scoreP1 = 0;
        this.scoreP2 = 0;
    }

    public boolean isGameWon() {
        if (scoreP1 >= 4 && scoreP1 - scoreP2 >= 2) {
            return true;
        } else if (scoreP2 >= 4 && scoreP2 - scoreP1 >= 2) {
            return true;
        } else if (scoreP1 >= 3 && scoreP2 >= 3 && scoreP1 == scoreP2) {
            return true;
        }
        return false;
    }

    public void playerScores(String player) {
        if (player.equals("P1")) {
            scoreP1++;
        } else if (player.equals("P2")) {
            scoreP2++;
        }
    }

    public String getScoreAsString(int score) {
        switch (score) {
            case 0:
                return "Love";
            case 1:
                return "15";
            case 2:
                return "30";
            case 3:
                return "40";
            default:
                return "Deuce";
        }
    }

    public String getScore() {
        return getScoreAsString(scoreP1) + " - " + getScoreAsString(scoreP2);
    }

    public int getScoreP1() {
        return 0;
    }

    public int getScoreP2() {
        return 0;
    }

}
