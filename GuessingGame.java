//Add the option for multiple round,allowing the user to play again.
import java.util.*;
public class GuessingGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r1 = new Random();
        boolean playAgain = true;

        while (playAgain) {
            int numToGuess = r1.nextInt(100) + 1;
            int numOfTries = 0; 
            boolean hasWon = false;  

            System.out.println("chosen a num between 1 and 100. Try to guess it!");

            while (!hasWon) {
                System.out.print("Enter your guess: ");
                int userGuess = sc.nextInt();
                numOfTries++;

                if (userGuess < numToGuess) {
                    System.out.println("It's higher than " + userGuess + ".");
                } else if (userGuess > numToGuess) {
                    System.out.println("It's lower than " + userGuess + ".");
                } else {
                    hasWon = true;
                    System.out.println("Congratulations! You've guessed the number " + numToGuess + " in " + numOfTries + " tries.");
                }
            }

            System.out.print("Would you like to play again? (y/n): ");
            String resp = sc.next();
            if (!resp.equalsIgnoreCase("y")) {
                playAgain = false;
                System.out.println("Thank you for playing!.");
            }
        }

        sc.close();
    }
}
