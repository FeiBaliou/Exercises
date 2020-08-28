
package mypackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class PlayKino implements InterfaceKino {

  
   private static final int min = 1;
   private static final int max = 80;
   private static final Random random = new Random();
   private static int[][] kinoBoard ;
   private static int choice;
   private int drawOption;
   private int betOption;
   private int earnings;
   private Integer [] betOptions;
   private Integer [] drawOptions;
   private static  int i;  
   private static int j;
   private static int sum = 0;
   private static List<HashSet<Integer>> sets ;
   private static int odd;
   private static int even; 
   private static int countEven;
   private static int countOdd;
   private static int countDraw;
   public static Scanner in = new Scanner(System.in);

    public PlayKino() {
    }
    
    private void play(){
        printBoard();
        prediction();
        betPerDraw(in);
        consecutiveDraws();
   }

    
    private void printBoard(){
        kinoBoard = new int[8][10]; 
        System.out.println("-------------------ΚΙΝΟ Numbers Board-------------------");
        System.out.println("");
        for(i = 0; i < 8; i++){ 
        for (j = 0; j<10; j++){
            sum+= 1; 
            kinoBoard[i][j] = (sum); }
    }
        for(i = 0; i < 8; i++){
        for(j=0; j< 10;j++){
                System.out.printf("%-4d ",kinoBoard[i][j]); 
                System.out.print(" "); }
                System.out.println();
    }
        System.out.println("");
        System.out.println("--------------------------------------------------------");
        System.out.println("");
}
    
    
    private void prediction(){
        System.out.println("What will the most of the 20 Drawn numbers be?");
        System.out.println("------------------------------");
        System.out.println ("ODDS  (Odd x 2) --> Press 1\n"
                           +"EVENS (Odd x 2) --> Press 2\n"
                           +"DRAW  (Odd x 4) --> Press 3");
        System.out.println("------------------------------");
        predict();
    }
        
    private void predict(){
        if(in.hasNextInt()){
             choice =in.nextInt();
             switch(choice){
                  case 1:  choice = 1;
                  break;
                  case 2:  choice = 2;
                  break;
                  case 3:  choice = 3;
                  break;
                  default: System.out.println("Please Enter option 1, 2 or 3");   predict();
              }
                }else {System.out.println("Please Enter option 1, 2 or 3"); 
                 in.nextLine();predict();
               }
        }
    
    private void betPerDraw(Scanner in){
        System.out.println("");
        System.out.println("What is your bet ammount per draw?");
        betOptions = new Integer []{1,2,3,5,10,15,20,30,50,100};
        System.out.println("------------------------------------");
        for(int k = 0; k<betOptions.length; k++)
        {System.out.print(betOptions[k] + "€ ");}
        System.out.println("\n------------------------------------");
        selectBetPerDraw();
    }
    
    
    private void selectBetPerDraw(){
          if(in.hasNextInt()){
            betOption = in.nextInt();
            switch(betOption){
            case 1: betOption= 1;
            System.out.println("Bet for each draw: "+ betOption + "€");
            break;
            case 2: betOption = 2;
            System.out.println("Bet for each draw: "+ betOption + "€");
            break;
            case 3: betOption = 3;
            System.out.println("Bet for each draw: "+ betOption + "€");
            break;
            case 5: betOption = 5;
            System.out.println("Bet for each draw: "+ betOption + "€");
            break;
            case 10: betOption = 10;
            System.out.println("Bet for each draw: "+ betOption + "€");
            break;
            case 15: betOption = 15;
            System.out.println("Bet for each draw: "+ betOption + "€");
            break;
            case 20: betOption = 20;
            System.out.println("Bet for each draw: "+ betOption + "€");
            break;
            case 30: betOption = 30;
            System.out.println("Bet for each draw: "+ betOption + "€");
            break;
            case 50: betOption = 50;
            System.out.println("Bet for each draw: "+ betOption + "€");
            break;
            case 100: betOption = 100;
            System.out.println("Bet for each draw: "+ betOption + "€");
            break;
            default: System.out.println("Option not Valid.\n"
                                        +"Enter one of the above options"); selectBetPerDraw();
           }
           }else {System.out.println("Option not Valid.\n"
                                    +"Enter one of the above options"); in.nextLine(); selectBetPerDraw(); }
          
           }
        
    private void consecutiveDraws(){
         System.out.println("");
         System.out.println("Do you want to participate in Consecutive Draws?");
          System.out.println("*Select the ammount of consecutive draws in which you wish to participate. "
                             + "\n*If you want to participate only in the next draw, please enter 0");
         drawOptions = new Integer []{2,3,4,5,6,10,20,50,100,200};
         System.out.println("------------------------------------");
        for(int k = 0; k<drawOptions.length; k++)
        {System.out.print(drawOptions[k] + " ");}
         System.out.println("\n------------------------------------");
        
         selectDraws();
    }
    
    private void selectDraws(){
        if(in.hasNextInt()){
           drawOption = in.nextInt();
        
            switch(drawOption){
            case 0: drawOption= 1;
            System.out.println("Total Bet: "+ (betOption*drawOption) + "€");
            break;
            case 2: drawOption = 2;
            System.out.println("Total Bet: "+ (betOption*drawOption) + "€");
            break;
            case 3: drawOption = 3;
            System.out.println("Total Bet: "+ (betOption*drawOption) + "€");
            break;
            case 4: drawOption = 4;
            System.out.println("Total Bet: "+ (betOption*drawOption) + "€");
            break;
            case 5: drawOption = 5;
            System.out.println("Total Bet: "+ (betOption*drawOption) + "€");
            break;
            case 6: drawOption = 6;
            System.out.println("Total Bet: "+ (betOption*drawOption) + "€");
            break;
            case 10: drawOption = 10;
            System.out.println("Total Bet: "+ (betOption*drawOption) + "€");
            break;
            case 20: drawOption = 20;
            System.out.println("Total Bet: "+ (betOption*drawOption) + "€");
            break;
            case 200: drawOption = 200;
            System.out.println("Total Bet: "+ (betOption*drawOption) + "€");
            break;
            case 50: drawOption = 50;
            System.out.println("Total Bet: "+ (betOption*drawOption) + "€");
            break;
            case 100: drawOption = 100;
            System.out.println("Total Bet: "+ (betOption*drawOption) + "€");
            break;
            default: System.out.println("Option not Valid.\n"
                                        + "Enter one of the above options");
            selectDraws();
           }
       

          }else{System.out.println("Option not Valid.\n"
                                  + "Enter one of the above options"); in.nextLine(); selectDraws();}
    }
    
    
    @Override
    public void ShowDrawNumbers() {
        randomDraw();
        System.out.println("");
        System.out.println("-----------------------------------------------------KINO DRAWS---------------------------------------------------");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println("");
        countEven = 0;
        countDraw = 0;
        countOdd = 0;
         for (HashSet<Integer> randomNumbers : sets) {
             even = 0;
             odd = 0;
            for (Integer randomNumber : randomNumbers) {
                  System.out.printf("%-4d ",randomNumber); 
                  System.out.print("");
                  if( (randomNumber%2)==0){
                  even++;
                } else {odd++;}
           }
                if(even>odd){
             System.out.println(" --> Even Wins");
             countEven++;                                    }
             else if(even<odd){
             System.out.println(" --> Odd Wins");
             countOdd++;                                     }
             else{
             System.out.println(" --> Draw Wins");
             countDraw++;                                      }
             System.out.println("");
             System.out.println(""); 
         }
    }
    
    
    
    private void randomDraw(){
       sets= new ArrayList<>();
       for (int k = 0; k < drawOption; k++) {
        
        sets.add(new HashSet<>());
        while(sets.get(k).size()<20){
            int randomNum = random.nextInt((max - min) + 1) + min;
            sets.get(k).add(randomNum);
        }
    }
    }
    
   
    
    @Override
    public void calcEarning() {
        earnings = 0;
        switch(choice){
           case 1: earnings =(countOdd * 2 * betOption);
           System.out.println("Total Earnings: " + earnings + "€");
           break;
           case 2: earnings = (countEven *2 * betOption);
           System.out.println("Total Earnings: " + earnings + "€");
           break;
           case 3: earnings = (countDraw * 4 * betOption);
           System.out.println("Total Earnings: " + earnings + "€");
           break; 
       }
    }

   
    @Override
    public void runDraw() {
        play();
        ShowDrawNumbers();
        calcEarning();
        System.out.println("");
        System.out.println("If you wish to Bet again press 0\n"
                + "If you wish to exit press any key.");
        if(in.hasNextInt()){
        int betAgain = in.nextInt();
        if(betAgain==0)
        {System.out.println("");
        runDraw();
        }else {System.out.println("Thank you for Betting.");}
        }else{System.out.println("Thank you for your Betting.");}
  }
    
    
    
   
    
}
    






