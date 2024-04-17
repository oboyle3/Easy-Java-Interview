import java.util.*;
public class q51{
   public static void main(String args[]){
       System.out.println("enter a string");
       Scanner scanner = new Scanner(System.in);
       String num=scanner.next();
       int sumnum=Integer.parseInt(num);
       System.out.println(sumnum);
       System.out.println("now using some method to trun a stirng into a int");
       String hello="22";
       someMethod(hello);


    
   }
   public static int someMethod(String x){
       int z=0;
       int number=Integer.parseInt(x);
       return number;
   }
}
//Write a Java program to convert a string to an integer in Java