/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileReaderEarth;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author feiba
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        
        Scanner in = new Scanner(System.in);
        String filename = "C:\\Users\\feiba\\Documents\\javaExercises\\aJourneyToTheInteriorOfTheEarth.txt";
        FileReader fileReader = new FileReader(filename);
        BufferedReader br = new BufferedReader(fileReader);
        String line = br.readLine();
      
        
        System.out.println("Enter a Word:");
        String word = in.next();
        int x =0;
        while ((line = br.readLine())!= null){
            if(line.contains(word))
                x++;
        }
        
        
        System.out.println(word + " has founded "+ x + " times");
        
        if(x>=500){}
        
    }
    
}
