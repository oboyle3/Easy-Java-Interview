import java.util.*;
public class q38{
   public static void main(String args[]){
    //Scanner input = new Scanner(System.in);
    //System.out.println("enter a string: ");
    String sample = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
    count(sample);
    String patrick="patrick";
    char[] c=patrick.toCharArray();
    for(int i =0;i<c.length;i++){
        System.out.print(c[i]);
        if(c[i]=='i'){
            System.out.println("found a I in the given");
            break;
        }
    }
   }//end main
   public static void count(String sample){
       char[] ch = sample.toCharArray();
       int space =0;
       int number = 0;
       int other = 0;
       int letter=0;
       for ( int i = 0; i < ch.length; i++){
           if(Character.isLetter(ch[i])){
               letter++;
           }
           else if(Character.isDigit(ch[i])){
               number++;
           }
           else if(Character.isSpaceChar(ch[i])){
               space++;
           }
           else{
               other++;
           }

       }
       System.out.println("speace:"+space);
       System.out.println("number:" +number );
       System.out.println("other:"+other);
       System.out.println("letter:"+letter);
   }
}
//Write a Java program to count the letters, spaces, numbers and other characters of an input string