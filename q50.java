import java.util.*;
public class q50{
   public static void main(String args[]){
       for(int i = 0 ; i <=100 ; i++){
           if(i % 3 ==0){
               System.out.println("the numbers divisble by three are: "+i);
           }
           if(i % 5 ==0){
            System.out.println("the numbers divisble by five are: "+i);
           }
           if(i % 3 ==0 && i % 5==0){
            System.out.println("the numbers divisble by three and five are: "+i);
        }

       }//end for
   }
}
// Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both