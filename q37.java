import java.util.*;
public class q37{
   public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.println("enter a string: ");
    char[] word = input.nextLine().toCharArray();
    for(int i = word.length-1 ; i >= 0; i--){
       System.out.print(word[i]);
    }
    
   }
}
   
//write a java program to reverse a string
