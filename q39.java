import java.util.*;
public class q39{
   public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.println("enter a string: ");
    //char[] word = input.nextLine().toCharArray();
    int amount = 0;
    for(int i = 1;i <= 4;i++){
        for(int j=1; j<=4;j++){
            for(int k=1;k<=4;k++){
                if(k!=i && k !=j && i!= j){
                    amount++;
                    System.out.print(i+""+j+""+k);
                }

            }
        }
    }
   
   System.out.println("total number of three digit #'s are "+ amount);
}
}
//Write a Java program to create and display unique three-digit number using 1, 2, 3, 4. 
//Also count how many three-digit numbers are there