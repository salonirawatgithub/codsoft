import java.util.Scanner;
public class NumberGame {

	public static void main(String[] args) {
		
		// Generate a random number between 1 to 100
		        int randomNum = (int) (Math.random() * 100) + 1;
				
		        
		        Scanner sc = new Scanner(System.in);
				
		        boolean guessedCorrectly = false;
		        int numberOfAttempts = 0;
		        System.out.println("Guess a number between 1 and 100: ");
				System.out.println(" Generated Number is "+randomNum);

		        
		        while (!guessedCorrectly && numberOfAttempts < 5) 
		        {
		            
		            System.out.println("enter the user guess:");
					int userGuess = sc.nextInt();
					

		            // Check if the user guessed correctly
		            if (userGuess == randomNum) 
		            {
		                guessedCorrectly = true;
		            } 
		            else 
		            {
		                numberOfAttempts++;
		                if (userGuess > randomNum) 
		                {
		                    System.out.println("Your guess is too high.");
		                } else 
		                {
		                    System.out.println("Your guess is too low.");
		                }
		            }
		        }

		        

		        // If the user guessed correctly, congratulate them.
				// Otherwise, tell them the correct answer.
		        if (guessedCorrectly) 
		        {
		            System.out.println("Congratulations! You guessed correctly! The number was " + randomNum);
		        } else 
		        {
		            System.out.println("Sorry, you ran out of guesses. The correct answer was " + randomNum);
		        }
				sc.close();
		    
		

		
		
	}
    
}
    
