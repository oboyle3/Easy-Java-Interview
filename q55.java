import java.util.*;
public class q55{
   public static void main(String args[]){
       Scanner scanner=new Scanner(System.in);
       System.out.println("enter hours: ");
       int hours=scanner.nextInt();
       System.out.println("converting "+hours+" hours to seconds...");
       int x = hours % 60;
       System.out.println("the finished conversion of hours to seconds is "+x);
   }
}
//convert hours to seconds