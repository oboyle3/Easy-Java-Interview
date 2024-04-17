import java.util.*;
public class q63{
   public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("\nInput a number the first number ");
        int first = in.nextInt();
        System.out.print("\nInput a number the second number ");
        int second = in.nextInt();
        int result=0;
        if(first > second){
            result=first;
            System.out.println("result:" +result);
        }
        else if(first == second){
            result = 0;
            System.out.println("result:" +result);
        }
        else {
            result=second;
            System.out.println("result:" +result);
        }
        
        
   }
}