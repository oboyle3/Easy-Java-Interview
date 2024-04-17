import java.util.*;
public class q60{
   public static void main(String args[]){
       Scanner in = new Scanner(System.in);
       System.out.println("Input a String: ");
       String finish=in.next();
       System.out.println(finish);
       String words []=finish.split("[ ]+");
       System.out.println("Penultimate word: "+words[words.length-2]);

   }
}
//return the last word in a string
//Input a String: The quick brown fox jumps over the lazy dog.
//Penultimate word: lazy