import java.util.*;
public class q77{
   public static void main(String[] args){
       int [] firstArray={10,20,30};
       int [] secondArray={70,80,90};
       int [] newArray={firstArray[0],secondArray[secondArray.length-1]};
       for(int i = 0;i<newArray.length;i++){
        System.out.print(newArray[i]+"-");
       }
       
   }
}
