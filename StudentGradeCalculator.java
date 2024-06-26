
import java.util.*;
class StudentGradeCalculator{
       public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=5;
        int totalmarks=0;
        int[] marks=new int[n];
        
        for(int i=0;i<n;i++){
              System.out.println("enter marks of each subject:" +(i+1));
              marks[i]=sc.nextInt();
              totalmarks=totalmarks+marks[i];

       }

       int percentage=totalmarks/n;
       System.out.println("total of all subject:"+ totalmarks);
       System.out.println("percentage:"+percentage);

       if(percentage>=90){
              System.out.println("grade: A");
       }
       else if(percentage>=80){
              System.out.println("grade: B");
       }

       else if(percentage>=70){
              System.out.println("Grade: C");
       

       }
       else if(percentage>=60){
              System.out.println("Grade: D");
       }
       else{
              System.out.println("Grade: f");
       }
       sc.close();

       }

}
       
