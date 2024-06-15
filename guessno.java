//prompt the user to enter their guess for the generated number.
import java.util.*;
public class guessno {
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
        else{
            System.out.println("wrong guess the right guess is this" + randomno);
        }
        sc.close();

    }
    
}
