//repeat step 2 and 3 until the user guesses the correct number you can incorporate additional  detail as follows.
import java.util.*;
public class userguess{
    public static void main(String[] args){
        int m= 1;
        int M = 100;
        Random r1=new Random();
        Scanner sc = new Scanner(System.in);
        int guessno = r1.nextInt((M-m)+1)+m;
        int ug=0;
        while(ug!=guessno){
            System.out.println("enter guess number:");
            ug=sc.nextInt();

        
            if(ug<guessno){
                System.out.println("too low" );
            }
            else if(ug > guessno){
                System.out.println("guess is too high be because random no." );
            }
            else{
                System.out.println("guess is right" );
            }
        }
        sc.close();

    }
    
} 
    

