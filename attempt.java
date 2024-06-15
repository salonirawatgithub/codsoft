//limit the number of attempts the user has to guess the number.
import java.util.*;
 
public class attempt {
    public static void guessno()
    {
        Scanner sc = new Scanner(System.in);
 
    
        int number = 1 + (int)(100* Math.random());
        int attempt = 4;
 
        int i, guess;
 
        System.out.println( "choose a no. between 1 to 100 ");
            
        for ( i = 0; i < attempt; i++) {
 
            System.out.println("Guess the number:");
            guess = sc.nextInt();
            if (number == guess) {
                System.out.println("right! You guessed the number.");
                break;
            }
            else if (number > guess && i != attempt - 1) {
                System.out.println("The number larger than " + guess);
            }
            else if (number < guess && i != attempt - 1) {
                System.out.println("The number is less than " + guess);
            }
        }

 
        if ( i == attempt) {
            System.out.println(".");
 
            System.out.println("The number was " + number);
        }
        System.out.println("no of attempt are:" + i);
    }

   public static void main(String[] args){
    guessno();
    
   }
   
}


 

    
