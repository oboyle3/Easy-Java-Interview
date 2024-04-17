import java.util.*;
public class q33{
   public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.println("enter a number: ");
    int number = input.nextInt();
    System.out.println("the sum of the diguts is: "+sumDig(number)); 
   }//end main
   public static int sumDig( int n ){
       int sum = 0;
       while (n!=0){
           sum += n % 10;
           n /=10;
       }
       return sum;

   }
}
// Write a Java program and compute the sum of the digits of an integer
//Input Data:
//Input an integer: 25
//Expected Output
//The sum of the digits is: 7