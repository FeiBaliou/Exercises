/* Exercise 5
   Write a Java program that takes three numbers as input to calculate and print the average of the numbers. */

import java.util.Scanner;
import java.util.ArrayList;

public class AverageOfThreeNumbers {

public static void main (String[] args) { 

Scanner in = new Scanner(System.in);

ArrayList<Double> numbers = new ArrayList<Double>();
Inputs(in, numbers);  
Average(numbers);
                                       }   
public static void Average (ArrayList <Double> numbers) 
{
double sum = 0;
  for(int i=0; i < numbers.size(); i++)
    {
      sum += (numbers.get(i));
    }
      double average = sum / numbers.size();
      System.out.println("Average: " + average);
}

public static void Inputs(Scanner in, ArrayList <Double> numbers) 
{
  for (int j = 1; j < 4; j++) 
   {
       System.out.println("Enter " + j + "o number: ");
       double k = in.nextDouble();
       numbers.add(k);
   }
}

 }