import java.util.*;
public class q64 {
    public static void main(String args[]){
        System.out.println("enter a num");
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        System.out.println("enter another num");
        int num2=scanner.nextInt();
        
    }
        public static boolean commonDigit(int x, int y){
            if(x<25 || y>75){
                return false;
            }
            int z=x%10;
            int y=x%10;
        }

        

    
}
/*Write a Java program that accepts two integer values between 25 and 75 and returns true if there is a common digit in both numbers. */