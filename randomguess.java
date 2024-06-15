//compare the user's guess with the generated number and provide feedfack on whether the generated number is correct, too high, or too low. 
import java.util.*;
public class randomguess{
    public static void main(String[] args){
        Random r1=new Random();
        int m=1;
        int M=100;
        int randomno = r1.nextInt((M-m)+1)+m;
        Scanner sc = new Scanner(System.in);
        System.out.println("guess no. :" );
        int guessno = sc.nextInt();
        if(guessno == randomno){
            System.out.println("right guess:" + randomno);
        }
        
        else if(guessno < randomno){
            System.out.println("guess is too low be because random no. is this" + randomno);
        }
        else{
            System.out.println("guess is too high because random no. is this" + randomno );
        }
        sc.close();

    }
    
}