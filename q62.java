
import java.util.*;
public class q62{
   public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("\nInput a integer 1: ");
        int a = in.nextInt();
        System.out.print("\nInput a integer 2: ");
        int b = in.nextInt();
        System.out.print("\nInput a integer 3: ");
        int c =  in.nextInt();
        System.out.println((Math.abs(a - b) >= 20 || Math.abs(b- c) >= 20 || Math.abs(c - a) >= 20));
        

   }
}
/* Write a Java program that accepts three integer values and return true if one of them is 20 or more and less than the substractions of others. Go to the editor
Sample Output:

Input the first number : 15                                            
Input the second number: 20                                            
Input the third number : 25                                            
false */