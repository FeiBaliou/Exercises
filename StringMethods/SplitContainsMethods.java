//     7.split(), contains()
//     Create a method that accepts a string. Use String "Computer, Laptop, Tablet". If String contains "," split it and return it. Then create a method that accepts the array and prints it.
     

import java.util.Arrays;

public class SplitContainsMethods{

    
    public static void main(String[] args) {
   
     SplitAndPrintArray("Computer, Laptop, Tablet");



}

 public static void SplitAndPrintArray(String array){
          if(array.contains(",")){
             String list[] = array.split(",");
             System.out.println(Arrays.toString(list));
            }     
         } 



}