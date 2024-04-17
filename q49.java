import java.util.*;
public class q49{
   public static void main(String args[]){
       System.out.println("enter a number");
       Scanner scanner = new Scanner(System.in);
       int num=scanner.nextInt();
       if(num % 2==0)
           System.out.println("the number you entered is even");
       
       else
       System.out.println("the number you entered is odd");


   }
}
//Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd