//generate a random number with in a specified range,such as 1 to 100. 
import java.util.Random;
public class Randomno {
    public static void main(String[] args){
        Random r1=new Random();
        int m=1;
        int M=100;
        int randomno=r1.nextInt((M-m)+1)+m;
        System.out.println("Random no within " + m + " and " + M + " is "  +  randomno );

    }
    
}
