/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
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
       
        Scanner in = new Scanner (System.in);
       
        List<BootCamp> bootcampList = new ArrayList();
        
        userInput(in,bootcampList);
        
      
       
      
    }
       
       public static void checkAvailableBootCamps(Scanner in,List<BootCamp> bootcampList){
        System.out.println("Enter a Date to check available Bootcamps");
        String checkDate = in.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate checkBootCamp = LocalDate.parse(checkDate,formatter);
        
        for (int i = 0; i < bootcampList.size(); i++){
        if (!checkBootCamp.isBefore(bootcampList.get(i).getStartingDate()) && !checkBootCamp.isAfter(bootcampList.get(i).getEndingDate()) ){
        
                System.out.println("Bootcamp " + bootcampList.get(i).getName() +
                           " will be available in " + checkBootCamp+ ". It starts " +bootcampList.get(i).getStartingDate() + " and ends " + bootcampList.get(i).getEndingDate());
        } 
          
            }
           // System.out.println("Sorry no bootcamp available in " + checkBootCamp +" date");  
           }
       
    
    

    
    public static void userInput(Scanner in,List<BootCamp> bootcampList){
        
        for (int i = 0; i < 3; i++) {
            
        
        BootCamp bootcamp = new BootCamp();
        System.out.println("Enter Title for BootCamp "+ (i+1));
        bootcamp.setName(in.next());
        System.out.println("Enter Start Date:");
        String inputDate = in.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate startDate = LocalDate.parse(inputDate,formatter);
       /// String datetoPrint = startDate.format(formatter);
        bootcamp.setStartingDate(startDate);
        System.out.println("Enter End Date:");
        String endDateInput = in.next();
        LocalDate endDate = LocalDate.parse(endDateInput,formatter);
        
        while(endDate.isBefore(startDate)){
              System.out.println("Please Enter valid Date:");
             endDate= LocalDate.parse(in.next(),formatter);}
        bootcamp.setEndingDate(endDate);
        bootcampList.add(bootcamp);
        }
         checkAvailableBootCamps(in,bootcampList);
        
        
    }
}
    

