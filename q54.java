import java.util.*;
public class q54{
   public static void main(String args[]){
       Scanner scanner=new Scanner(System.in);
       int first=scanner.nextInt();
       int second=scanner.nextInt();
       int third=scanner.nextInt();
       //if two or more have the same rightmost digit
       test(first, second, third, true);
       

    
   }
   public static boolean test(int first,int second, int third, boolean xyz){
      return(first % 10 == first % 10) || (second % 10 == second % 10)||(third % 10 == third % 10) ; 
   }
}
//Write a Java program that accepts three integers from the user and return true if two or more of them (integers )
// have the same rightmost digit. The integers are non-negative.