/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author feiba
 */
public class BankAccount {
   private static int accountsOpened;
   private int number;
   private  double ammount;
   private double balance;
   private  String name;
   private boolean active;
   private List <String> transactions;


     Scanner in = new Scanner(System.in);
    
     public BankAccount() {
        accountsOpened++;
        transactions = new ArrayList <>();
        System.out.println("Enter BankAccount: ");
        name =in.nextLine();
        generateRandom(12);
        System.out.println("Account has been created successfully." + "\n" + "BankAccount: " + name.toUpperCase() + "," + "Account ID: " + generateRandom(12));
        transactions.add("BankAccount: " +name.toUpperCase());
        transactions.add("Account ID:" + generateRandom(12));
        active = true;
        }
    
     public BankAccount(int number, String name) {
        this();
        this.number = number;
        this.name = name;
    }

     public BankAccount(int number, double ammount, String name) {
        this(number,name);
        this.ammount = ammount;
        
    }
 
   
     public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

     public double getAmmount() {
        return ammount;
    }

     public String getName() {
        return name;
    }


     public boolean isActive() {
        return active;
    }

     public void setActive(boolean active) {
        this.active = active;
    }

     public List<String> getTransactions() {
        return transactions;
    }
     
      public static int getAccountsOpened(){ 
          return accountsOpened;
      }
      
            
     public void deposit (){
        System.out.println("Enter an ammount you would like to deposit: ");
        ammount = in.nextDouble();
        if (ammount>0) {
            balance+=ammount;
            System.out.println("Your deposit of " + ammount+ " was succesful." + "\n" + "New Balance: " + balance + "€");
        } else {
            while (ammount<=0){
            System.out.println("Enter a valid ammount:");
               ammount = in.nextDouble();
             } 
              balance+=ammount;
              System.out.println("Your deposit of " + ammount+ " was succesful." + "\n" + "New Balance: " + balance + "€");
    }
              transactions.add("Deposit:"+ "\t" + ammount + "€");
    }
        
     
     public void withdraw(){
        System.out.println("Enter an amount you would like to withdraw : ");
        ammount = in.nextDouble();
        if (ammount > 0 && balance >= ammount ) 
           { 
            balance -= ammount;
            System.out.println("The withdraw was succesful." + "New Balance:" + balance + "€");
            
        } else {
            while (ammount<0 || balance< ammount) {
                System.out.println("Transaction Failed.You don't have enough money." + "\n" + "Please enter ammount up to " + balance + "€:");
                ammount = in.nextDouble();
            }
              balance-=ammount;
              System.out.println("The withdraw was succesful." + "New Balance:" + balance + "€");
        }
              transactions.add("Withdraw:" + "\t" + ammount + "€");
        
    }
     
    
     
     public static long generateRandom(int length) {
        Random random = new Random();
        char[] digits = new char[length];
        digits[0] = (char) (random.nextInt(9) + '1');
        for (int i = 1; i < length; i++) {
            digits[i] = (char) (random.nextInt(10) + '0');
        }
        return Long.parseLong(new String(digits));
   
     }
     
}

