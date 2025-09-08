import java.util.Random;

public class DiceGame extends Game {
    private int[] scores;
    private int winningScore = 20;
    private int numberOfPlayers;

    @Override
    public void initializeGame(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
        scores = new int[numberOfPlayers];
        System.out.println("Dice Game initialized with " + numberOfPlayers + " players.");
    }

    @Override
    public boolean endOfGame() {
        for (int score : scores) {
            if (score >= winningScore) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void playSingleTurn(int player) {
        Random random = new Random();
        int roll = random.nextInt(6) + 1; // Roll a die (1-6)
        scores[player] += roll;
        System.out.println("Player " + (player + 1) + " rolled a " + roll + ". Total score: " + scores[player]);
    }

    @Override
    public void displayWinner() {
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= winningScore) {
                System.out.println("Player " + (i + 1) + " wins with a score of " + scores[i] + "!");
                break;
            }
        }
    }
}