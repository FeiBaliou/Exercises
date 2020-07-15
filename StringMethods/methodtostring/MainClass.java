/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodtostring;

public class MainClass {


    
    public static void main(String[] args) {
      
        System.out.println(subString("hellocheckolleh"));
         
    }
    
    public static String subString(String word){
    
    StringBuilder result = new StringBuilder();
    int length = word.length();
        for (int i = 0; i < (length/2); i++) {
            char symbol = word.charAt(i);
            if (symbol== word.charAt(length - (i+1)))
            {
            result.append(symbol);
            } else {
                 break;}
      
            
        } return result.toString();
    }
    
}
