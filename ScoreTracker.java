public class ScoreTracker {
    private int totalScore;
    private int totalAttempts;

    public ScoreTracker() {
        this.totalScore = 0;
        this.totalAttempts = 0;
    }

    public void updateScore(int numOfTries) {
        this.totalScore += (100 - numOfTries); 
        this.totalAttempts++;
    }

    public int getTotalScore() {
        return this.totalScore;
    }

    public int getTotalAttempts() {
        return this.totalAttempts;
    }

    public void displayScore() {
        System.out.println("Total Score: " + this.totalScore);
        System.out.println("Total Attempts: " + this.totalAttempts);
    }
}
