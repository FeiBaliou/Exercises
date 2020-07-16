/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannerinrecursionexercise;

import java.util.Scanner;

/**
 *
 * @author feiba
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
     Scanner in = new Scanner(System.in);
     
     checkInputRange(in,0);
    }
     
     public static void checkInputRange(Scanner in,int number) {
        System.out.println("Enter a number between 1 to 10: ");
           if(in.hasNextInt()){
             number =in.nextInt();
             in.nextLine();
              if(number>=1 && number<=10){
              System.out.println("Number is valid.Thank you!");
              }else{
                  checkInputRange(in,number) ;}
                    }else{
                        System.out.println("Input not valid.");
                        in.nextLine();
                        checkInputRange(in,number);
                    
                       }
                    
     }
}
                    
       

